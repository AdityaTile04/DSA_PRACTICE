package Array.Easy;

public class Largest {
    public static int largest(int n[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            if (largest < n[i]) {
                largest = n[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int n[] = { 2, 4, 3, 1, 4, 8, 5 };
        int l = largest(n);
        System.out.println("largest is : " + l);
    }
}