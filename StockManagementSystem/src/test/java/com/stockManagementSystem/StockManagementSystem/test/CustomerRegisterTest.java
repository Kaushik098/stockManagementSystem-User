package com.stockManagementSystem.StockManagementSystem.test;

import java.sql.SQLException;


import java.time.LocalDate;
import java.util.UUID;

import com.stockManagementSystem.StockManagementSystem.impl.CustomerRegisterDAO;
import com.stockManagementSystem.StockManagementSystem.model.Register;

public class CustomerRegisterTest {
          
	public static void main (String args[]) throws SQLException{
		
		 Register register = new Register();
		 
		 register.setUsername("Gambir");
		 register.setPassword("Gambir98");
		 register.setAge(24);
		 register.setAddress("CAP Alert Colony");
		 register.setPincode("600034");
		 
		 LocalDate date = LocalDate.now();
		 int year = date.getYear();
		 register.setSinceFrom(year);
		 
		 String uniqueID = UUID.randomUUID().toString();
		 register.setPurchaseId(uniqueID.substring(0,6));
		 
		 CustomerRegisterDAO customerReg = new CustomerRegisterDAO();
		 customerReg.customerRegister(register);
		 
	}
}
