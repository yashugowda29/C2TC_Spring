package com.cg.pm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> listAll() {
		return repository.findAll();
	}
	
	public Product get(Integer id) {
		return repository.findById(id).get();
	}
	
	public void save(Product product) {
		repository.save(product);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
