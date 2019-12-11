import java.util.Arrays;
public class PrimeSieve {
    public static boolean[] sieve = new boolean [1000];
    public static void main(String[] args) {
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false;
        sieve[1] = false;
        for(int i=3;i<=999; i++){
                for(int n=2; n<=999; n++){
                    if(i%n==0){
                        sieve[i]=true;
                    }
                    else{
                        sieve[i]=false;
            }
            System.out.println(java.util.Arrays.toString(sieve));
        }
    }
}
    public static int[] collectPrime(){
        int j=0;
           for(int i=2; i<sieve.length; i++){
            if(sieve[i]==true){
                j++; 
            }
        }
        int[] primeNumbers= new int [j];
        
        return primeNumbers;
    }
    public static void printPrimeFactors(primeNumbers[]){
        for(int a=1; a<sieve.length; a++){
            while(b<sieve.length){
                int b= 2; 
                b++; 
                if(a%b==0){
                   a = a/b;
                }
            }
            int[] primeFactors= new int[b];
        }
        return primeFactors;
        System.out.print("Prime factorization of"+ a+ "is"+ primeFactors);
    }
}     
        //write and implement the sieve algorithm
        
        //print a list of prime numbers to the console
        

