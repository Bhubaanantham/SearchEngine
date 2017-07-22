public class Fibonacci {
 
    public static void main(String a[]){
         
         int febCount = 15;
         int[] feb = new int[febCount];
         feb[0] = 0;
         feb[1] = 1;
         for(int x=2; x < febCount; x++){
             feb[x] = feb[x-1] + feb[x-2];
         }
 
         for(int x=0; x< febCount; x++){
                 System.out.print(feb[x] + " ");
         }
    }
}
