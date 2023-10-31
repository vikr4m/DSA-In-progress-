public class lastoccurrecur {
    public static int lastoccur(int arr[],int key,int i){
        if(i==0){
            return -1;
        }

        if(arr[i]== key){
            return i;
        }

        return lastoccur(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[] = {8,7,6,9,3,10,2,5,6};
        System.out.println(lastoccur(arr,3,arr.length-1));
    }
}
