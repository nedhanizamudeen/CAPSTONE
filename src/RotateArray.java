class RotateArray {
    
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        
        reverse(arr, 0, n - 1);

        reverse(arr, 0, k - 1);

        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 8, 9, 12, 15};
        int k = 3;

        rightRotate(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}