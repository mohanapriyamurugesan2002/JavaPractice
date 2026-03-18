public class ReverseArray {

    public static int[] reverse(int[] num) { 

        int left = 0;
        int right = num.length-1;

        while (left < right) {

            int top = num[left];
            num[left] = num[right];
            num[right] = top;

            left++;
            right--;
            
        }
        return num;
    }
    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50};

        int[] result = reverse(num);
         System.out.print("[");
        for(int i=0; i<result.length; i++) {

            if(i!=result.length-1) {
                System.out.print(result[i]+ ",");
            } else {

                System.out.print(result[i]);

            }
           

        }
         System.out.print("]");

    }
    
}
