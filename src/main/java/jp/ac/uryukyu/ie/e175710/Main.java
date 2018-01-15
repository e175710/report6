package jp.ac.uryukyu.ie.e175710;

public class Main {
    public static void main(String[] args) {
        Player user1 = new Player("Taro");
        Player user2 = new Player("Hanako");
        Deck deck = new Deck();

        int num = deck.draw();
        user1.add(num);
        System.out.println(num +"を引いた。");

        num = deck.draw();
        user2.add(num);
        System.out.println(num+"を引いた。");


        num = deck.draw();
        user1.add(num);
        System.out.println(num +"を引いた。"+ "合計は"+user1.getScore());

        num = deck.draw();
        user2.add(num);
        System.out.println(num+"を引いた。"+"合計は"+user2.getScore());

    }
}
