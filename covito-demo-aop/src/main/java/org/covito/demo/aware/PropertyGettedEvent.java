package org.covito.demo.aware;

import org.springframework.context.ApplicationEvent;

public class PropertyGettedEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PropertyGettedEvent(Object source) {
		super(source);
	}

}
