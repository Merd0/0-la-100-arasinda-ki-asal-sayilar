public class Main {

    public static void main(String[] args) {
        System.out.println("0 ile 100 arasındaki asal sayılar:");

        for (int i = 2; i <= 100; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.print(i + " ");
            }
        }
    }
}
