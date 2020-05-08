package parsa2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Main extends Application {

    private boolean running = false;
    private Board enemyBoard, playerBoard , enemyBoard2 , playerBoard2;
    private int shipType , shipType2;
    private boolean access = false;
    private boolean kingdomAccess = true , kingdomAttack = false;
    private int kingdom0,kingdom1,kingdom2,kingdom3,kingdom4;
    private boolean rookAccess = true , rookAttack = false;
    private int rook0,rook1,rook2,rook3;
    private boolean knightAccess = true , knightAttack = false;
    private int knight0,knight1,knight2;
    private boolean pawnAccess = true , pawnAttack = false;
    private int pawn0,pawn1;
    private int counter = 0;
    private int counter2 = 0;
    private boolean access2 = true;
    private boolean kingdomAccess2 = true , kingdomAttack2 = false;
    private int kingdom20,kingdom21,kingdom22,kingdom23,kingdom24;
    private boolean rookAccess2 = true , rookAttack2 = false;
    private int rook20,rook21,rook22,rook23;
    private boolean knightAccess2 = true , knightAttack2 = false;
    private int knight20,knight21,knight22;
    private boolean pawnAccess2 = true , pawnAttack2 = false;
    private int pawn20,pawn21;
    private boolean running2;
    boolean check = true;
    boolean buy1, buy2;
    private RightSideMenu rightSideMenuPlayer1;
    private RightSideMenu rightSideMenuPlayer2;
    private int placedRook = 0 , placedKnight = 0  , placedPawn = 0;

    private Parent createContent() throws FileNotFoundException {
        FileInputStream bckground = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/bluelight.png");
        Image bckgroungd2 = new Image(bckground);
        BackgroundImage bckground3 = new BackgroundImage(bckgroungd2,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background bckground4 = new Background(bckground3);
        BorderPane borderPane = new BorderPane();
        borderPane.setPrefSize(1200,800);
        borderPane.setBackground(bckground4);
        BorderPane root = new BorderPane();
        BorderPane root2 = new BorderPane();
        Text player1Name = new Text("(◜‿◝) Player 1 (◜‿◝) ");
        player1Name.setFill(Color.NAVY);
        player1Name.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 15));
        Text player2Name = new Text("(^‿^) Player 2 (^‿^) ");
        player2Name.setFill(Color.NAVY);
        player2Name.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 15));
        borderPane.setRight(root2);
        borderPane.setLeft(root);
        root.setPrefSize(600, 800);
        root.setVisible(true);
        root2.setPrefSize(600, 800);
        root2.setVisible(true);
        root.setRight(player1Name);
        root2.setRight(player2Name);
        FileInputStream inputStream = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/sea.jpeg");
        FileInputStream inputStream2 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/sea.jpeg");
        Image image = new Image(inputStream);
        Image image2 = new Image(inputStream2);
        BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        BackgroundImage backgroundImage2 = new BackgroundImage(image2,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background background = new Background(backgroundimage);
        Background background2 = new Background(backgroundImage2);
        root.setBackground(background);
        root2.setBackground(background2);


        rightSideMenuPlayer1 = new RightSideMenu();
        rightSideMenuPlayer2 = new RightSideMenu();


        rightSideMenuPlayer1.kingdom.setOnMouseClicked(mouseEvent -> { kingdomMove(1,1); });
        rightSideMenuPlayer1.rook.setOnMouseClicked(mouseEvent -> { rookMove(1,1); });
        rightSideMenuPlayer1.rook2.setOnMouseClicked(mouseEvent -> { rookMove(1,2); });
        rightSideMenuPlayer1.knight.setOnMouseClicked(mouseEvent -> { knightMove(1,1); });
        rightSideMenuPlayer1.knight2.setOnMouseClicked(mouseEvent -> { knightMove(1,2); });
        rightSideMenuPlayer1.knight3.setOnMouseClicked(mouseEvent -> { knightMove(1,3); });
        rightSideMenuPlayer1.pawn.setOnMouseClicked(mouseEvent -> { pawnMove(1,1); });
        rightSideMenuPlayer1.pawn2.setOnMouseClicked(mouseEvent -> { pawnMove(1,2); });
        rightSideMenuPlayer1.pawn3.setOnMouseClicked(mouseEvent -> { pawnMove(1,3); });
        rightSideMenuPlayer1.pawn4.setOnMouseClicked(mouseEvent -> { pawnMove(1,4); });
        rightSideMenuPlayer1.pawn5.setOnMouseClicked(mouseEvent -> { pawnMove(1,5); });
        rightSideMenuPlayer2.kingdom.setOnMouseClicked(mouseEvent -> { kingdomMove(2,1);});
        rightSideMenuPlayer2.rook.setOnMouseClicked(mouseEvent -> { rookMove(2,1); });
        rightSideMenuPlayer2.rook2.setOnMouseClicked(mouseEvent -> { rookMove(2,2); });
        rightSideMenuPlayer2.knight.setOnMouseClicked(mouseEvent -> { knightMove(2,1); });
        rightSideMenuPlayer2.knight2.setOnMouseClicked(mouseEvent -> { knightMove(2,2); });
        rightSideMenuPlayer2.knight3.setOnMouseClicked(mouseEvent -> { knightMove(2,3); });
        rightSideMenuPlayer2.pawn.setOnMouseClicked(mouseEvent -> { pawnMove(2,1); });
        rightSideMenuPlayer2.pawn2.setOnMouseClicked(mouseEvent -> { pawnMove(2,2); });
        rightSideMenuPlayer2.pawn3.setOnMouseClicked(mouseEvent -> { pawnMove(2,3); });
        rightSideMenuPlayer2.pawn4.setOnMouseClicked(mouseEvent -> { pawnMove(2,4); });
        rightSideMenuPlayer2.pawn5.setOnMouseClicked(mouseEvent -> { pawnMove(2,5); });

        rightSideMenuPlayer1.startGame.setOnMouseClicked(mouseEvent -> {
            rightSideMenuPlayer1.menuAfterStart();
            root.setVisible(false);
            root2.setVisible(true);
            running = true;
            kingdomAccess = true;
            rookAccess = true;
            knightAccess = true;
            pawnAccess = true;
        });
        rightSideMenuPlayer1.readyText.setOnMouseClicked(mouseEvent -> {
            rightSideMenuPlayer1.menuAfterStart();
            root.setVisible(false);
            root2.setVisible(true);
            running = true;
            kingdomAccess = true;
            rookAccess = true;
            knightAccess = true;
            pawnAccess = true;
        });
        rightSideMenuPlayer1.donePic.setOnMouseClicked(mouseEvent -> {
            rightSideMenuPlayer1.menuAfterStart();
            running = true;
            root.setVisible(false);
            root2.setVisible(true);
        });
        rightSideMenuPlayer1.shopPic.setOnMouseClicked(mouseEvent -> {
            running = false;
            buy1 = true;
            pawnAccess = (playerBoard2.money >= 50);
            knightAccess = (playerBoard2.money >= 100);
            rightSideMenuPlayer1.buyingMenu(playerBoard2.money);
        });
        rightSideMenuPlayer2.startGame.setOnMouseClicked(mouseEvent -> {
            rightSideMenuPlayer2.menuAfterStart();
            System.out.println("Game Started!");
            root.setVisible(true);
            root2.setVisible(false);
            running2 = true;
            kingdomAccess2 = true;
            rookAccess2 = true;
            knightAccess2 = true;
            pawnAccess2 = true;
        });
        rightSideMenuPlayer2.readyText.setOnMouseClicked(mouseEvent -> {
            rightSideMenuPlayer2.menuAfterStart();
            System.out.println("Game Started!");
            root.setVisible(true);
            root2.setVisible(false);
            running2 = true;
            kingdomAccess2 = true;
            rookAccess2 = true;
            knightAccess2 = true;
            pawnAccess2 = true;
        });
        rightSideMenuPlayer2.donePic.setOnMouseClicked(mouseEvent -> {
            rightSideMenuPlayer2.menuAfterStart();
            running2 = true;
            root2.setVisible(false);
            root.setVisible(true);
        });
        rightSideMenuPlayer2.shopPic.setOnMouseClicked(mouseEvent -> {
            running2 = false;
            buy2 = true;
            pawnAccess2 = (playerBoard.money >= 50);
            knightAccess2 = (playerBoard.money >= 100);
            rightSideMenuPlayer2.buyingMenu(playerBoard.money);
        });


        root.getChildren().addAll(
                rightSideMenuPlayer1.firstMenu,
                rightSideMenuPlayer1.description1,
                rightSideMenuPlayer1.description2,
                rightSideMenuPlayer1.kingdom,
                rightSideMenuPlayer1.kingdomName,
                rightSideMenuPlayer1.rook,
                rightSideMenuPlayer1.rook2,
                rightSideMenuPlayer1.rookName,
                rightSideMenuPlayer1.knight,
                rightSideMenuPlayer1.knight2,
                rightSideMenuPlayer1.knight3,
                rightSideMenuPlayer1.knightName,
                rightSideMenuPlayer1.pawn,
                rightSideMenuPlayer1.pawn2,
                rightSideMenuPlayer1.pawn3,
                rightSideMenuPlayer1.pawn4,
                rightSideMenuPlayer1.pawn5,
                rightSideMenuPlayer1.pawnName,
                rightSideMenuPlayer1.startGame,
                rightSideMenuPlayer1.readyText,
                rightSideMenuPlayer1.health40,
                rightSideMenuPlayer1.health30,
                rightSideMenuPlayer1.health20,
                rightSideMenuPlayer1.health100,
                rightSideMenuPlayer1.coinPic,
                rightSideMenuPlayer1.shopPic,
                rightSideMenuPlayer1.money,
                rightSideMenuPlayer1.donePic,
                rightSideMenuPlayer1.pawnPrice,
                rightSideMenuPlayer1.pawnPricePic,
                rightSideMenuPlayer1.knightPrice,
                rightSideMenuPlayer1.knightPricePic
        );

        root2.getChildren().addAll(
                rightSideMenuPlayer2.firstMenu,
                rightSideMenuPlayer2.description1,
                rightSideMenuPlayer2.description2,
                rightSideMenuPlayer2.kingdom,
                rightSideMenuPlayer2.kingdomName,
                rightSideMenuPlayer2.rook,
                rightSideMenuPlayer2.rook2,
                rightSideMenuPlayer2.rookName,
                rightSideMenuPlayer2.knight,
                rightSideMenuPlayer2.knight2,
                rightSideMenuPlayer2.knight3,
                rightSideMenuPlayer2.knightName,
                rightSideMenuPlayer2.pawn,
                rightSideMenuPlayer2.pawn2,
                rightSideMenuPlayer2.pawn3,
                rightSideMenuPlayer2.pawn4,
                rightSideMenuPlayer2.pawn5,
                rightSideMenuPlayer2.pawnName,
                rightSideMenuPlayer2.startGame,
                rightSideMenuPlayer2.readyText,
                rightSideMenuPlayer2.health40,
                rightSideMenuPlayer2.health30,
                rightSideMenuPlayer2.health20,
                rightSideMenuPlayer2.health100,
                rightSideMenuPlayer2.coinPic,
                rightSideMenuPlayer2.shopPic,
                rightSideMenuPlayer2.money,
                rightSideMenuPlayer2.donePic,
                rightSideMenuPlayer2.pawnPrice,
                rightSideMenuPlayer2.pawnPricePic,
                rightSideMenuPlayer2.knightPrice,
                rightSideMenuPlayer2.knightPricePic
        );


        enemyBoard = new Board(true, event -> {

            if (!kingdomAccess && !rookAccess && !knightAccess && !pawnAccess){
                counter++;
                root.setVisible(false);
                root2.setVisible(true);
            }

            if (!running)
                return;

            Cell cell;

            cell = (Cell) event.getSource();
            Cell cell1 = new Cell ( cell.x , cell.y , cell.getBoard());
            if (cell.wasShot)
                return;

            if (kingdomAttack || rookAttack || knightAttack || pawnAttack) {
                check = !playerBoard2.attack(shipType, cell.x, cell.y);

                if (shipType != 4) {
                    int length = shipType;

                    for (int i = cell.x; i < cell.x + length; i++) {
                        for (int j = cell.y; j < cell.y + length; j++) {
                            if (playerBoard2.getCell(i, j).shoot()) {
                                enemyBoard.getCell(i, j).setFill(Color.RED);
                            } else {
                                enemyBoard.getCell(i, j).setFill(Color.DARKGRAY);
                            }
                        }
                    }
                } else {
                    if (playerBoard2.getCell(cell.x, cell.y).shoot())
                        enemyBoard.getCell(cell.x, cell.y).setFill(Color.RED);
                    else
                        enemyBoard.getCell(cell.x, cell.y).setFill(Color.DARKGRAY);


                    if (playerBoard2.getCell(cell.x + 1, cell.y).shoot())
                        enemyBoard.getCell(cell.x + 1, cell.y).setFill(Color.RED);
                    else
                        enemyBoard.getCell(cell.x + 1, cell.y).setFill(Color.DARKGRAY);
                }

                if (check) {
                    root.setVisible(false);
                    root2.setVisible(true);
                } else {
                    root2.setVisible(false);
                    root.setVisible(true);
                }
                counter++;
            }



            if(kingdomAttack){
                kingdomAccess = false;
                kingdomAttack = false;
                kingdom0 = counter;
                kingdom1 = counter + 1;
                kingdom2 = counter + 2;
                kingdom3 = counter + 3;
                kingdom4 = counter + 4;
            }


            kingdomAccess = rightSideMenuPlayer1.setKingdom(counter, kingdom0 , kingdom1 , kingdom2 ,kingdom3 ,kingdom4);


            if(rookAttack){
                rookAccess = false;
                rookAttack = false;
                rook0 = counter;
                rook1 = counter + 1;
                rook2 = counter + 2;
                rook3 = counter + 3;
            }


            rookAccess = rightSideMenuPlayer1.setRook(counter, rook0 , rook1 ,rook2 ,rook3);


            if(knightAttack){
                knightAccess = false;
                knightAttack = false;
                knight0 = counter;
                knight1 = counter + 1;
                knight2 = counter + 2;
            }

            knightAccess = rightSideMenuPlayer1.setKnight(counter , knight0 , knight1 , knight2);


            if(pawnAttack){
                pawnAccess = false;
                pawnAttack = false;
                pawn0 = counter;
                pawn1 = counter + 1;
            }


            pawnAccess = rightSideMenuPlayer1.setPawn(counter , pawn0 , pawn1);


            if (playerBoard2.healthPoint == 0) {
                System.out.println("First Player Won!");
                System.exit(0);
            }
            System.out.println(playerBoard.healthPoint + " <--player1 (+HP+) player2--> " + playerBoard2.healthPoint);

            rightSideMenuPlayer1.setCoins(playerBoard2.money/3 + "");
        });

        playerBoard = new Board(false, event -> {

            if (running)
                return;

            Cell cell = (Cell) event.getSource();
            if (access) {
                if (playerBoard.placeShip(new Ship(shipType), cell.x, cell.y)) {
                    if (!kingdomAccess) {
                        rightSideMenuPlayer1.kingdom.setVisible(false);
                        rightSideMenuPlayer1.kingdomName.setFill(Color.DARKGREEN);
                    }
                    if (!rookAccess) {
                        rightSideMenuPlayer1.rook.setVisible(false);
                        rightSideMenuPlayer1.rook2.setVisible(false);
                        rightSideMenuPlayer1.rookName.setFill(Color.DARKGREEN);
                    }
                    if (!knightAccess){
                        rightSideMenuPlayer1.knight.setVisible(false);
                        rightSideMenuPlayer1.knight2.setVisible(false);
                        rightSideMenuPlayer1.knight3.setVisible(false);
                        rightSideMenuPlayer1.knightName.setFill(Color.DARKGREEN);
                    }
                    if(!pawnAccess){
                        rightSideMenuPlayer1.pawn.setVisible(false);
                        rightSideMenuPlayer1.pawn2.setVisible(false);
                        rightSideMenuPlayer1.pawn3.setVisible(false);
                        rightSideMenuPlayer1.pawn4.setVisible(false);
                        rightSideMenuPlayer1.pawn5.setVisible(false);
                        rightSideMenuPlayer1.pawnName.setFill(Color.DARKGREEN);
                    }
                    access = false;
                }
            }
        });

        enemyBoard2 = new Board(true, event -> {


            if (!kingdomAccess2 && !rookAccess2 && !knightAccess2 && !pawnAccess2){
                counter2 ++;
                root2.setVisible(false);
                root.setVisible(true);
            }


            if (!running)
                return;

            Cell cell = (Cell) event.getSource();
            Cell cell1 = new Cell ( cell.x , cell.y , cell.getBoard());
            if (cell.wasShot)
                return;

            if (kingdomAttack2 || rookAttack2 || knightAttack2 || pawnAttack2) {
                check = !playerBoard.attack(shipType2, cell.x, cell.y);


                if (shipType2 != 4) {
                    int length = shipType2;

                    for (int i = cell.x; i < cell.x + length; i++) {
                        for (int j = cell.y; j < cell.y + length; j++) {
                            if (playerBoard.getCell(i, j).shoot()) {
                                enemyBoard2.getCell(i, j).setFill(Color.RED);
                            } else {
                                enemyBoard2.getCell(i, j).setFill(Color.DARKGRAY);
                            }
                        }
                    }
                } else {
                    if (playerBoard.getCell(cell.x, cell.y).shoot())
                        enemyBoard2.getCell(cell.x, cell.y).setFill(Color.RED);
                    else
                        enemyBoard2.getCell(cell.x, cell.y).setFill(Color.DARKGRAY);


                    if (playerBoard.getCell(cell.x + 1, cell.y).shoot())
                        enemyBoard2.getCell(cell.x + 1, cell.y).setFill(Color.RED);
                    else
                        enemyBoard2.getCell(cell.x + 1, cell.y).setFill(Color.DARKGRAY);
                }

                if (check) {
                    root.setVisible(true);
                    root2.setVisible(false);
                } else {
                    root2.setVisible(true);
                    root.setVisible(false);
                }
                counter2++;
            }

            if(kingdomAttack2){
                kingdomAccess2 = false;
                kingdomAttack2 = false;
                kingdom20 = counter2;
                kingdom21 = counter2 + 1;
                kingdom22 = counter2 + 2;
                kingdom23 = counter2 + 3;
                kingdom24 = counter2 + 4;
            }


            kingdomAccess2 = rightSideMenuPlayer2.setKingdom(counter2, kingdom20 , kingdom21 , kingdom22 ,kingdom23 ,kingdom24);


            if(rookAttack2){
                rookAccess2 = false;
                rookAttack2 = false;
                rook20 = counter2;
                rook21 = counter2 + 1;
                rook22 = counter2+ 2;
                rook23 = counter2 + 3;
            }


            rookAccess2 = rightSideMenuPlayer2.setRook(counter2, rook20 , rook21 ,rook22 ,rook23);


            if(knightAttack2){
                knightAccess2 = false;
                knightAttack2 = false;
                knight20 = counter2;
                knight21 = counter2 + 1;
                knight22 = counter2 + 2;
            }

            knightAccess2 = rightSideMenuPlayer2.setKnight(counter2 , knight20 , knight21 , knight22);


            if(pawnAttack2){
                pawnAccess2 = false;
                pawnAttack2 = false;
                pawn20 = counter2;
                pawn21 = counter2 + 1;
            }

            pawnAccess2 = rightSideMenuPlayer2.setPawn(counter2 , pawn20 , pawn21);

            rightSideMenuPlayer2.setCoins(playerBoard.money/3 + "");

            if (playerBoard.healthPoint == 0) {
                System.out.println("Second Player Won!");
                System.exit(0);
            }

            System.out.println(playerBoard.healthPoint + " <--player1 (+HP+) player2--> " + playerBoard2.healthPoint);

        });

        playerBoard2 = new Board(false, event -> {

            if (running2)
                return;

            Cell cell = (Cell) event.getSource();
            if (access2) {
                if (playerBoard2.placeShip(new Ship(shipType2),  cell.x, cell.y)) {
                    if (!kingdomAccess2) {
                        rightSideMenuPlayer2.kingdom.setVisible(false);
                        rightSideMenuPlayer2.kingdomName.setFill(Color.DARKGREEN);
                    }
                    if (!rookAccess2) {
                        rightSideMenuPlayer2.rook.setVisible(false);
                        rightSideMenuPlayer2.rook2.setVisible(false);
                        rightSideMenuPlayer2.rookName.setFill(Color.DARKGREEN);
                    }
                    if (!knightAccess2){
                        rightSideMenuPlayer2.knight.setVisible(false);
                        rightSideMenuPlayer2.knight2.setVisible(false);
                        rightSideMenuPlayer2.knight3.setVisible(false);
                        rightSideMenuPlayer2.knightName.setFill(Color.DARKGREEN);
                    }
                    if(!pawnAccess2){
                        rightSideMenuPlayer2.pawn.setVisible(false);
                        rightSideMenuPlayer2.pawn2.setVisible(false);
                        rightSideMenuPlayer2.pawn3.setVisible(false);
                        rightSideMenuPlayer2.pawn4.setVisible(false);
                        rightSideMenuPlayer2.pawn5.setVisible(false);
                        rightSideMenuPlayer2.pawnName.setFill(Color.DARKGREEN);
                    }
                    access2 = false;
                }
            }
        });

        VBox v1 , v2;
        v1 = new VBox(50, enemyBoard, playerBoard);
        v2 = new VBox(50,enemyBoard2,playerBoard2);
        v1.setAlignment(Pos.CENTER);
        v2.setAlignment(Pos.CENTER);

        root.setCenter(v1);
        root2.setCenter(v2);

        if (check) root.setVisible(true);
        else root2.setVisible(false);
        return borderPane;
    }

    public void kingdomMove(int player , int number){
        if (player == 1) {
            if (kingdomAccess) {
                if (!running) {
                    access = true;
                    shipType = 3;
                    if (number == 1){
                        rightSideMenuPlayer1.kingdom.setVisible(false);
                    }
                    kingdomAccess = false;
                } else {
                    kingdomAttack = true;
                    shipType = 3;
                }
            }
        }
        if (player == 2) {
            if (kingdomAccess2) {
                if (!running2) {
                    access2 = true;
                    shipType2 = 3;
                    if (number == 1){
                        rightSideMenuPlayer2.kingdom.setVisible(false);
                    }
                    kingdomAccess2 = false;
                } else {
                    kingdomAttack2 = true;
                    shipType2 = 3;
                }
            }
        }
    }

    public void rookMove(int player, int number){
        if(player == 1) {
            if (rookAccess) {
                if (!running) {
                    access = true;
                    shipType = 2;
                    if (number == 1){
                        rightSideMenuPlayer1.rook.setVisible(false);
                    }
                    if (number == 2){
                        rightSideMenuPlayer1.rook2.setVisible(false);
                    }
                    placedRook++;
                    rookAccess = (placedRook < 2);
                } else {
                    rookAttack = true;
                    shipType = 2;
                }
            }
        }
        if (player == 2) {
            if (rookAccess2) {
                if (!running2) {
                    access2 = true;
                    shipType2 = 2;
                    if (number == 1){
                        rightSideMenuPlayer2.rook.setVisible(false);
                    }
                    if (number == 2){
                        rightSideMenuPlayer2.rook2.setVisible(false);
                    }
                    placedRook++;
                    rookAccess2 = (placedRook < 4);
                } else {
                    rookAttack2 = true;
                    shipType2 = 2;
                }
            }
        }
    }

    public void knightMove(int player, int number){
        if (player == 1) {
            if (knightAccess) {
                if (!running) {
                    access = true;
                    shipType = 4;
                    if (number == 1){
                        rightSideMenuPlayer1.knight.setVisible(false);
                    }
                    if (number == 2){
                        rightSideMenuPlayer1.knight2.setVisible(false);
                    }
                    if (number == 3){
                        rightSideMenuPlayer1.knight3.setVisible(false);
                    }
                    placedKnight++;
                    knightAccess = (placedKnight < 3);
                } else {
                    knightAttack = true;
                    shipType = 4;
                }
            }
            if (buy1){
                playerBoard2.money -= 300;
                rightSideMenuPlayer1.setCoins(playerBoard2.money/3 + "");
                rightSideMenuPlayer1.knight3.setVisible(false);
                rightSideMenuPlayer1.pawn4.setVisible(false);
                buy1 = false;

            }
        }
        if (player == 2) {
            if (knightAccess2) {
                if (!running2) {
                    access2 = true;
                    shipType2 = 4;
                    placedKnight++;
                    if (number == 1){
                        rightSideMenuPlayer2.knight.setVisible(false);
                    }
                    if (number == 2){
                        rightSideMenuPlayer2.knight2.setVisible(false);
                    }
                    if (number == 3){
                        rightSideMenuPlayer2.knight3.setVisible(false);
                    }
                    knightAccess2 = (placedKnight < 6);
                } else {
                    knightAttack2 = true;
                    shipType2 = 4;
                }
                if (buy2){
                    playerBoard.money -= 300;
                    rightSideMenuPlayer2.setCoins(playerBoard.money/3 + "");
                    rightSideMenuPlayer2.knight3.setVisible(false);
                    rightSideMenuPlayer2.pawn4.setVisible(false);
                    buy2 = false;
                }
            }
        }
    }

    public void pawnMove(int player, int number){
        if (player == 1) {
            if (pawnAccess) {
                if (!running) {
                    access = true;
                    shipType = 1;
                    placedPawn++;
                    if (number == 1){
                        rightSideMenuPlayer1.pawn.setVisible(false);
                    }
                    if (number == 2){
                        rightSideMenuPlayer1.pawn2.setVisible(false);
                    }
                    if (number == 3){
                        rightSideMenuPlayer1.pawn3.setVisible(false);
                    }
                    if (number == 4){
                        rightSideMenuPlayer1.pawn4.setVisible(false);
                    }
                    if (number == 5){
                        rightSideMenuPlayer1.pawn5.setVisible(false);
                    }
                    pawnAccess = (placedPawn < 5);
                } else {
                    pawnAttack = true;
                    shipType = 1;
                }
            }
            if (buy1){
                playerBoard2.money -= 150;
                rightSideMenuPlayer1.setCoins(playerBoard2.money/3 + "");
                rightSideMenuPlayer1.knight3.setVisible(false);
                rightSideMenuPlayer1.pawn4.setVisible(false);
                buy1 = false;
            }
        }
        if (player == 2) {
            if (pawnAccess2) {
                if (!running2) {
                    access2 = true;
                    shipType2 = 1;
                    placedPawn++;
                    if (number == 1){
                        rightSideMenuPlayer2.pawn.setVisible(false);
                    }
                    if (number == 2){
                        rightSideMenuPlayer2.pawn2.setVisible(false);
                    }
                    if (number == 3){
                        rightSideMenuPlayer2.pawn3.setVisible(false);
                    }
                    if (number == 4){
                        rightSideMenuPlayer2.pawn4.setVisible(false);
                    }
                    if (number == 5){
                        rightSideMenuPlayer2.pawn5.setVisible(false);
                    }
                    pawnAccess2 = (placedPawn < 10);
                }
                else {
                    pawnAttack2 = true;
                    shipType2 = 1;
                }
            }
            if (buy2){
                playerBoard.money -= 150;
                rightSideMenuPlayer2.setCoins(playerBoard.money/3 + "");
                rightSideMenuPlayer2.knight3.setVisible(false);
                rightSideMenuPlayer2.pawn4.setVisible(false);
                buy2 = false;
            }
        }
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage.setTitle("BattleChess!");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
