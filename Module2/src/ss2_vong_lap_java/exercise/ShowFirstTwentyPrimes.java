package ss2_vong_lap_java.exercise;

public class ShowFirstTwentyPrimes {
    public static void main(String[] args) {
        int N = 20;
        int count = 0;
        int i = 2;
        while (count < N) {
            if (ShowFirstTwentyPrimes(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

    public static boolean ShowFirstTwentyPrimes(int N) {
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }


}
