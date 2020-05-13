package com.correction.TD.ex5;

import java.util.Observable;
import java.util.Observer;

public class IOS implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof IoT) {
			
			System.out.println("IOS: Notification recu de IOT");
			
		}
		
		
	}

}
