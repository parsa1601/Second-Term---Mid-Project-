package parsa2;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Board extends Parent {
    private VBox rows = new VBox();
    private boolean enemy = false;
    public int ships = 4;
    public int money = 0;
    public int healthPoint = 0;
    ArrayList<Ship> shipsList = new ArrayList<Ship>();

    public Board(boolean enemy, EventHandler<? super MouseEvent> handler) {
        this.enemy = enemy;
        for (int y = 0; y < 15; y++) {
            HBox row = new HBox();
            for (int x = 0; x < 15; x++) {
                Cell c = new Cell(x, y, this);
                c.setOnMouseClicked(handler);
                row.getChildren().add(c);
            }
            rows.getChildren().add(row);
        }

        getChildren().add(rows);
    }

    public boolean placeShip(Ship ship, int x, int y) {
        if (canPlaceShip(ship, x, y)) {
            if (ship.type != 4) {
                int length = ship.type;

                for (int i = x; i < x + length; i++) {
                    for (int j = y; j < y + length; j++) {
                        Cell cell = getCell(i, j);
                        cell.ship = ship;
                        if (!enemy) {
                            cell.setFill(Color.BROWN);
                            cell.setStroke(Color.WHITE);
                        }
                    }
                }

                healthPoint += length * length;
            } else {
                Cell cell1 = getCell(x, y);
                cell1.ship = ship;
                if (!enemy) {
                    cell1.setFill(Color.BROWN);
                    cell1.setStroke(Color.WHITE);
                }
                Cell cell2 = getCell(x + 1, y);
                cell2.ship = ship;
                if (!enemy) {
                    cell2.setFill(Color.BROWN);
                    cell2.setStroke(Color.WHITE);
                }
                healthPoint += 2;
            }
            return true;
        }

        return false;
    }

    public Cell getCell(int x, int y) {
        return (Cell) ((HBox) rows.getChildren().get(y)).getChildren().get(x);
    }


    private boolean canPlaceShip(Ship ship, int x, int y) {
        if (ship.type != 4) {
            int length = ship.type;

            for (int i = x; i < x + length; i++) {
                for (int j = y; j < y + length; j++) {
                    if (!isValidPoint(i, j))
                        return false;

                    Cell cell = getCell(i, j);
                    if (cell.ship != null)
                        return false;

                    if (cell.wasShot)
                        return false;
                }
            }

        } else {
            if (!isValidPoint(x, y) && !isValidPoint(x + 1, y))
                return false;
            Cell cell1 = getCell(x, y);
            Cell cell2 = getCell(x + 1, y);
            if (cell1.ship != null && cell2.ship != null)
                return false;
        }

        return true;
    }

    private boolean isValidPoint(int x, int y) {
        return x >= 0 && x < 16 && y >= 0 && y < 16;
    }


    public boolean attack(int type, int x, int y) {
        int attackedZone = 0;
        if (type != 4) {
            int length = type;

            for (int i = x; i < x + length; i++) {
                for (int j = y; j < y + length; j++) {
                    Cell cell = getCell(i, j);
                    if (cell.shoot()) attackedZone++;
                }
            }
            if (attackedZone == length * length) return true;
            else return false;
        } else {
            Cell cell1 = getCell(x, y);
            Cell cell2 = getCell(x + 1, y);
            if (cell1.shoot() && cell2.shoot()) return true;
            else return false;

        }
    }
}
