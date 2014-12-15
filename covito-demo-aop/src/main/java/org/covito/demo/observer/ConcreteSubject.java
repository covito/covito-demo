package org.covito.demo.observer;

import java.util.Enumeration;
import java.util.Vector;

public class ConcreteSubject implements Subject {

	private Vector<Observer> observersVector = new Vector<Observer>();
	
	@Override
	public void attach(Observer observer) {
		observersVector.addElement(observer);
	}

	@Override
	public void detach(Observer observer) {
		observersVector.removeElement(observer);

	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumeration =observersVector.elements();
		while (enumeration.hasMoreElements())
		{
			enumeration.nextElement().update();
		}
	}

	@Override
	public void notifyObserver(Observer observer) {
		observer.update();
	}

}
