package org.cx.game.builder.exception;

import org.cx.game.builder.tools.I18n;

public class BuilderException extends Exception {

	public BuilderException() {
		// TODO Auto-generated constructor stub
		super(I18n.getMessage("org.cx.game.exception.BuilderException"));
	}
	
	public BuilderException(String description) {
		// TODO Auto-generated constructor stub
		super(I18n.getMessage("org.cx.game.exception.BuilderException")+";"+I18n.getMessage(description));
	}
}
