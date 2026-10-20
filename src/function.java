public class function {


//    static  int  multipy(int a,int b){
//        int product= a * b;
//        return product;
//    }

    static  int factorial(int n){
        int f= 1 ;
        for (int i =1  ; i <= n; i ++){
            f= f * i;
        }
        return f;
    }

    static  int binomialc (int n , int r ){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int d = a/(b*c);
        return d;

    }
    static  void main(String[] args ){
        int n = 6;
        int r = 5;
        System.out.println(" the binomial coefficient is " + binomialc(n, r ));

    }
}
