package com.xgang.function.dao;

import com.xgang.function.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xugang
 * @date 2020/7/13 22:18
 */
public interface PersonDao extends JpaRepository<Person, Integer> {

}
