package com.pancake.Repository;

import com.pancake.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by m on 2017/6/7.
 */
public interface GirlRepository extends JpaRepository<Girl, Integer>{

    public List<Girl> findAllByAge(String age);
}
