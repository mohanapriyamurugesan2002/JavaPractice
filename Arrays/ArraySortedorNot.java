public class ArraySortedorNot {

    public static boolean desc(int[] num) {
        for(int i=0; i<num.length-1; i++) {

            if(num[i]>num[i+1]) {

                return false;
                
            }

        }
        return true;
    }
      public static void main(String[] args) {

            int[] num = {1,2,3,4};

            System.out.print(desc(num));
        }
    
}
