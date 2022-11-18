package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
        int first = 500;
        boolean moreThemFirst = from1UpTo1000 < first;

        if (moreThemFirst) {
            System.out.println("Eagle");
        } else {
            System.out.println("Tail");
        }

    }
}
