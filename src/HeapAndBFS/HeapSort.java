package HeapAndBFS;

public class HeapSort {
    public void heapSort(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }

        int n = arr.length;
        //get the parent node of array end and start percolate down process
        for(int i = n / 2 - 1; i >= 0; i--){
            percaolateDown(arr, n, i);
        }

        for(int i = n - 1; i >= 0; i--){
            swap(arr, 0, i);
            percaolateDown(arr, i, 0);
        }
    }

    //percolate down the initial node down if
    //it's not the highest number in subtree
    public void percaolateDown(int[] arr, int n, int i){
        int largest = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        if(l <= n && arr[largest] < arr[l]){
            largest = l;
        }

        if(r <= n && arr[largest] < arr[r]){
            largest = r;
        }

        if(largest != i){
            swap(arr, largest, i);

            percaolateDown(arr, n, largest);
        }
    }

    public void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


}
