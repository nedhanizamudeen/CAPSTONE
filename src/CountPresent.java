class CountPresent {
    public static int countPresent(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 0, 1};
        System.out.println(countPresent(arr)); 
    }
}