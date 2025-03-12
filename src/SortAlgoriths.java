public class SortAlgoriths {

    public Integer[] bubbleSort(Integer[] arr){
        for (int i = 0;i < arr.length-1;i++){
            for (int j = 0; j < arr.length-1-i;j++){
                if (arr[j] > arr[j+1]){
                    Integer temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public Integer[] selectionSort(Integer[] arr){
        for (int i = 0; i < arr.length-1;i++){
            int minIndex = i ;
            for (int j = i+1; j < arr.length;j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public Integer[] isertionSort(Integer[] arr){
        for(int i = 1;i < arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public Integer[] mergeSort(Integer[] arr) {
        Integer[] temp = new Integer[arr.length]; // Crear array temporal auxiliar
        mergeSort(arr, temp, 0, arr.length - 1);
        return arr;
    }

    private void mergeSort(Integer[] arr, Integer[] temp, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid, right);
        }
    }

    private void merge(Integer[] arr, Integer[] temp, int left, int mid, int right) {
        // Copiar los elementos en el array auxiliar
        System.arraycopy(arr, left, temp, left, right - left + 1);

        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        while (i <= mid) {
            arr[k++] = temp[i++];
        }
        while (j <= right) {
            arr[k++] = temp[j++];
        }
    }

    public Integer[] quickSort(Integer[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        Integer[] sortedArray = arr.clone(); // Crear una copia para no modificar el original
        quickSort(sortedArray, 0, sortedArray.length - 1);
        return sortedArray;
    }

    private void quickSort(Integer[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(Integer[] arr, int low, int high) {
        Integer pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(Integer[] arr, int i, int j) {
        Integer temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
