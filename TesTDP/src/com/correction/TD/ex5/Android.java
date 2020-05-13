package com.correction.TD.ex5;

import java.util.Observable;
import java.util.Observer;

public class Android implements Observer {

	@Override
	public void update(Observable o, Object arg) {

		if (o instanceof IoT) {

			System.out.println("Android: Notification recu de IOT");

		}

	}

}
