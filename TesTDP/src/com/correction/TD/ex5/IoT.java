package com.correction.TD.ex5;

import java.util.Observable;

public class IoT extends Observable {

	public void detectionBruit() {
		this.setChanged();
		this.notifyObservers();
	}

}
