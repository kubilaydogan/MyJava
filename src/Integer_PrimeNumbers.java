public class Integer_PrimeNumbers {
    public static void main(String[] args) {

        // PRIME NUMBERS (STARTING FROM 2) (divisible by itself and 1)

        System.out.println(isItPrime(17));          // true
        System.out.println(isItPrime(18));          // false

        System.out.println(primeNumber(17));          // true
        System.out.println(primeNumber(18));          // false

    }

    private static boolean isItPrime(int number) {
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                count++;
        }
        return count < 1 && number > 1;         // numbers <= 1 are not prime
    }


    public static boolean primeNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
