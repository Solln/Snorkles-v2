package sample;

import javafx.scene.Scene;

/**
 * Created by Solln on 10/03/16.
 */
class GameManager {
    private Scene gameScene;
    private Game  game;

    GameManager() {
        newGame();
    }

    public void newGame() {
        game = new Game(this);

        if (gameScene == null) {
            gameScene = new Scene(game.getSkin());
        } else {
            gameScene.setRoot(game.getSkin());
        }
    }

    public void quit() {
        gameScene.getWindow().hide();
    }

    public Game getGame() {
        return game;
    }

    public Scene getGameScene() {
        return gameScene;
    }
}
