package higame;

public class Game {
    public static void main(String[] args) {
        Controller controller = new Controller(true);

        controller.gameLoop();
    }
}