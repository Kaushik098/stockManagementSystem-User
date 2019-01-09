package com.stockManagementSystem.StockManagementSystem.test;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.stockManagementSystem.StockManagementSystem.impl.PlaceOrderDAO;
import com.stockManagementSystem.StockManagementSystem.impl.ProductDetailsDAO;
import com.stockManagementSystem.StockManagementSystem.model.Order;
import com.stockManagementSystem.StockManagementSystem.util.ConnectionUtil;

public class OrderTest {
        
	   public static void main(String args[]) throws SQLException{
        	 
		     Order order = new Order(); 
		     
		     Connection conn = ConnectionUtil.getConnection();
		   
		     ProductDetailsDAO details = new ProductDetailsDAO();
		     details.showProducts();
		     
		     System.out.println("Select the needed items");
		     order.setItemName("BK100");
		     
		     int qty = 4;
		     order.setQuantity(qty);
		     
		     PlaceOrderDAO price = new PlaceOrderDAO();
		     int cost = price.getPrice(order);
		     
             //System.out.print(cost);
             
		     order.setCost(cost);
		     order.setTotal(cost*qty);
             
		     PlaceOrderDAO place = new PlaceOrderDAO();
		     place.placeOrder(order);
        }
}
