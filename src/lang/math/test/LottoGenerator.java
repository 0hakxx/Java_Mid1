package lang.math.test;

import java.util.Iterator;
import java.util.Random;

public class LottoGenerator {
    private int[] Lotto = new int[6]; //빈 배열 생성
    private Random rand = new Random();

    private int count = 0;

    public int[] getLotto() {
        while (count < 6){
            int number = rand.nextInt(45) + 1;
            if (isUnique(Lotto, number)) {
                Lotto[count] = number;
                count++;
            }
        }
        return Lotto;
    }

    public boolean isUnique(int [] Lotto, int number) {
        for (int i : Lotto) {
            if (i == number) {return false;}
        }
        return true;
    }
}
