package State;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Maka on 17.02.2018.
 */

public class MenuState extends State {
    private Texture backgroundMenu;
    private State state;


    public MenuState(StateManager sm) {
    super(sm);
    this.backgroundMenu = new Texture("Background\\Menu.jpg");


    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        sb.begin();
        sb.draw(backgroundMenu, 0, 0, camera.viewportWidth, camera.viewportHeight);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
