package org.cx.game.builder;

import org.cx.game.builder.exception.BuilderException;
import org.cx.game.builder.exception.ParseException;
import org.dom4j.Element;

public interface IParse {

	public void parse (Element el) throws ParseException, BuilderException;
}
