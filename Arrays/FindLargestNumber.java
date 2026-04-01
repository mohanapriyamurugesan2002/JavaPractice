public class FindLargestNumber {

    public static void main(String[] args){

        int[] arr = {10, 20, 30, 40, 50, 60};
        int largest = 0;

        for(int i =0; i<arr.length; i++) {

            if(arr[i]>largest){

               largest = arr[i];

            }

             
            }
            
          System.out.println(largest);

        }
        /* public static int maxNum(int[] num) {

        int maxi = num[0];

        for(int i =0; i<num.length; i++) {

            if(num[i] > maxi) {

                maxi = num[i];
            }
        }
        return maxi;
    }
public static void main(String[] args) {
    int[] num = {10, 20, 30, 40, 50};

    int largest = maxNum(num);

    System.out.print(largest);
} */
       

    }
    

