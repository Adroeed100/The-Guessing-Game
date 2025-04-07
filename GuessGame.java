import java.util.Scanner;
import java.util.Random;

class GuessGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Welcome to the game");

        int i, j, m, n;
        char[][] arr = {{'*','*','*'},{'*','*','*'},{'*','*','*'}};


        int loseRow = r.nextInt(3);
        int loseCol = r.nextInt(3);

        System.out.println("Select any row and col");


        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }

        while(true) {
            m = s.nextInt();
            n = s.nextInt();

            if (m == loseRow && n == loseCol) {
                arr[m][n] = '0';
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        System.out.print(arr[i][j] + "\t");
                    }
                    System.out.print("\n");
                }
                System.out.println("You Lost");
                System.exit(0);
            } else {
                arr[m][n] = '1';
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        System.out.print(arr[i][j] + "\t");
                    }
                    System.out.print("\n");
                }
                System.out.println("You are safe");
            }
        }
    }
}
