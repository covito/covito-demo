package org.covito.demo.observer.fan;

import org.covito.demo.observer.Observer;

public class MeimeiEatEvent implements Observer {

	@Override
	public void update() {
		System.out.println("MeimeiEatEvent");
	}

}
