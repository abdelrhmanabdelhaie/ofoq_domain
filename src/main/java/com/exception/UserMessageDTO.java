package com.exception;

public class UserMessageDTO {
	private String exceptionDetails;
	private String messageTitle;
	private String messageTitleTranslated;
	private String messageText;
	private String name;

	public UserMessageDTO(Exception exception) {
		this.exceptionDetails = exception.getCause().getCause().getMessage();
		this.messageTitle = exception.getClass().getSimpleName();
		this.messageTitleTranslated = exception.getClass().getSimpleName();
		this.messageText = exception.getMessage();
		this.name = exception.getClass().getSimpleName();
	}

	public String getExceptionDetails() {
		return exceptionDetails;
	}

	public void setExceptionDetails(String exceptionDetails) {
		this.exceptionDetails = exceptionDetails;
	}

	public String getMessageTitle() {
		return messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public String getMessageTitleTranslated() {
		return messageTitleTranslated;
	}

	public void setMessageTitleTranslated(String messageTitleTranslated) {
		this.messageTitleTranslated = messageTitleTranslated;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
