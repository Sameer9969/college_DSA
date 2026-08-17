import java.util.*;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long n = sc.nextLong();
        if(isprime(n)){
            System.out.println(n+ "is prime");


        }
        else{
            System.out.println(n+ "is not prime");
        }
    }
    public static boolean isprime(long  n){
        for (int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
            {
                return false;

            }
        }
        return true;
    }
}