package com.froggyfun;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import State.MenuState;
import State.StateManager;

public class FroggyFun extends ApplicationAdapter {
	public static final String TITLE = "FroggyFun";
	private SpriteBatch batch;
	private StateManager sm;
	
	@Override
	public void create () {
		Gdx.gl.glClearColor(1.0f, 0, 0, 0);
		batch = new SpriteBatch();
		sm = new StateManager();
		sm.push(new MenuState(sm));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sm.update(Gdx.graphics.getDeltaTime());
		sm.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}
}
