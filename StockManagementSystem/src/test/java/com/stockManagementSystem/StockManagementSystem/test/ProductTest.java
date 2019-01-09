package com.stockManagementSystem.StockManagementSystem.test;

import java.sql.SQLException;



import com.stockManagementSystem.StockManagementSystem.impl.ProductDetailsDAO;
import com.stockManagementSystem.StockManagementSystem.model.Product;

public class ProductTest {

	public static void main(String args[]) throws SQLException{
		
           ProductDetailsDAO productList = new ProductDetailsDAO();
           productList.showProducts();
           
	}
}
