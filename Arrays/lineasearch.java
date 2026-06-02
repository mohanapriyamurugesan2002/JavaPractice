public class lineasearch {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 4, 1};
        int num = 4;

        for(int i =0; i<arr.length; i++){
            if(arr[i]==num){
                System.out.print(num);
                break;
            }
        }
    }
    
}
