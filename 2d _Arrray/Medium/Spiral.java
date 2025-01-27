
public class Spiral {

    public static void spiral(int arr[][]) {
        int startRow = 0, endRow = arr.length - 1, startCol = 0, endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // rigth
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            // bottom
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            // left
            if (startCol < endCol) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(arr[endRow][j] + " ");
                }
            }
            if (startRow < endRow) {
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[][] = {{1,2,3,4,}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        spiral(arr);
    }
}
