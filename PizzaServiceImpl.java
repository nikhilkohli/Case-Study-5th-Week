package com.pizzamanagement.service;

import com.pizzamanagement.Dao.PizzaDao;
import com.pizzamanagement.Dao.PizzaDaoImpl;
import com.pizzamanagement.model.Pizza;

public class PizzaServiceImpl implements PizzaService {
	
	private PizzaDao dao;
	
	public PizzaServiceImpl() {
		
		dao = new PizzaDaoImpl();
	}

	@Override
	public void addPizza(Pizza pizza) {
		dao.beginTransaction();
        dao.addPizza(pizza);
        dao.commitTransaction();
		
	}

	@Override
	public void updatePizza(Pizza pizza) {
		dao.beginTransaction();
        dao.updatePizza(pizza);
        dao.commitTransaction();
		
	}

	@Override
	public void deletePizza(Pizza pizza) {
		dao.beginTransaction();
        dao.deletePizza(pizza);
        dao.commitTransaction();
		
	}

	@Override
	public Pizza findPizzaByNo(int id) {
		Pizza pizza = dao.getPizzaById(id);
		return null;
	}

}
