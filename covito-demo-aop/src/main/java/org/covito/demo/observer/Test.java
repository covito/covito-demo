package org.covito.demo.observer;

public class Test {

	public static void main(String[] args) {
		ConcreteSubject cs=new ConcreteSubject();
		cs.attach(new ConcreteObserver());
		cs.notifyObservers();
	}
}
