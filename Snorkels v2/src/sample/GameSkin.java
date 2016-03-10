package sample;

import javafx.scene.layout.VBox;

/**
 * Created by Solln on 10/03/16.
 */
class GameSkin extends VBox {
    GameSkin(GameManager gameManager, Game game) {
        getChildren().addAll(
                game.getBoard().getSkin(),
                new StatusIndicator(game),
                new GameControls(gameManager, game)
        );
    }
}
