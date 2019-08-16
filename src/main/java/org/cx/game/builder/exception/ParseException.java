package org.cx.game.builder.exception;

import org.cx.game.builder.tools.I18n;

public class ParseException extends Exception {

	public ParseException() {
		// TODO Auto-generated constructor stub
		super(I18n.getMessage("org.cx.game.builder.exception.ParseException"));
	}
	
	public ParseException(String description) {
		// TODO Auto-generated constructor stub
		super(I18n.getMessage(description));
	}
}
