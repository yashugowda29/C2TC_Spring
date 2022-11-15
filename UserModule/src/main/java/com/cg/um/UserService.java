package com.cg.um;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> listAll() {
		return repository.findAll();
	}
	
	public User get(Integer id) {
		return repository.findById(id).get();
	}
	
	public void save(User user) {
		repository.save(user);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}


}
