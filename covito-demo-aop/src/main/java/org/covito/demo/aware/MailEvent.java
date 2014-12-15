package org.covito.demo.aware;

import org.springframework.context.ApplicationEvent;

public class MailEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MailEvent(MailDO source) {
		super(source);
	}

	public static class MailDO{
		private String subject;
		private String content;
		/**
		 * @return the subject
		 */
		public String getSubject() {
			return subject;
		}
		/**
		 * @param subject the subject to set
		 */
		public void setSubject(String subject) {
			this.subject = subject;
		}
		/**
		 * @return the content
		 */
		public String getContent() {
			return content;
		}
		/**
		 * @param content the content to set
		 */
		public void setContent(String content) {
			this.content = content;
		}
		
	}
}
