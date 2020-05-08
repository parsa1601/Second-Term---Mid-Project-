package parsa2;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RightSideMenu {
    Rectangle firstMenu = new Rectangle(400,144,180,350);
    Rectangle kingdom = new Rectangle(520,180,50,50);
    Rectangle rook = new Rectangle(520,238,50,50);
    Rectangle rook2 = new Rectangle(464,238,50,50);
    Rectangle knight = new Rectangle(520,300,50,25);
    Rectangle knight2 = new Rectangle(464,300,50,25);
    Rectangle knight3 = new Rectangle(520,330,50,25);
    Rectangle pawn = new Rectangle(545,370,25,25);
    Rectangle pawn2 = new Rectangle(516,370,25,25);
    Rectangle pawn3 = new Rectangle(516,399,25,25);
    Rectangle pawn4 = new Rectangle(545,399,25,25);
    Rectangle pawn5 = new Rectangle(485,399,25,25);
    Rectangle startGame = new Rectangle(435,440,110,50);
    FileInputStream inputStream;
    Text description1 = new Text("Select Your Piece ");
    Text description2 = new Text("Then Select Where You Want To Place It!");
    Text kingdomName = new Text("Kingdom");
    Text rookName = new Text("Rook");
    Text knightName = new Text("Knight");
    Text pawnName = new Text("Pawn");
    Text readyText = new Text("    Ready!");
    FileInputStream health1,health2,health3,health4,health5,health6,health7,health8,health9,health10,health11,health12,health13,health14;
    Image healthImg1,healthImg2,healthImg3,healthImg4,healthImg5,healthImg6,healthImg7,healthImg8,healthImg9,healthImg10,healthImg11,healthImg12,healthImg13,healthImg14;
    Rectangle health40 = new Rectangle(420,218,80,20);
    Rectangle health30 = new Rectangle(420,278,60,20);
    Rectangle health20 = new Rectangle(420,345,40,20);
    Rectangle health100 = new Rectangle(420,415,20,20);
    FileInputStream coinLink;
    Image coin;
    Rectangle coinPic = new Rectangle(485,440,30,30);
    Text money;
    FileInputStream shopLink;
    Image shop;
    Rectangle shopPic = new Rectangle(542,440,30,30);
    FileInputStream doneLink;
    Image done;
    Rectangle donePic = new Rectangle(542,440,30,30);
    Rectangle pawnPricePic = new Rectangle(436,408,25,25);
    Text pawnPrice = new Text("50");
    Rectangle knightPricePic = new Rectangle(446,338,25,25);
    Text knightPrice = new Text("100");


    public RightSideMenu() throws FileNotFoundException {
        firstMenu.setFill(Color.LIGHTGRAY);
        description1.setFill(Color.BLACK);
        description2.setFill(Color.BLACK);
        description1.setX(455);
        description2.setX(410);
        description1.setY(160);
        description2.setY(170);
        description1.setFont(Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 7));
        description2.setFont(Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 6.75));
        inputStream = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/3X3.png");
        Image img = new Image(inputStream);
        kingdom.setFill(new ImagePattern(img));
        kingdomName.setFill(Color.BLACK);
        kingdomName.setX(420);
        kingdomName.setY(211);
        kingdomName.setFont(Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 11));
        inputStream = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/2X2.png");
        img = new Image(inputStream);
        rook.setFill(new ImagePattern(img));
        rook2.setFill(new ImagePattern(img));
        rookName.setFill(Color.BLACK);
        rookName.setX(420);
        rookName.setY(269);
        rookName.setFont(Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 11));
        inputStream = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/2X1.png");
        img = new Image(inputStream);
        knight.setFill(new ImagePattern(img));
        knight2.setFill(new ImagePattern(img));
        knight3.setFill(new ImagePattern(img));
        knightName.setFill(Color.BLACK);
        knightName.setX(420);
        knightName.setY(340);
        knightName.setFont(Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 11));
        inputStream = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/1X1.png");
        img = new Image(inputStream);
        pawn.setFill(new ImagePattern(img));
        pawn2.setFill(new ImagePattern(img));
        pawn3.setFill(new ImagePattern(img));
        pawn4.setFill(new ImagePattern(img));
        pawn5.setFill(new ImagePattern(img));
        pawnName.setFill(Color.BLACK);
        pawnName.setX(420);
        pawnName.setY(410);
        pawnName.setFont(Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 11));
        startGame.setFill(Color.GREEN);
        readyText.setFill(Color.BLACK);
        readyText.setX(440);
        readyText.setY(470);
        readyText.setFont(Font.font("Helvetica", FontWeight.BOLD, FontPosture.REGULAR, 15));
        health1 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/0000.png");
        healthImg1 = new Image(health1);
        health2 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/1111.png");
        healthImg2 = new Image(health2);
        health3 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/2222.png");
        healthImg3 = new Image(health3);
        health4 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/3333.png");
        healthImg4 = new Image(health4);
        health5 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/4444.png");
        healthImg5 = new Image(health5);
        health6 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/000.png");
        healthImg6 = new Image(health6);
        health7 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/111.png");
        healthImg7 = new Image(health7);
        health8 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/222.png");
        healthImg8 = new Image(health8);
        health9 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/333.png");
        healthImg9 = new Image(health9);
        health10 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/00.png");
        healthImg10 = new Image(health10);
        health11 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/11.png");
        healthImg11 = new Image(health11);
        health12 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/22.png");
        healthImg12 = new Image(health12);
        health13 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/0.png");
        healthImg13 = new Image(health13);
        health14 = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/1.png");
        healthImg14 = new Image(health14);
        health40.setFill(new ImagePattern(healthImg5));
        health40.setVisible(false);
        health30.setFill(new ImagePattern(healthImg9));
        health30.setVisible(false);
        health20.setFill(new ImagePattern(healthImg12));
        health20.setVisible(false);
        health100.setFill(new ImagePattern(healthImg14));
        health100.setVisible(false);
        coinLink = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/coin.png");
        coin = new Image(coinLink);
        coinPic.setFill(new ImagePattern(coin));
        coinPic.setVisible(false);
        shopLink = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/shop.png");
        shop = new Image(shopLink);
        shopPic.setFill(new ImagePattern(shop));
        shopPic.setVisible(false);
        money = new Text ("0");
        money.setX(515);
        money.setY(460);
        money.setVisible(false);
        doneLink = new FileInputStream("/home/parsa/IdeaProjects/untitled/src/parsa2/done.png");
        done = new Image(doneLink);
        donePic.setFill(new ImagePattern(done));
        donePic.setVisible(false);
        pawnPrice.setFill(Color.BLACK);
        pawnPrice.setX(420);
        pawnPrice.setY(425);
        pawnPrice.setVisible(false);
        pawnPricePic.setFill(new ImagePattern(coin));
        pawnPricePic.setVisible(false);
        knightPrice.setFill(Color.BLACK);
        knightPrice.setX(420);
        knightPrice.setY(355);
        knightPrice.setVisible(false);
        knightPricePic.setFill(new ImagePattern(coin));
        knightPricePic.setVisible(false);
    }
    public void menuAfterStart(){
        description1.setVisible(false);
        description2.setVisible(false);
        kingdom.setVisible(true);
        kingdomName.setFill(Color.BLACK);
        kingdomName.setVisible(true);
        rook.setVisible(true);
        rook2.setVisible(false);
        rookName.setFill(Color.BLACK);
        rookName.setVisible(true);
        knight.setVisible(false);
        knight2.setVisible(false);
        knight3.setVisible(true);
        knightName.setFill(Color.BLACK);
        knightName.setVisible(true);
        pawn.setVisible(false);
        pawn2.setVisible(false);
        pawn3.setVisible(false);
        pawn4.setVisible(true);
        pawn5.setVisible(false);
        pawnName.setFill(Color.BLACK);
        pawnName.setVisible(true);
        startGame.setVisible(false);
        readyText.setVisible(false);
        health40.setVisible(true);
        health30.setVisible(true);
        health20.setVisible(true);
        health100.setVisible(true);
        coinPic.setVisible(true);
        shopPic.setVisible(true);
        money.setVisible(true);
        donePic.setVisible(false);
        pawnPrice.setVisible(false);
        knightPrice.setVisible(false);
        description1.setText("If You Are Not Able To Choose A ShIp" + "\n" + "    Just Click On The Enemy Board!");
        description1.setX(420);
        description1.setVisible(true);
        knightPricePic.setVisible(false);
        pawnPricePic.setVisible(false);
    }
    public void buyingMenu(int money){
        health40.setVisible(false);
        health30.setVisible(false);
        health20.setVisible(false);
        health100.setVisible(false);
        shopPic.setVisible(false);
        kingdom.setVisible(false);
        kingdomName.setVisible(false);
        rook.setVisible(false);
        rookName.setVisible(false);
        knight3.setVisible(false);
        knightName.setVisible(false);
        pawn4.setVisible(false);
        pawnName.setVisible(false);
        donePic.setVisible(true);
        if (money/3 >= 50){
            pawn4.setVisible(true);
            pawnName.setVisible(true);
            pawnPrice.setVisible(true);
            pawnPricePic.setVisible(true);
            if(money/3 >= 100){
                knight3.setVisible(true);
                knightName.setVisible(true);
                knightPrice.setFill(Color.BLACK);
                knightPrice.setVisible(true);
                knightPricePic.setVisible(true);
            }
        }
    }
    public boolean setKingdom(int counter , int kingdom0 , int kingdom1 , int kingdom2, int kingdom3 , int kingdom4) {
        if (counter == kingdom0) {
            health40.setFill(new ImagePattern(healthImg1));
            kingdom.setVisible(false);
            return false;
        }
        if (counter == kingdom1) {
            health40.setFill(new ImagePattern(healthImg2));
            kingdom.setVisible(false);
            return false;
        }
        if (counter == kingdom2) {
            health40.setFill(new ImagePattern(healthImg3));
            kingdom.setVisible(false);
            return false;
        }
        if (counter == kingdom3) {
            health40.setFill(new ImagePattern(healthImg4));
            kingdom.setVisible(false);
            return false;
        }
        if (counter == kingdom4) {
            health40.setFill(new ImagePattern(healthImg5));
            kingdom.setVisible(true);
            return true;
        }
        kingdom.setVisible(true);
        return true;
    }
    public boolean setRook(int counter , int rook0 , int rook1, int rook2 , int rook3){
        if (counter == rook0) {
            health30.setFill(new ImagePattern(healthImg6));
            rook.setVisible(false);
            return false;
        }
        if (counter == rook1) {
            health30.setFill(new ImagePattern(healthImg7));
            rook.setVisible(false);
            return false;
        }
        if (counter == rook2) {
            health30.setFill(new ImagePattern(healthImg8));
            rook.setVisible(false);
            return false;
        }
        if (counter == rook3) {
            health30.setFill(new ImagePattern(healthImg9));
            rook.setVisible(true);
            return true;
        }
        rook.setVisible(true);
        return true;
    }
    public boolean setKnight(int counter, int knight0 , int knight1 , int knight2){
        if (counter == knight0) {
            health20.setFill(new ImagePattern(healthImg10));
            knight3.setVisible(false);
            return false;
        }
        if (counter == knight1) {
            health20.setFill(new ImagePattern(healthImg11));
            knight3.setVisible(false);
            return false;
        }
        if (counter == knight2) {
            health20.setFill(new ImagePattern(healthImg12));
            knight3.setVisible(true);
            return true;
        }
        knight3.setVisible(true);
        return true;
    }
    public boolean setPawn(int counter ,int pawn0 , int pawn1){
        if (counter == pawn0) {
            health100.setFill(new ImagePattern(healthImg13));
            pawn4.setVisible(false);
            return false;
        }
        if (counter == pawn1) {
            health100.setFill(new ImagePattern(healthImg14));
            pawn4.setVisible(true);
            return true;
        }
        pawn4.setVisible(true);
        return true;
    }
    public void setCoins(String coins) {
       money.setText(coins);
    }


}



