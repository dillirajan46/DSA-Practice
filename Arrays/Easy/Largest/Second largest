public class SecondLargest {
    public static int secondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15};

        System.out.println(secondLargest(arr));
    }
}
