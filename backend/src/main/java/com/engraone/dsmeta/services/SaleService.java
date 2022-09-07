package com.engraone.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engraone.dsmeta.entities.Sale;
import com.engraone.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
  
	@Autowired
	private SaleRepository repository;
	public List<Sale> findSales() {
	  return repository.findAll();
  }
}
