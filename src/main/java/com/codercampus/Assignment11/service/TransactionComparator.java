package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;

public class TransactionComparator implements java.util.Comparator<Transaction>{

	@Override
	public int compare(Transaction o1, Transaction o2) {
		
		return o1.getDate().compareTo(o2.getDate());
	}
	
}
