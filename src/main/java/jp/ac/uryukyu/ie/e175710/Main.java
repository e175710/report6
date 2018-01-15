package jp.ac.uryukyu.ie.e175710;

public class Main {
    public static void main(String[] args) {
        Player user1 = new Player("Taro");
        Player user2 = new Player("Hanako");

        user1.card();
        user2.card();
        int point1 = user1.card + user1.card;
        int point2 = user2.card + user2.card;
        System.out.println(user1.name + "'s card: " + point1);
        System.out.println(user2.name + "'s card: " + point2);
    }
}
