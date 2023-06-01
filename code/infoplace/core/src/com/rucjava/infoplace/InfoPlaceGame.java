package com.rucjava.infoplace;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.ScreenUtils;
import com.rucjava.infoplace.RendererModule.Renderer;

public class InfoPlaceGame extends ApplicationAdapter {

	Renderer renderer;

	@Override
	public void create () {
		this.renderer = new Renderer();

	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		renderer.render();
	}
	
	@Override
	public void dispose () {
		this.renderer.dispose();
	}
}
