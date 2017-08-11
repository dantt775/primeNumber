public class primeNumber {
//show all prime number from 1 to 100.
    
    public static void main(String[] args) {
        int i;
        int n;
        int qtd=0;
        boolean prime;
        
        
        for(n=1; n<=100; n++)
        {  
            prime=true; //It's prime until proven otherwise.
 
            i=2;
            do{                
               if (n%i==0 && n!=i || n==1) prime=false; 
               i=i+1;       
            } while (i<n && prime==true);
        
            if (prime==false)System.out.println(+n+" prime");
            else System.out.println(+n+" not prime");            
        }       
    }    
}