package com.stockManagementSystem.StockManagementSystem.test;

import java.sql.SQLException;



import com.stockManagementSystem.StockManagementSystem.impl.CustomerLoginDAO;
import com.stockManagementSystem.StockManagementSystem.model.Customer;

public class CustomerLoginTest {

	public static void main(String args[]) throws SQLException{
          
		Customer customer = new Customer();
		
		customer.setUsername("Anil");
		customer.setPassword("Anil001");
		
		CustomerLoginDAO login = new CustomerLoginDAO();
		login.customerCheck(customer);
		    
	}
}
