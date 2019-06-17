package org.cx.game.builder;

import org.cx.game.builder.exception.BuilderException;

public interface IBuilder {

	public Object builder() throws BuilderException;
}
