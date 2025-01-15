package Array.Easy;

public class SecondLargest {

    public static int betterApproach(int n[]) {
        // Better Approach
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if (largest < n[i]) {
                largest = n[i];
            }
        }
        int secondLargest = -1;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > secondLargest && n[i] != largest) {
                secondLargest = n[i];
            }
        }
        return secondLargest;

    }

    // Optimized Approach
    public static int optimizedApproach(int n[]) {
        int largest = n[0];
        int slargest = -1;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > largest) {
                slargest = largest;
                largest = n[i];
            } else if (n[i] < largest && n[i] > slargest) {
                slargest = n[i];
            }
        }
        return slargest;

    }

    public static void main(String args[]) {
        int arr[] = { 10, 10, 10 };
        System.out.println("Second largest is : " + betterApproach(arr));
        System.out.println("Second largest is : " + optimizedApproach(arr));
    }
}
