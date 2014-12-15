package org.covito.demo.aware;

import org.covito.demo.aware.MailEvent.MailDO;
import org.springframework.context.ApplicationListener;

public class SMSEventListener implements ApplicationListener<MailEvent> {

	@Override
	public void onApplicationEvent(MailEvent event) {
		MailDO mail=(MailDO)event.getSource();
		System.out.println("sms:"+mail.getContent());
	}

}
