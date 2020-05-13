package com.correction.TD.ex3;

public class FabriqueVehiculeEssence implements FabriqueVehicule {

	@Override
	public Scooter CreateScooter() {
		// TODO Auto-generated method stub
		return new ScooterEssence();
	}

	@Override
	public Automobile CreateAutomobile() {
		// TODO Auto-generated method stub
		return new AutomobileEssence();
	}

}
