package jp.ac.uryukyu.ie.e175710;

public class Main {
    public static void main(String[] args) {
        Player user1 = new Player("Taro");//プレイヤーの名前
        Player user2 = new Player("Hanako");//プレイヤーの名前
        Deck deck = new Deck();

        System.out.println("ゲームを開始します。");
        int num = deck.draw();
        if(num >=10){//10,11,12,13のカードを10点として扱う。
            num =10;
        }
        user1.add(num);
        System.out.println(user1.getName()+":"+num +"を引いた。");//1回目Taroがカードを引く

        num = deck.draw();
        if(num >=10){//10,11,12,13のカードを10点として扱う。
            num =10;
        }
        user2.add(num);
        System.out.println(user2.getName()+":"+num+"を引いた。");//1回目Hanakoがカードを引く


        num = deck.draw();
        System.out.println(user1.getName()+":"+num +"を引いた。");//2回目Taroがカードを引く
        if(num >=10){//10,11,12,13のカードを10点として扱う。
            num =10;
        }
        user1.add(num);
        System.out.println("合計は"+user1.getScore());//Taroの1回目と2回目の合計点数

        num = deck.draw();
        System.out.println(user2.getName()+":"+num+"を引いた。");//2回目Hanakoがカードを引く
        if(num >=10){//10,11,12,13のカードを10点として扱う。
            num =10;
        }
        user2.add(num);
        System.out.println("合計は"+user2.getScore());//Hanakoの1回目と2回目の合計点数

        while(user1.getScore() < 16){//手元にあるカードの合計が16より小さかったらもう一度引いて点数を足す。
            num = deck.draw();
            System.out.println(user1.getName()+":"+num +"を引いた。");
            if(num >=10){//10,11,12,13のカードを10点として扱う。
                num =10;
            }
            user1.add(num);
            System.out.println("合計は"+user1.getScore());//Taroの合計点
        }
        while(user2.getScore() < 16){//手元にあるカードの合計が16より小さかったらもう一度引いて点数を足す。
            num = deck.draw();
            System.out.println(user2.getName()+":"+num+"を引いた。");
            if(num >=10){//10,11,12,13のカードを10点として扱う。
                num =10;
            }
            user2.add(num);

            System.out.println("合計は"+user2.getScore());//Hanakoの合計点
        }
        Judge(user1,user2);
    }
    public static void Judge(Player user1, Player user2) {
        if(user1.getScore()<user2.getScore() &&user2.getScore()<= 21){//Taroの点数＜Hanakoの点数かつ、Hanakoの点数が21てん以下の場合。
            System.out.println(user2.getName() + "の勝利！");//Hanakoの勝利！
            System.out.println(user1.getName() + "の負け。");//Taroの負け。
        }else if(user2.getScore() <user1.getScore() &&user1.getScore()<= 21){//Hanakoの点数＜Taroの点数かつ、Taroの点数が21てん以下の場合。
            System.out.println(user1.getName() + "の勝利！");//Taroの勝利！
            System.out.println(user2.getName() + "の負け。");//Hanakoの負け。
        }
        else if (user2.getScore()>= 21 &&user1.getScore()<= 21){//Hanakoの点数>=21かつ、Taroの点数<=21の場合
            System.out.println(user1.getName() + "の勝利！");//Taroの勝利！
            System.out.println(user2.getName() + "の負け。");//Hanakoの負け。
        }
        else if (user1.getScore()>= 21 &&user2.getScore()<= 21) {//Taroの点数>=21かつ,Hanakoの点数<=21の場合
            System.out.println(user2.getName() + "の勝利！");//Hanakoの勝利！
            System.out.println(user1.getName() + "の負け。");//Taroの負け。
        }
        else{
            System.out.println("引き分け");//それ以外は引き分け
        }
    }
}
