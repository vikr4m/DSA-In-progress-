public class firstoccurrecur {
    public static int firstoccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]== key){
            return i;
        }

        return firstoccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,7,6,9,3,10,2,5,3};
        System.out.println(firstoccur(arr,3,0));
    }
}
