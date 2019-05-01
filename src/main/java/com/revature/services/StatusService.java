package com.revature.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.revature.models.Status;

@Service
public interface StatusService {
	public List<Status> findAll();

	Optional<Status> findById(int id);
}
