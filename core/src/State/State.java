package State;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;


/**
 * Created by Maka on 17.10.2017.
 */

public abstract class State {
   protected OrthographicCamera camera;
   protected Vector3 mouse;
   protected StateManager sm;
   protected float oneX;
   protected float oneY;

    State(StateManager sm) {
        this.camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        this.mouse = new Vector3();
        this.sm = sm;
        this.oneX = camera.viewportWidth/100;
        this.oneY = camera.viewportWidth/100;
    }

    protected abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();
    public float getOneX() {
        return oneX;
    }
    public float getOneY() {
        return oneY;
    }
}
