package Ch1_1;

import edu.princeton.cs.introcs.StdIn;

import java.util.Scanner;

public class Ex21 {

    public static String[][] readData(int N) {
        String[][] data = new String[N][3];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;

        do {
            String name, score1, score2;
            System.out.println("Enter a name： ");
            data[i][j++] = scanner.next();
            System.out.println("Enter a Score: ");
            data[i][j++] = scanner.next();
            System.out.println("Enter a Score: ");
            data[i++][j] = scanner.next();
            j = 0;
            if (i >= N)
                break;
        } while (scanner.hasNext());

        return data;
    }

    public static void printDate(String data[][]){
        System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\t\n", "name", "score1", "score2", "score1/score2");
        for (int i = 0; i < data.length; i++) {
            double aim = Double.parseDouble(data[i][1])/Double.parseDouble(data[i][2]);
            System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\t\n", data[i][0], data[i][1], data[i][2], aim);
        }
    }

    public static void main(String[] args) {
        String[][] a;
        a = readData(3);
        printDate(a);

    }
}
