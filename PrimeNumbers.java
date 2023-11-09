public class PrimeNumbers {
  public static void main(String[] args) {
    int n = 10; // change this to the desired number of primes
    int count = 0;
    int num = 2;

    while (count < n) {
      boolean isPrime = true;

      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) {
        System.out.println(num + " ");
        count++;
      }

      num++;
    }
  }

}
