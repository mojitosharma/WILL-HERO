/*
package com.example.willhero;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public class Hero {
    private TranslateTransition herojump;
    private TranslateTransition translate1;
    private TranslateTransition movefor;
    private ImageView hero;

    private boolean flagonplatform = true;
    private boolean flagexit = false;
    private AtomicBoolean another_space = new AtomicBoolean(false);
//    private boolean another_space = false;

    Hero(AnchorPane mainpane){
        hero = new ImageView();
        hero.setImage(new Image((new File("src/main/resources/knight.png")).toURI().toString()));
        hero.setFitHeight(50);
        hero.setFitWidth(38);
        hero.setY(386);
        hero.setX(300);
        mainpane.getChildren().add(hero);
        movefor =  Animations.translateTransition(hero, 100, 70, -15, false, 1);
    }

    public void display(AnchorPane mainpane){
        mainpane.getChildren().add(hero);
    }

    public void jumphero(){
        herojump = Animations.translateTransition(hero, 300,0,-65, true, -1);
        herojump.play();
    }

    public void moveforward(){
        flagonplatform = false;
        another_space.set(false);
        herojump.stop();
        movefor = Animations.translateTransition(hero, 100, 70, -15, false, 1);
        TranslateTransition translate = new TranslateTransition(Duration.millis(300),hero);
        translate.setCycleCount(1);
        translate.setToY(3);
        translate.setAutoReverse(false);
        movefor.play();
        try {
            Thread.sleep(80);
//            TranslateTransition translate1 = null;
//            if(hero.getY() > 330){
//                int dis = 0;
//                dis = Math.max(15, (int)(hero.getY() -330));
//                translate1 = new TranslateTransition(Duration.millis(80),hero);
//                translate1.setCycleCount(1);
//                translate1.setByY(-dis);
//                translate1.setAutoReverse(false);
////                translate1.play();
//            }
            movefor.setOnFinished(e ->{
                movefor.setOnFinished(e1->{});
                if(another_space.get() == true){
                    another_space.set(false);
                    System.out.println("was here");
                    hero.setY(hero.getY()-10);
                    movefor.play();
                }
                else{
                    System.out.println("was not here");
                    translate.play();
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(-1);
        }
//        translate.play();

        translate.setOnFinished(e -> {
            if(flagonplatform == false){
                flagexit = true;
                TranslateTransition translate1 = new TranslateTransition(Duration.millis(300),hero);
                translate1.setCycleCount(1);
                translate1.setToY(300);
                translate1.setAutoReverse(false);
                translate1.play();
            }
            else {
                herojump.play();
            }
        });
    }

    public ImageView getHero(){
        return hero;
    }

    public boolean checkCollision(ImageView imageView, ImageView imageView2){
        if(imageView.getBoundsInParent().intersects(imageView2.getBoundsInParent())){
            return true;
        }
        return false;
    }

    public void setonplatform(boolean f){
        flagonplatform = f;
    }

    public boolean isFlagexit() {
        return flagexit;
    }

    public void setAnother_space(boolean another_space) {
        movefor.setOnFinished(e1->{
            System.out.println("was in update");

        });
        movefor.play();
        this.another_space.set(true);
    }
}


*/

package com.example.willhero;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public class Hero {
    private TranslateTransition herojump;
    private TranslateTransition translate1;
    private ImageView hero;

    private boolean flagonplatform = true;
    private AtomicBoolean another_space = new AtomicBoolean(false);
    private boolean flagexit = false;
    private boolean another_space1 = false;
    private int spacecount = 0;


//    private TranslateTransition moveup;
//    private TranslateTransition movedown;

    Hero(AnchorPane mainpane){
        hero = new ImageView();
        hero.setImage(new Image((new File("src/main/resources/knight.png")).toURI().toString()));
        hero.setFitHeight(50);
        hero.setFitWidth(38);
        hero.setY(386);
        hero.setX(320);
        mainpane.getChildren().add(hero);
//
//        moveup = Animations.translateTransitionmovetoY(hero,300, 0 , -55, false, 1);
//        movedown = Animations.translateTransitionmovetoY(hero,600, 0 , 110, false, 1);
//        moveup.setOnFinished(e -> {
//            movedown.play();
//        });
    }

    public void display(AnchorPane mainpane){
        mainpane.getChildren().add(hero);
    }

    public void jumphero(){
        herojump = Animations.translateTransition(hero, 300,0,-70, true, -1);
//        herojump.setOnFinished(e ->{
//            if(flagonplatform == false){
//                System.out.println("gone");
//            }
//            else herojump.play();
//        });
        herojump.play();
    }

    public void moveforward(){
        flagonplatform = false;
        herojump.stop();
//        another_space.set(false);
        another_space1 = false;
        spacecount--;
        TranslateTransition movefor = Animations.translateTransition(hero, 100, 70, 0, false, 1);
        TranslateTransition translate = new TranslateTransition(Duration.millis(300),hero);
        translate.setCycleCount(1);
        translate.setToY(3);
        translate.setAutoReverse(false);
//        ak:
        movefor.play();
        try {
            Thread.sleep(120);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after move   "+spacecount);
//        movefor.setOnFinished(e ->{
//            System.out.println("in here");
//        if(another_space.get() == true) {
           if(spacecount > 0){
                spacecount--;
                System.out.println("in here here");
                TranslateTransition translate1 = new TranslateTransition(Duration.millis(300), hero);
                translate1.setCycleCount(1);
                translate1.setByY(5);
                translate1.setAutoReverse(false);
                translate1.play();
                another_space1 = false;
                movefor.play();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
//                translate.play();
            }
//            });

        translate.play();
        translate.setOnFinished(e -> {
//            System.out.println(flagonplatform);
            if(flagonplatform == false){
                flagexit = true;
                TranslateTransition translate1 = new TranslateTransition(Duration.millis(300),hero);
                translate1.setCycleCount(1);
                translate1.setToY(300);
                translate1.setAutoReverse(false);
                translate1.play();
            }
            else {
                herojump.play();
            }
        });
    }

    public ImageView getHero(){
        return hero;
    }


    public void setonplatform(boolean f){
        flagonplatform = f;
    }

    public boolean isFlagexit() {
        return flagexit;
    }

    public void setAnother_space() {
        another_space1 = true;
        this.another_space.set(true);
        spacecount++;
    }

    public void moveback(){
        Animations.translateTransition(hero, 3000, -70, 0, false, 1).play();
    }
}
