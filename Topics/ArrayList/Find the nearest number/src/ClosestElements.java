import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ClosestElements {

    public static List<Integer> findClosestElements(int[] arr, int target) {
        int minDistance = Integer.MAX_VALUE;

        // Find the minimum distance
        for (int num : arr) {
            int distance = Math.abs(num - target);
            minDistance = Math.min(minDistance, distance);
        }

        // Collect numbers with the minimum distance
        List<Integer> closestElements = new ArrayList<>();
        for (int num : arr) {
            int distance = Math.abs(num - target);
            if (distance == minDistance) {
                closestElements.add(num);
            }
        }

        // Sort the closest elements in ascending order
        closestElements.sort(null);

        return closestElements;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the array
        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Read the target number
        int target = scanner.nextInt();

        // Find and print the closest elements
        List<Integer> closestElements = findClosestElements(arr, target);
        closestElements.forEach(element -> System.out.print(element + " "));
    }
}
