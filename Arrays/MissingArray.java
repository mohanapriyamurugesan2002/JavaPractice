public class MissingArray {
    public static void main(String[] args) {
        int[] num = {1, 3, 4, 5};

        int n = num.length;

        boolean[] result = new boolean[n+2];

        for(int val:num) {

            if (val<=n+1) {

                result[val] = true;
                
            }
        }

            for(int i = 1; i <= n+1; i++) {
                if (!result[i]) {

                    System.out.println("Missing number:" + i);
                    break;
                    
                }
            }
        }
    }
    

