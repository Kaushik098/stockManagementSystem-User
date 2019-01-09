package com.stockManagementSystem.StockManagementSystem.test;

import com.stockManagementSystem.StockManagementSystem.util.ConnectionUtil;

public class ConnectionUtilTest {

	public static void main(String args[]){
		
		 ConnectionUtil checkConnection = new ConnectionUtil();
		 checkConnection.getConnection();
		 
		// System.out.print(checkConnection);
	}
}
