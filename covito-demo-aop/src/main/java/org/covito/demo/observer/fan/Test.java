package org.covito.demo.observer.fan;

import org.covito.demo.observer.ConcreteObserver;
import org.covito.demo.observer.ConcreteSubject;

public class Test {

	public static void main(String[] args) {
		ConcreteSubject cs=new ConcreteSubject();
//		cs.attach(new GegeEatEvent());
//		cs.attach(new MeimeiEatEvent());
//		cs.notifyObservers();
		
		cs.notifyObserver(new GegeEatEvent());
		cs.notifyObserver(new MeimeiEatEvent());
	}
}
