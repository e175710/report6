package jp.ac.uryukyu.ie.e175710;
import java.util.Random;
public class Deck {
    int [] cards;
    public Deck(){//1~13までのカードの用意//
        cards = new int[52];
        for(int i=0; i<13; i++){
            for (int j=0; j<4; j++){
                    cards [j+4*i] = i+1;
            }
        }
    }
    public int draw(){
        Random rnd = new Random();
        int num = 0;
        int result ;
        do{//0以外を引くまで続ける。
             num = rnd.nextInt(52);
             result = cards[num];
        }while(result == 0);
        cards[num] = 0;//引いたカードを０と置き換える。
        return result;

    }
}
