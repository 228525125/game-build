package org.cx.game.builder;

public interface IObjectBuilder<T> {

	public <T> T getInstance(Integer typeID);
}
