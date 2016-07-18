package Main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
public class Launcher
{
    public static void main (String[] args)
    {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        
        // change configuration settings
        config.width = 800;
        config.height = 600;
        config.title = "Treasure Quest";
        
        TreasureQuestGame myProgram = new TreasureQuestGame();
        LwjglApplication launcher = new LwjglApplication( myProgram, config );
    }
}