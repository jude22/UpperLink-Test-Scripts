public class HelloWorld{


/* SCRIPT TO SOLVE QUESTION 2 IN JAVA*/

     public static void main(String []args){
        
        int test[] = {1,2,3};
        
        System.out.println(smallestPositiveInteger(test));
     }
     
     
     /*here is the function that finds the smallest positive integer that does not occur in the array*/
     public static int smallestPositiveInteger(int[] A){
         
         int leastNumberInArray = 0;
         int leastPositiveInteger = 0;
         
         //find the least number in the array
         leastNumberInArray = A[0]; //assume the first value to be the least
         
         for(int i=1; i < A.length; i++){
             
            if(A[i] < leastNumberInArray){ //traverse for the least
                leastNumberInArray = A[i];
            }
            
         } //when the loop ends, the least value will be in the variable
          
         
         
         //find the smallest positive integer that is not in the array
           
            leastNumberInArray++;
            
        while(true){
           leastPositiveInteger = leastNumberInArray;
         
          
           for(int j=0; j < A.length; j++){
             
                if(leastNumberInArray == A[j]){ 
                    leastNumberInArray++;
                    continue;
                }
           }
           
           if(leastNumberInArray == leastPositiveInteger){
               
               if(leastNumberInArray > 0){//ensure positive integer
               break;
               }
               else{
                   leastNumberInArray++;
               }
           }
           
         }
         
         return leastPositiveInteger;
         
     }
}