public class Stars {
    public static void main(String[] args) {
        int extent = 4;

        for (int i = 0; i < extent; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }


            for (int k = 0; k < 2 * (extent - i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
