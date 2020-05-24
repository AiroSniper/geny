package com.correction.TD2.ex1;


public class chocolat extends DecoratorDessert{

	public chocolat(Dessert dess) {
		this.dessert=dess;
	    this.setPrix(getPrix()+ 15);
	}
	

}
