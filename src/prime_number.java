public class prime_number {
//    static boolean prime(int n ){
//        boolean isprime=true;
//        for (int i =2 ; i <= n-1 ; i++){
//            if ( n%i == 0){
//                isprime = false;
//                break;
//            }
//        }
//        return  isprime;
//    }



    static boolean isprime(int n){
        if (n==2){
            return true;
        }

        boolean prime=true;
        for (int i = 2 ; i <=Math.sqrt(n) ; i ++){
            if ( n%i==0){
                prime = false;
            }
        }
        return prime;
    }

    static  void PrimeRange(int n ){
        for (int i = 2; i <= n; i ++){
            if (isprime(i)){
                System.out.println(i);
            }
        }
    }
    static void main(String[] args){
        int a = 10;
        System.out.println(isprime(a));
    }
}
