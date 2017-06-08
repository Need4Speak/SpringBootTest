package com.pancake.service;

import com.pancake.Repository.GirlRepository;
import com.pancake.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by m on 2017/6/8.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findOne(id);
        int age = Integer.valueOf(girl.getAge());
        if (age < 10) {
            throw new Exception("年龄小于10岁");
        }
        else if(age >= 10 && age < 20){
            throw new Exception("年龄大于等于10岁，但小于20岁");
        }

    }
}
