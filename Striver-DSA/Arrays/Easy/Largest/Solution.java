package Arrays.Easy.Largest;
public class Solution {
    public static void main(String[] args) {
        int arr[] = {2,5,4,3,7,1,9};
        System.out.println(largest(arr));
    }
    public static int largest(int arr[]){   
        int larg = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>larg){
                larg = arr[i];
            }
        }
        return larg;
    }
}
