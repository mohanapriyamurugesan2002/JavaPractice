public class FindSmallestNumber {
    
    public static int miniNum(int[] arr) {

        int minimum = arr[0];
        
        for(int i =0; i<arr.length; i++){

            if(arr[i]<minimum) {
                
                minimum = arr[i];

            }
        }

        return minimum;

    }
    public static void main(String[] args) {

        int[] arr = {12,2, 10, 20, 100, 30, 50};

        int smallest = miniNum(arr);

        System.out.println(smallest);
    }


}
