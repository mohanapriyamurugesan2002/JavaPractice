public class BinarySearch {

   public static int FirstOcc(int[] nums, int k) {

      int Start = 0;
      int End = nums.length-1;
      int answer = -1;

      while (Start <= End) {

         int Mid = (Start+End)/2;

         if (nums[Mid]==k) {

            answer = Mid;
            End = Mid-1;
            
         } else if (nums[Mid] > k) {

            Start = Mid+1;
            
         } else if (nums[Mid] < k) {

            End = Mid-1;
            
         }
         
      }
      return answer;
    
   }
   public static void main(String[] args) {

      int[] nums = {1, 1, 1, 1, 2};

      int k = 1;

      int result = FirstOcc(nums, k);

      System.out.println("First occurance index position:" + result);

   }
    
}
