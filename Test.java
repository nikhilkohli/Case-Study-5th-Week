package com.pizzamanagement.Ui;

import com.pizzamanagement.model.Pizza;
import com.pizzamanagement.service.PizzaService;
import com.pizzamanagement.service.PizzaServiceImpl;

public class Test {

	public static void main(String[] args) {

		PizzaService service = new PizzaServiceImpl();
		
//		Adding Pizza
		
		Pizza pizza = new Pizza(108, "cheesePizza", 650, "Jaipur");
		service.addPizza(pizza);
		
//		Finding Pizza by Id
		
//		pizza = service.findPizzaByNo(108);	
//		System.out.println("Pizza No.:" +pizza.getPizzaNo());
//		System.out.println("Pizza Name :"+pizza.getPizzaType());
//		System.out.println("Pizza Price :"+pizza.getPizzaPrice());
		
		
//		Update
		
//		pizza.setPizzaNo(109);
//		pizza.setPizzaType("Cheese and Corn Pizza");
//		pizza.setPizzaPrice(550);
//		pizza.setDeliveryAdd("Sitapura,Jaipur");	
//		
//		service.updatePizza(pizza);
//		
////		Delete
//		
//		service.deletePizza(pizza);
//		System.out.println("end of program");
		
		

	}

}
