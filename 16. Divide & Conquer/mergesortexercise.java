public class mergesortexercise {
    public static String[] mergesort(String arr[],int si,int ei){
        //base case
        if(si==ei){
            String A[] = {arr[si]};
            return A;
        }
        
        //kaam
        int mid = si+(ei-si)/2;
        String arr1[] = mergesort(arr, si, mid);    //left
        String arr2[] = mergesort(arr, mid+1, ei);    //right
        
        String arr3[] = merge(arr1,arr2);
        return arr3;
    }

    public static String[] merge(String arr1[],String arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        String arr3[] = new String[m+n];
        int idx = 0;
        
        int i = 0; //left iterator
        int j = 0;  //right iterator
        

        while (i< m && j < n) {     //left part
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }
            else{
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }
        while (i<m) {
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        while (j<n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;

    }

    static boolean isAlphabeticallySmaller(String str1, String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        String arr[] = {"sun","earth","mars","mercury"};
        String a[] = mergesort(arr,0,arr.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
