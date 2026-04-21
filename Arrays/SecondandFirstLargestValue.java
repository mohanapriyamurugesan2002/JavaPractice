public class SecondandFirstLargestValue {    

    public static int SecondLargestvale(int[] arr ) {
        
        if(arr.length<2) {
            System.out.println("No enough elements are present");
            return -1;
        }
        int largest;
        int SecondLargest;
        if (arr[0] > arr[1]) {

            largest = arr[0];
            SecondLargest= arr[1];
            
        } else {

            largest = arr[1];
            SecondLargest = arr[0];
            
        }

        for(int i =2; i<arr.length; i++) {
            if (arr[i] > largest) {
                SecondLargest = largest;
                largest = arr[i];
                
            } else if (arr[i] > SecondLargest && arr[i] != largest) {
               SecondLargest =  arr[i];
                
            }
        }
        return SecondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 7, 30};

        int result = SecondLargestvale(arr);

        System.out.println("SecondLargestValue:" + result);
    }
    
}
