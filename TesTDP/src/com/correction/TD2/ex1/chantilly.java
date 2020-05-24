package com.correction.TD2.ex1;


public class chantilly extends DecoratorDessert{
	public chantilly(Dessert dess) {
		this.dessert=dess;
	    this.setPrix(getPrix()+ 10);
	}
	

}
