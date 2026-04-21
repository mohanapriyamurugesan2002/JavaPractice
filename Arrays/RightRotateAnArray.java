public class RightRotateAnArray {

    public static void main(String[] args) {

        int[] arr = { 3, 1, 7, 5, 2};
        int n = arr.length;
        int temp = arr[n-1];

        for(int i = n-1; i>0; i--) {
            arr[i] = arr[i-1];

        }
        arr[0] = temp;

        System.out.println("After rotaing An array");
         System.out.print("[");
        for(int i = 0; i<n; i++) {
             System.out.print(arr[i] + " ");
              if(i<n-1) {

                System.out.print(",");

            }
        }
        System.out.println("]");
          


    }
    
}
