package jp.ac.uryukyu.ie.e175710;

import org.junit.jupiter.api.Test;

import java.util.Random;

class DeckTest {
    int [] cards;
    @Test
    int draw() {
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