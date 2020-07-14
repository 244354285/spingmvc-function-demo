package com.xgang.function.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author xugang
 * @date 2020/7/13 22:17
 */
@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String username;

	private Integer age;

	public Person() {
	}

	public Person(Integer id, String username, Integer age) {
		this.id = id;
		this.username = username;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", username='" + username + '\'' +
				", age=" + age +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
