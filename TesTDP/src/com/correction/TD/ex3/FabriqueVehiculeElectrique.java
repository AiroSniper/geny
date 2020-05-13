package com.correction.TD.ex3;

public class FabriqueVehiculeElectrique implements FabriqueVehicule {

	@Override
	public Scooter CreateScooter() {
		// TODO Auto-generated method stub
		return new ScooterElectrique();
	}

	@Override
	public Automobile CreateAutomobile() {
		// TODO Auto-generated method stub
		return new AutomobileElectrique();
	}

}
