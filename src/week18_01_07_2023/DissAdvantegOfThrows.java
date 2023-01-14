package week18_01_07_2023;

public class DissAdvantegOfThrows {
    public static void main(String[] args) {

        waitFor(3);
    }

    private static void waitFor(int seconds) {

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
