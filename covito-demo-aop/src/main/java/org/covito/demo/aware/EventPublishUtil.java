package org.covito.demo.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;

public class EventPublishUtil implements ApplicationContextAware {

	private static ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		EventPublishUtil.context=context;
	}
	
	public static void publishEvent(ApplicationEvent event){
		context.publishEvent(event);
	}
	
}
