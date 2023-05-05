package com.coderscampus.Elizabeth_Assignment_11.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TransactionController {

@GetMapping("transactions.html")
	public String getTransactionsPage() {
	return "transactions.html";
}
}
