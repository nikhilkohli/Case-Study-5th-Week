package com.pizzamanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pizzaex")
public class Pizza {
	
	@Id
	private int pizzaNo;
	@Column(length=15)
	private String pizzaType;
	private int pizzaPrice;
	@Column(length=15)
	private String DeliveryAdd;
	
	public Pizza() {
		
		// TODO Auto-generated constructor stub
	}

	public Pizza(int pizzaNo, String pizzaType, int pizzaPrice, String deliveryAdd) {
		super();
		this.pizzaNo = pizzaNo;
		this.pizzaType = pizzaType;
		this.pizzaPrice = pizzaPrice;
		DeliveryAdd = deliveryAdd;
	}

	public int getPizzaNo() {
		return pizzaNo;
	}

	public void setPizzaNo(int pizzaNo) {
		this.pizzaNo = pizzaNo;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public int getPizzaPrice() {
		return pizzaPrice;
	}

	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}

	public String getDeliveryAdd() {
		return DeliveryAdd;
	}

	public void setDeliveryAdd(String deliveryAdd) {
		DeliveryAdd = deliveryAdd;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaNo=" + pizzaNo + ", pizzaType=" + pizzaType + ", pizzaPrice=" + pizzaPrice
				+ ", DeliveryAdd=" + DeliveryAdd + "]";
	}
	
	
	
	
	

}
