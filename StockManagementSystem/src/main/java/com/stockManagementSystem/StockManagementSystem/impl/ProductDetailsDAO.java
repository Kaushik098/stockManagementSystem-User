package com.stockManagementSystem.StockManagementSystem.impl;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.stockManagementSystem.StockManagementSystem.dao.StockManagementSystem;
import com.stockManagementSystem.StockManagementSystem.model.Customer;
import com.stockManagementSystem.StockManagementSystem.model.Order;
import com.stockManagementSystem.StockManagementSystem.model.Product;
import com.stockManagementSystem.StockManagementSystem.model.Register;
import com.stockManagementSystem.StockManagementSystem.util.ConnectionUtil;

public class ProductDetailsDAO implements StockManagementSystem{
	
	   Product product = new Product();

	   Connection conn = ConnectionUtil.getConnection();
	   
	   public void showProducts() throws SQLException{
		       
		   String products = "Select * from product_sms";
		   PreparedStatement prepareProducts = conn.prepareStatement(products);
		   ResultSet resultProducts = prepareProducts.executeQuery();
		  
		   
		   while(resultProducts.next()){
			    product.setBookId(resultProducts.getString(1));
			    product.setBookName(resultProducts.getString(2));
			    product.setBookDescription(resultProducts.getString(3));
			    int cost = Integer.parseInt(String.valueOf(resultProducts.getString(4)));
			    product.setBookPrice(cost);
			    int stock = Integer.parseInt(String.valueOf(resultProducts.getString(5)));
			    product.setBookStock(stock);
	           
			    System.out.println( product.toString());    
		   }
			   //System.out.println(resultProducts.getString(1)+" "+resultProducts.getString(2)+" "+resultProducts.getString(3)+" "+resultProducts.getString(4)+" "+resultProducts.getString(5));
		   
	   }

	public void customerCheck(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void customerRegister(Register register) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getPrice(Order order) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void placeOrder(Order order) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	   
}
