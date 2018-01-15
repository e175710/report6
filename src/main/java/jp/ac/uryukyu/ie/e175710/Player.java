package jp.ac.uryukyu.ie.e175710;

import java.util.Random;

public class Player{
     private String name;//プレイヤーの名前//
     private int score;//52枚のカード

     public Player(String name){
     this.name = name;
     }
     public void add(int point){
       score += point;
     }
    public String getName(){return name; }
    public int getScore(){return score; }

}
