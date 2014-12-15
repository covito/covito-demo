package org.covito.demo.aware;

import org.springframework.context.ApplicationListener;

public class PropertyGettedListener implements ApplicationListener<PropertyGettedEvent> {

	@Override
	public void onApplicationEvent(PropertyGettedEvent event) {
		
		System.out.println(event.getSource());
	}

}
