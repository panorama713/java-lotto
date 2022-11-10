package lotto.domain;

/**
 * packageName : lotto.domain
 * fileName : Calculator
 * author : gim-yeong-geun
 * date : 2022/11/09
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/09         gim-yeong-geun          최초 생성
 */
public class Calculator {
    private static int revenue = 0;
    private static double yield = 0;

    public static int revenue(int rankOne, int rankTwo, int rankThree, int rankFour, int rankFive) {
        int result = 0;
        result += rankOne * Rank.ONE.getMoney();
        result += rankTwo * Rank.TWO.getMoney();
        result += rankThree * Rank.THREE.getMoney();
        result += rankFour * Rank.FOUR.getMoney();
        result += rankFive * Rank.FIVE.getMoney();
        return result;
    }

    public static double yield(double revenue, double coin) {
        double result = (((revenue - coin)/coin) * 100);
        result = Math.round(result * 10)/10.0;
        yield = result;
        return result;
    }
}
