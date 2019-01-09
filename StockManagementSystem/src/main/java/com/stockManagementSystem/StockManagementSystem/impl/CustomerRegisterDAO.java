package com.stockManagementSystem.StockManagementSystem.impl;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.stockManagementSystem.StockManagementSystem.dao.StockManagementSystem;
import com.stockManagementSystem.StockManagementSystem.model.Customer;
import com.stockManagementSystem.StockManagementSystem.model.Order;
import com.stockManagementSystem.StockManagementSystem.model.Register;
import com.stockManagementSystem.StockManagementSystem.util.ConnectionUtil;

public class CustomerRegisterDAO implements StockManagementSystem {

	public void customerRegister(Register register) throws SQLException{
		
		Connection conn = ConnectionUtil.getConnection();
		
		System.out.println("Welcome to Registration Page");
		String insertCustomer = "Insert into customer_login (customer_username, customer_password, customer_age, customer_since_from, customer_purchase_id, customer_address, customer_pincode)"
                                +"values (?,?,?,?,?,?,?)";
		
		PreparedStatement prepareRegister = conn.prepareStatement(insertCustomer);
		
		prepareRegister.setString(1, register.getUsername());
		prepareRegister.setString(2, register.getPassword());
		prepareRegister.setInt(3,register.getAge());
		prepareRegister.setInt(4, register.getSinceFrom());
		prepareRegister.setString(5, register.getPurchaseId());
		prepareRegister.setString(6,register.getAddress());
		prepareRegister.setString(7, register.getPincode());
		
		int result = prepareRegister.executeUpdate();
		
		System.out.print(result+" Affected");
		
	}

	public void customerCheck(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getPrice(Order order) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void placeOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	public void showProducts() {
		// TODO Auto-generated method stub
		
	}

	
}
