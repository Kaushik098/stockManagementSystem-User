package com.stockManagementSystem.StockManagementSystem.model;

public class Order {

	 private String itemName;
	 private int quantity;
	 private int cost;
	 private int total;
	
	 public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Order [itemName=" + itemName + ", quantity=" + quantity + ", cost=" + cost + ", total=" + total + "]";
	}
	 
	 
}
