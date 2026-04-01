public class SecondandFirstLargestValue {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 7, 30};
        
        int FirstLarVal = Integer.MIN_VALUE;
        int SecondLarVal = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++) {

            if(arr[i] > FirstLarVal) {

                SecondLarVal = FirstLarVal;
                FirstLarVal = arr[i];
            } else if (arr[i] > SecondLarVal && arr[i] != FirstLarVal) {

                SecondLarVal = arr[i];
                
            }


        }
        System.out.println("First Largest Value:" + FirstLarVal);
        System.out.println("Second Largest Value:" + SecondLarVal);



    }
}
