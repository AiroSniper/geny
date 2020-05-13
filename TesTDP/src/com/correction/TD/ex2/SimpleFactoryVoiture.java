package com.correction.TD.ex2;

public class SimpleFactoryVoiture {

	public static Voiture CreerVoiture(int budget) {
		if (budget < 10000)
			return new Fiat();
		if ((budget > 10000) && (budget < 19999))
			return new Peugeot();
		if (budget > 20000)
			return new Audi();
		return null;

	}

}
