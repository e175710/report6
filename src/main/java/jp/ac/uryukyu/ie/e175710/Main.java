package jp.ac.uryukyu.ie.e175710;

public class Main {
    public static void main(String[] args) {
        Player user1 = new Player("Taro");
        Player user2 = new Player("Hanako");
        Deck deck = new Deck();

        System.out.println("ゲームを開始します。");
        int num = deck.draw();
        if(num >=10){
            num =10;
        }
        user1.add(num);
        System.out.println(user1.getName()+":"+num +"を引いた。");

        num = deck.draw();
        if(num >=10){
            num =10;
        }
        user2.add(num);
        System.out.println(user2.getName()+":"+num+"を引いた。");


        num = deck.draw();
        System.out.println(user1.getName()+":"+num +"を引いた。");
        if(num >=10){
            num =10;
        }
        user1.add(num);
        System.out.println("合計は"+user1.getScore());

        num = deck.draw();
        System.out.println(user2.getName()+":"+num+"を引いた。");
        if(num >=10){
            num =10;
        }
        user2.add(num);
        System.out.println("合計は"+user2.getScore());

        while(user1.getScore() < 16){
            num = deck.draw();
            System.out.println(user1.getName()+":"+num +"を引いた。");
            if(num >=10){
                num =10;
            }
            user1.add(num);
            System.out.println("合計は"+user1.getScore());
        }
        while(user2.getScore() < 16){
            num = deck.draw();
            System.out.println(user2.getName()+":"+num+"を引いた。");
            if(num >=10){
                num =10;
            }
            user2.add(num);

            System.out.println("合計は"+user2.getScore());
        }
        Judge(user1,user2);
    }
    public static void Judge(Player user1, Player user2) {
        if(user1.getScore()<user2.getScore() &&user2.getScore()<= 21){
            System.out.println(user2.getName() + "の勝利！");
            System.out.println(user1.getName() + "の負け。");
        }else if(user2.getScore() <user1.getScore() &&user1.getScore()<= 21){
            System.out.println(user1.getName() + "の勝利！");
            System.out.println(user2.getName() + "の負け。");
        }
        else if (user2.getScore()>= 21 &&user1.getScore()<= 21){
            System.out.println(user1.getName() + "の勝利！");
            System.out.println(user2.getName() + "の負け。");
        }
        else if (user1.getScore()>= 21 &&user2.getScore()<= 21) {
            System.out.println(user2.getName() + "の勝利！");
            System.out.println(user1.getName() + "の負け。");
        }
        else{
            System.out.println("引き分け");
        }
    }
}
