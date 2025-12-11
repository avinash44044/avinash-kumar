package Coding;
import java.util.Scanner;

class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int a = Integer.parseInt(sc.nextLine().trim());
        if (a <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        int count = (a % 2 == 0) ? (a - 1) : a;
        if (count <= 0) count = 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            int odd = 2 * i + 1;
            if (i > 0) sb.append(", ");
            sb.append(odd);
        }
        System.out.println(sb.toString());

    }
}