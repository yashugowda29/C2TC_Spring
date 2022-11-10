package com.cg.pm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlacementService {
	
	@Autowired
	private PlacementRepository repository;
	
	public List<Placement> listAll() {
		return repository.findAll();
	}
	
	public Placement get(Integer id) {
		return repository.findById(id).get();
	}
	
	public void save(Placement placement) {
		repository.save(placement);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
