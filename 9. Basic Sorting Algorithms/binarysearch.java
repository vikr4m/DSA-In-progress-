import java.util.*;
public class binarysearch {
    public static int binsearch(int array[], int key){
        int start = 0, end = array.length-1;
        
        
        while (start<=end) {
            int mid = (start+end)/2;
            
            if (array[mid] == key) {
                return mid;
            }

            if (array[mid] < key) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int array[] = {4, 5, 6, 7, 0, 1, 2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to be searched: ");
        int key = sc.nextInt();
        int index = binsearch(array, key);
        
        if(index == -1){
            System.out.println("Element not found");    
        }
        else{
        System.out.println("Element found at "+index);
        }
        sc.close();
    }    
}
