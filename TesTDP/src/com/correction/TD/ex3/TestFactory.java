package com.correction.TD.ex3;

public class TestFactory {

	FabriqueVehicule fa1 = new FabriqueVehiculeElectrique();

	FabriqueVehicule fa2 = new FabriqueVehiculeEssence();

	Automobile a1 = fa1.CreateAutomobile();
	Scooter a2 = fa2.CreateScooter();

}
