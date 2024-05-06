package algoritmos;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
        int listSize = arr.length;
        
        for (int i = 0; i < listSize - 1; i++) {
            
        	int minIndex = i;
            
            for (int j = i + 1; j < listSize; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 10, 30, 90, 70, 80, 60};
        
        selectionSort(arr);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
