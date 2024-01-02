package com.Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoAddToCart {

	public static void main(String[] args) {
		// define a map that contains the object(key--mapped to the ItemDecrition object)

		Map<Integer, ItemDecrition>itemDesc=new HashMap<>();
		//add the element in the above map
		
		itemDesc.put(1, new ItemDecrition("apple",35.9f));
		itemDesc.put(2, new ItemDecrition("orange",21.5f));
	 //add items to cart
	//define map that contains the list of items --user purchases
		Map<Integer, Integer>cart =new HashMap<>();
		cart.put(1, 10);
		cart.put(2, 20);
		//getting the total payment for the cart
		ChkOut chk =new ChkOut();
       int total=  chk.pay(itemDesc, cart);
	System.out.println("tot cost "+total);
	}
				
	}
	class ChkOut{
		public int pay(Map<Integer, ItemDecrition>itemDesc,Map<Integer, Integer> cart) {
			int totCost=0;
			//get all the entries in the cart------entrySet()

		for(Map.Entry<Integer, Integer>crt:cart.entrySet()) {
		ItemDecrition item=itemDesc.get(crt.getKey());
		totCost+=item.getUnitCost() *crt.getValue();
		
		}
		return totCost;
		}
	}
	

class ItemDecrition{
	//proprties
	//decription of item 
	private String itemsName;
	//unit cost of the item
	private float unitCost;
	//cons setter getter totstring
	public ItemDecrition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemDecrition(String itemsName, float unitCost) {
		super();
		this.itemsName = itemsName;
		this.setUnitCost(unitCost);
	}
	public float getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(float unitCost) {
		this.unitCost = unitCost;
	}
	
}