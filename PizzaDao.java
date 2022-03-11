package com.pizzamanagement.Dao;

import com.pizzamanagement.model.Pizza;

public interface PizzaDao {
	
	Pizza getPizzaById(int id);
	
	void addPizza(Pizza pizza);
	
	void updatePizza(Pizza pizza);
	
	void deletePizza(Pizza pizza);
	
	void commitTransaction();
	
	void beginTransaction();

}
