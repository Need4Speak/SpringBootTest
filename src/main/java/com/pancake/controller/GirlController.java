package com.pancake.controller;

import com.pancake.Repository.GirlRepository;
import com.pancake.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by m on 2017/6/7.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @GetMapping(value = "/girlList")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    @PostMapping(value = "/girlList")
    Girl girlAdd(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        girl.setAge(girl.getAge());
        girl.setSize(girl.getSize());
        return girlRepository.save(girl);
    }

    @GetMapping(value = "/girlList/{id}")
    public Girl findById(@PathVariable Integer id){
        return girlRepository.findOne(id);
    }

    @PutMapping(value = "/girlList/{id}")
    public Girl updateById(@PathVariable Integer id, @RequestParam("age") String age, @RequestParam("size") Integer size){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setSize(size);
        return girlRepository.save(girl);
    }

    @DeleteMapping(value = "/girlList/{id}")
    public void deleteById(@PathVariable Integer id){
        girlRepository.delete(id);
    }
}
