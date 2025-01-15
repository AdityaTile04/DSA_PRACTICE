package Array.Easy;

public class SecondLargest {

    public static int secondLargest(int n[]) {
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

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        System.out.println("Second largest is : " + secondLargest(arr));
    }
}
