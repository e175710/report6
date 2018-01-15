package jp.ac.uryukyu.ie.e175710;

import java.util.Random;

public class Player{
    private String name;//プレイヤーの名前
    private int score;//52枚のカード

    public Player(String name){
        this.name = name;
     }
    public void add(int point){
       score += point;
     }

    public String getName(){
         return name;
     }
    public int getScore(){
        return score;
    }



/*public void judge(){

        Player user1 = new Player("Taro");
        Player user2 = new Player("Hanako");
        Deck deck = new Deck();
        int num = deck.draw();
        user1.add(num);
        System.out.println(user1.getName() + ":" + num + "を引いた。");

        num = deck.draw();
        user2.add(num);
        System.out.println(user2.getName() + ":" + num + "を引いた。");


        num = deck.draw();
        user1.add(num);
        System.out.println(user1.getName() + ":" + num + "を引いた。" + "合計は" + user1.getScore());

        num = deck.draw();
        user2.add(num);
        System.out.println(user2.getName() + ":" + num + "を引いた。" + "合計は" + user2.getScore());

        while (user1.getScore() < 16) {
            num = deck.draw();
            user1.add(num);
            System.out.println(user1.getName() + ":" + num + "を引いた。" + "合計は" + user1.getScore());
        }
        while (user2.getScore() < 16) {
            num = deck.draw();
            user2.add(num);
            System.out.println(user2.getName() + ":" + num + "を引いた。" + "合計は" + user2.getScore());
        }


    }*/


}
