package org.covito.demo.aware;

import org.covito.demo.aware.MailEvent.MailDO;

public class HelloBean  {

	private String helloWord;

	public void setHelloWord(String helloWord) {
		this.helloWord = helloWord;
	}

	public String getHelloWord() {

		PropertyGettedEvent pe=new PropertyGettedEvent("[" + helloWord + "] is getted");
		
		MailDO md=new MailDO();
		md.setContent(helloWord);
		MailEvent me=new MailEvent(md);
		
		
		EventPublishUtil.publishEvent(pe);
		EventPublishUtil.publishEvent(me);
		
		return helloWord;
	}

}
