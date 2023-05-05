package com.codercampus.Assignment11.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Controller
public class TransactionController {
	
@Autowired
private TransactionRepository transactionRepo;

@GetMapping("/transactions")
	public String getTransactionsPage(ModelMap model) {
	
	List<Transaction> transactions = transactionRepo.findAll();
	model.put("transactions", transactions);
	
	return "transactions";
}

@GetMapping("/transactions/{transactionId}") 
	public String getTransactionId(@PathVariable int transactionId, ModelMap model) {
		Transaction transaction = transactionRepo.findById(transactionId);
		model.put("transaction", transaction);
		return "transaction";
}
}
