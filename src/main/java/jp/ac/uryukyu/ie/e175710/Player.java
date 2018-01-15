package jp.ac.uryukyu.ie.e175710;

import java.util.Random;

public class Player{
 String name;//プレイヤーの名前
 int card;//13枚のカード

 public Player(String name){
  this.name = name;
 }

 public void card(){
  Random rnd = new Random();
  card = rnd.nextInt(13) + 1;
 }
}
