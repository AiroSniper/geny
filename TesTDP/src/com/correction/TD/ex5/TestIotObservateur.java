package com.correction.TD.ex5;

public class TestIotObservateur {

	public static void main(String[] args) {

		IoT ioT = new IoT();

		IOS ios = new IOS();

		Android android = new Android();

		ioT.addObserver(ios);
		ioT.addObserver(android);

		ioT.detectionBruit();

	}

}
