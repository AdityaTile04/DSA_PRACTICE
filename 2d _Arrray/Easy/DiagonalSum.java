
public class DiagonalSum {

    public static int diagonalSum(int arr[][]) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i]; // primary diagonal
            if (i != n - 1 - i) {
                sum += arr[i][arr.length - i - 1];
            }
        }
        System.out.println("Sum is : " + sum);
        return sum;
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        diagonalSum(arr);
    }
}