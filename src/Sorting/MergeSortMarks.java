package Sorting;

class MergeSortMarks {

    void merge(int arr[], int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++; k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++; k++;
        }
    }

    void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int marks[] = {78, 45, 90, 32, 67, 88};

        MergeSortMarks obj = new MergeSortMarks();
        obj.mergeSort(marks, 0, marks.length - 1);

        System.out.println("Sorted Marks:");
        for (int m : marks)
            System.out.print(m + " ");
    }
}
