package racinggame;

public class Application {
    public static void main(String[] args) {
        RacingGameController controller = new RacingGameController();
        if(controller.getUserInput()) {
            controller.startGame();
            controller.setView();
        }
    }
}
