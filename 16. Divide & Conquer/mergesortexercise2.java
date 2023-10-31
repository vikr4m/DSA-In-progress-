public class mergesortexercise2 {
    //------BRUTE FORCE APPROACH-------
    // public static int maxrep(int arr[]){                         
    //     int majcount = arr.length/2;

    //     for (int i = 0; i < arr.length; i++) {
    //         int count=0;
    //         for (int j = 0; j < arr.length; j++) {
    //             if(arr[j] == arr[i]){
    //                 count++;
    //             }
    //         }
    //         if (count > majcount) {
    //             return arr[i];
    //         }
    //     }
    //     return -1;
        
    // }
    
    //------DIVIDE & CONQUER----------
    public static int countinrange(int arr[], int num, int si, int ei){
        int count =0;
        for (int i = si; i <= ei; i++) {
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
    
    public static int majrepelem(int arr[], int si, int ei){
        //base case
        if(si == ei){
            return arr[si];
        }

        //kaam
        int mid = si + (ei-si)/2;
        int left = majrepelem(arr, si, mid);        //left part
        int right = majrepelem(arr, mid+1, ei);     //right part

        if(left == right){
            return left;
        }

        int leftcount = countinrange(arr, left, si, ei);
        int rightcount = countinrange(arr, right, si, ei);

        return leftcount > rightcount ? left : right;
    }
    
    public static int majrep(int arr[]){
        return majrepelem(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        //System.out.println(maxrep(arr));
        System.out.println(majrep(arr));
    }
}
