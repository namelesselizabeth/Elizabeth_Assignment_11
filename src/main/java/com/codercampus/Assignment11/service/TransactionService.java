package com.codercampus.Assignment11.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Service
public class TransactionService {
	private TransactionRepository transactionRepo = new TransactionRepository();
	
	public List<Transaction> findAll() {
		List<Transaction> transactionSorted = transactionRepo.findAll();
		Collections.sort(transactionSorted, new TransactionComparator());
		return transactionSorted;
	}
	
	public Transaction findById(Long transactionId) {
		return transactionRepo.findById(transactionId);
	}
	
}
