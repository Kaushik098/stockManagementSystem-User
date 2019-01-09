package com.stockManagementSystem.StockManagementSystem.dao;

import java.sql.SQLException;

import com.stockManagementSystem.StockManagementSystem.model.Customer;
import com.stockManagementSystem.StockManagementSystem.model.Order;
import com.stockManagementSystem.StockManagementSystem.model.Register;

public interface StockManagementSystem {
	
	public void customerCheck(Customer customer) throws SQLException;
	
	public void customerRegister(Register register) throws SQLException;
    
	public int getPrice(Order order) throws SQLException;
	public void placeOrder(Order order) throws SQLException;
	
	public void showProducts() throws SQLException;
	
}

