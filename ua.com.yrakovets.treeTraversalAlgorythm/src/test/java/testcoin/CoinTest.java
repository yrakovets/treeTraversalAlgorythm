package testcoin;

import org.junit.Assert;
import org.junit.Test;

public class CoinTest {

    @Test
    public void coinTest1(){
        CoinAlgorythm alg = new CoinAlgorythm(168);
        alg.run();
        Assert.assertEquals(" 50 50 50 10 5 2 1", alg.print());
    }

    @Test
    public void coinTest2(){
        CoinAlgorythm alg = new CoinAlgorythm(235);
        alg.run();
        Assert.assertEquals(" 50 50 50 50 25 10", alg.print());
    }


}
