public class Primes {
    public static void main(String[] args) {
        // check if n is 30 of an arg[]

        int N = Integer.parseInt(args[0]); //the size of the range
        boolean[] arr = new boolean[N];//array holding all the numbers in the range
     
        //turns all od the cells values to true except 0 and 1
        for (int i = 2; i < N; i++) {
            arr[i] = true;
        }

        //Mark multiples of each prime as false
        for (int divisor = 2; divisor * divisor < N; divisor++) {
            if (arr[divisor] == true) {  // If divisor is still marked as prime
                for (int multiple = divisor * divisor; multiple < N; multiple += divisor) {
                    arr[multiple] = false;  // Mark multiples of divisor as non-prime
                }
            }
        }

       // Count and print prime numbers
       int primeCount = 0;
       System.out.println("Prime numbers up to " + N + ":");
       for (int i = 2; i < N; i++) {
           if (arr[i]== true) {  // If the number is marked as prime
               System.out.println(i);
               primeCount++;
           }
       }

       // Calculate the percentage of primes
       double percentage = ((double) primeCount / N) * 100;

       // Output the result
       System.out.println("There are " + primeCount + " primes between 2 and " + N + " (" +  (int)percentage + "% are primes)");
   }
}

    
