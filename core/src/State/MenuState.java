package State;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;



/**
 * Created by Maka on 17.02.2018.
 */

public class MenuState extends State {
    private Texture backgroundMenu;
    private Skin skin;
    private Stage stage;
    private ImageButton playButton;

    public MenuState(final StateManager sm) {
    super(sm);
    this.stage = new Stage();
    Gdx.input.setInputProcessor(stage);
    this.skin = new Skin(Gdx.files.internal("skin\\mainskin\\FroggyFun_data\\skin.json"));
    this.backgroundMenu = new Texture("Background\\1.png");
    this.playButton = new ImageButton(skin);
    this.playButton.setSize(oneX*15,oneY*15);
    this.playButton.setPosition(oneX*10,oneY*10);














        addToStage();
        playButton.addListener( new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
             //   sm.set(new MainState(sm));
                System.out.println("Заупск игры");

            };
        });
    }




    protected void addToStage(){
        stage.addActor(playButton);

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
        stage.draw();

    }

    @Override
    public void dispose() {
        stage.dispose();
        backgroundMenu.dispose();

    }

}
