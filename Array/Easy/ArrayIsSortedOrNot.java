package Array.Easy;

public class ArrayIsSortedOrNot {
    public static boolean check(int nums[]) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
            }
        }
        if (nums[nums.length - 1] > nums[0]) {
            count++;
        }
        return count <= 1;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 3, 1 };
        System.out.print(check(nums));
    }
}
