package study;

//①FruitsConstants.javaをインポートしなさい。
import constants.FruitsConstants;
//②Fruits.javaをインポートしなさい。
import fruits.Fruits;




/**
 * 本課題では、基本的なJavaの構造と、importについて理解を深めていきましょう。
 *
 * 問①〜問③まであります。
 * 全て回答し、課題にある画像と同じ表示になるようにしてください。
 *
 */
public class Study {

    public static void main(String[] args) {

        /* ③ Fruits.javaのprintFruitsメソッドを呼び出しなさい。
         *     また、課題の画像と同じ表示になるように
         *     printFruitsの引数にはFruitsConstantsから呼び出した値を設定してください。
         */
    	//System.out.print(FruitsConstants.FRUITS_LEMON_04); レモン
    	//System.out.print(FruitsConstants.FRUITS_COUNT_20); 20
    	String fruits = FruitsConstants.FRUITS_LEMON_04;
    	int count = FruitsConstants.FRUITS_COUNT_20;
    	Fruits.printFruits(fruits, count);


    }
}