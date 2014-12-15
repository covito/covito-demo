package org.covito.demo.observer;

public interface Subject {

	public void attach(Observer observer);

	public void detach(Observer observer);

	void notifyObservers();
	
	void notifyObserver(Observer observer);
}
