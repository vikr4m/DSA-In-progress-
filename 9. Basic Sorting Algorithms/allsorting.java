public class allsorting {
    public static void bubblesort(Integer arr[]){                             //BUBBLE SORT
        for (int turn = 0; turn < arr.length-1 ; turn++) {
            for (int j = 0; j < arr.length-1-turn; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectionsort(Integer arr[]){                          //SELECTION SORT
        for (int i = 0; i <= arr.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j <= arr.length-1; j++) {
                 if(arr[minpos] > arr[j]){
                    minpos = j;
                 }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionsort(Integer arr[]){                         //INSERTION SORT
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding the correct position to insert
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void countingsort(int arr[]){                             //COUNTING SORT
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while(count[i] > 0 ){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countingsort(arr);
        printarr(arr);
        // Arrays.sort(arr);
        // printarr(arr);
        // Arrays.sort(arr, Collections.reverseOrder());
        // printarr(arr);
    }
}
