public class LeftRotateAnArraybytwo {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int temp1 = arr[0];
        int temp2 = arr[1];

        for(int i =2; i<arr.length; i++) {

            arr[i-2] =arr[i];

        }
        arr[arr.length-2] = temp2;
        arr[arr.length-1] = temp1;
        System.out.print("[");

        for(int i=0; i<arr.length; i++) {

            System.out.print(arr[i]);
            if(i != arr.length-1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
    
}
