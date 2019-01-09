package com.stockManagementSystem.StockManagementSystem.impl;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.stockManagementSystem.StockManagementSystem.dao.StockManagementSystem;
import com.stockManagementSystem.StockManagementSystem.model.Customer;
import com.stockManagementSystem.StockManagementSystem.model.Order;
import com.stockManagementSystem.StockManagementSystem.model.Register;
import com.stockManagementSystem.StockManagementSystem.util.ConnectionUtil;

public class CustomerLoginDAO implements StockManagementSystem {
       
	   public void customerCheck(Customer customer) throws SQLException{
		   
		   Connection conn = ConnectionUtil.getConnection();
		   
		  // System.out.println(customer.getUsername());
		   
		   String purchaseId1 = "SELECT customer_purchase_ID FROM customer_login WHERE customer_username = ?";
		   PreparedStatement prepareUsername = conn.prepareStatement(purchaseId1);
		   prepareUsername.setString(1, customer.getUsername());   
	       ResultSet result1 = prepareUsername.executeQuery();
	       
	       String usernameid="", passwordid = "";
	       
	       while(result1.next())
	    	     usernameid = String.valueOf(result1.getString(1));
	       
	       
	       String purchaseId2 = "SELECT customer_purchase_ID FROM customer_login WHERE customer_password = ?";
		   PreparedStatement preparePassword = conn.prepareStatement(purchaseId2);
		   preparePassword.setString(1, customer.getPassword());
           ResultSet result2 = preparePassword.executeQuery();

           while(result2.next())
        	    passwordid = String.valueOf(result2.getString(1));
           
         
          if(usernameid.equals(passwordid))
                System.out.print("Welcome "+ customer.getUsername());
        	  
           
	}

	public void customerRegister(Register register) throws SQLException {
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


//+" "+ result1.getString(2)+" "+ result1.getString(3)+" "+result1.getString(4)+" "+result1.getString(5)+" "+result1.getString(6)