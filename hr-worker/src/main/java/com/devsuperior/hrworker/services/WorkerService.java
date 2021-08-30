package com.devsuperior.hrworker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {
		
	@Autowired
	private WorkerRepository workerRepository;
	
	public Worker findById(@PathVariable Long id) {
		Worker objWorker = workerRepository.findById(id).get();
		return objWorker;
	}

	public List<Worker> findAll(){
		List<Worker> lstWorker = workerRepository.findAll();
		return lstWorker;
	}
}
