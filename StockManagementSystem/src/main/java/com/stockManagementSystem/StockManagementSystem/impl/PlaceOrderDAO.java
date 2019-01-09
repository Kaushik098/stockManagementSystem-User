package com.stockManagementSystem.StockManagementSystem.impl;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.stockManagementSystem.StockManagementSystem.dao.StockManagementSystem;
import com.stockManagementSystem.StockManagementSystem.model.Customer;
import com.stockManagementSystem.StockManagementSystem.model.Order;
import com.stockManagementSystem.StockManagementSystem.model.Register;
import com.stockManagementSystem.StockManagementSystem.util.ConnectionUtil;

public class PlaceOrderDAO implements StockManagementSystem{

	public int getPrice(Order order) throws SQLException{
		
		Connection conn = ConnectionUtil.getConnection();
		
		 String bookCost = "Select product_price from product_sms where product_id = ?";
         PreparedStatement prepareCost = conn.prepareStatement(bookCost);
	     prepareCost.setString(1, order.getItemName());
         
	     ResultSet result = prepareCost.executeQuery();
         
	     int value=0;
	     while(result.next())
	    	      value = Integer.parseInt(String.valueOf(result.getString(1)));
		
	     return value;
	}
	
	public void placeOrder(Order order) throws SQLException{
		
		Connection conn = ConnectionUtil.getConnection();
        
		int stock = 0;
		String qty = "Select product_stock from product_sms where product_id = ?";
		PreparedStatement prepareStock = conn.prepareStatement(qty);
		prepareStock.setString(1, order.getItemName());
		ResultSet resultStock = prepareStock.executeQuery();
		
		while(resultStock.next())
			   stock = Integer.parseInt(String.valueOf(resultStock.getString(1)));

			
		
		int totalQuantity = stock - order.getQuantity();
	
		if(totalQuantity > 0){	
		String updateOrder = "Update product_sms set product_stock = ? where product_id = ?";
		PreparedStatement prepareOrder = conn.prepareStatement(updateOrder);
	    
		prepareOrder.setInt(1, totalQuantity);
	    prepareOrder.setString(2, order.getItemName());
	    
        int resultOrder = prepareOrder.executeUpdate();
        
        System.out.print(resultOrder+" updated");
	   }
	  else{
	     System.out.println("Only "+ stock + " stock is avaialable" );	
	  }
	
	}

	public void customerCheck(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void customerRegister(Register register) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void showProducts() {
		// TODO Auto-generated method stub
		
	}

}
