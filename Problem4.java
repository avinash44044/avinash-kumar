package Coding;
import java.util.*;

class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers separated by space:");
        String input = sc.nextLine();

        String[] parts = input.split(" ");
        ArrayList<Integer> nums = new ArrayList<>();

        for (String p : parts) {
            nums.add(Integer.parseInt(p));
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int d = 1; d <= 9; d++) {
            map.put(d, 0);
        }
        for (int n : nums) {
            for (int d = 1; d <= 9; d++) {
                if (n % d == 0) {
                    map.put(d, map.get(d) + 1);
                }
            }
        }
        System.out.print("{");
        for (int d = 1; d <= 9; d++) {
            System.out.print(d + ": " + map.get(d));
            if (d < 9) System.out.print(", ");
        }
        System.out.println("}");
    }
}
