public class dandc3exercise {
    //----------BRUTE FORCE APPROACH-----------
    public static int invcount(int arr[]){      
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    //----------Divide and conquer will be done later----------------
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        System.out.println(invcount(arr));
    }    
}
