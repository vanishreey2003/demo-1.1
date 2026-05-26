import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("NO match");
    }}
public class two_sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.println("Enter the array elements on one line, separated by spaces (e.g. 2 7 11 15):");
        String line = scanner.nextLine().trim();
        // Handle empty input
        if (line.isEmpty()) {
            System.out.println("No numbers entered.");
            scanner.close();
            return;
        }

        String[] parts = line.split("\\s+");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            try {
                nums[i] = Integer.parseInt(parts[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + parts[i]);
                scanner.close();
                return;
            }
        }

        System.out.print("Enter target value: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid target.");
            scanner.close();
            return;
        }
        int target = scanner.nextInt();

        try {
            int[] result = sol.twoSum(nums, target);
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } catch (IllegalArgumentException e) {
            System.out.println("No pair found that sums to " + target);
        }

        scanner.close();
    }
}
