public class reducevaluearray {
public static void changear(int arr[], int i, int val){
    //base case
    if(i==arr.length){
        printarr(arr);
        return;
    }
    //recursion (kaam)
    arr[i] = val;
    changear(arr, i+1, val+1);
    arr[i] -=2;   
}
public static void printarr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int arr[] = new int[5];
        changear(arr, 0, 1);
        printarr(arr);
    }
}
