package com.xgang.function.handler;

import com.xgang.function.dao.PersonDao;
import com.xgang.function.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.List;

import static org.springframework.web.servlet.function.ServerResponse.ok;

/**
 * @author xugang
 * @date 2020/7/13 22:21
 */
@Component
public class PersonHandler {

	private final PersonDao personDao;

	public PersonHandler(PersonDao personDao) {
		this.personDao = personDao;
	}

	public ServerResponse list(ServerRequest request) {
		List<Person> list = personDao.findAll();
		return ok().contentType(MediaType.APPLICATION_JSON).body(list);
	}

	public ServerResponse get(ServerRequest request) {
		Person person = personDao.findById(Integer.valueOf(request.pathVariable("id"))).orElse(new Person());
		return ok().contentType(MediaType.APPLICATION_JSON).body(person);
	}
}

