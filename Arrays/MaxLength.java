public class MaxLength {

    public static void main(String[] args) {
        
   
    
    int[] arr = {10, 20, 30, 40, 50};
    int maxelement = 0;


    for(int i=0; i<=arr.length-1; i++) {

        if (arr[i] > maxelement) {

            maxelement=arr[i];
            
        } 

    }
    System.out.println("Maximum element is" + " " + maxelement);

}

}
