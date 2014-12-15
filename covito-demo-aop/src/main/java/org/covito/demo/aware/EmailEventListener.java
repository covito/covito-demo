package org.covito.demo.aware;

import org.covito.demo.aware.MailEvent.MailDO;
import org.springframework.context.ApplicationListener;

public class EmailEventListener implements ApplicationListener<MailEvent> {

	@Override
	public void onApplicationEvent(MailEvent event) {
		MailDO mail=(MailDO)event.getSource();
		System.out.println("mail:"+mail.getContent());
		//throw new RuntimeException("error!");
	}

}
