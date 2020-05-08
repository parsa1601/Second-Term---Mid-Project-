package parsa2;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Cell extends Rectangle {
    public int x, y;
    public Ship ship = null;
    public boolean wasShot = false;
    public boolean flag = true;


    private Board board;

    public Cell(int x, int y, Board board) {
        super(18, 18);
        this.x = x;
        this.y = y;
        this.board = board;
        setFill(Color.LIGHTBLUE);
        setStroke(Color.WHITE);
    }

    public boolean shoot() {
        wasShot = true;
        setFill(Color.DARKGRAY);

        if (ship != null) {
            ship.hit();
            setFill(Color.RED);
            setStroke(Color.RED);
            if (flag) {
                board.healthPoint--;
                board.money +=30;
                flag = false;
            }
            return true;
        }

        return false;
    }
        public Board getBoard() {
        return board;
    }
}
