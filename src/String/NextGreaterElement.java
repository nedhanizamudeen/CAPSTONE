package String;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreater(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2};

        int[] result = nextGreater(nums);

        System.out.println(Arrays.toString(result));
    }
}