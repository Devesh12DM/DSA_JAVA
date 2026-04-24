import java.util.Scanner;

public class loopsss {

static void main() {
//        for(int i =1 ; i <=10 ; i++)
//            System.out.println(i);
//    }


//    for(int i = 1 ; i <= 20 ; i += 2){
//        System.out.println("the odd numbers are" + i);
//    }

//    for(int i = 0 ; i <= 20 ; i +=2) {
//        System.out.println("the even numbers are " + i);
//
//
//    }

//    for(int i = 1 ; i<=5 ; i ++){
//        for(int j = 1 ; j <= i ; j++ ){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//*
//* *
//* * *
//* * * *
//* * * * *


//    for(int i = 1 ; i <=5 ; i++ ){
//        for (int j= 5 ; j>=i ; j--){
//
//            System.out.print( "* ");
//        }
//        System.out.println();
//    }


//    APNA COLLEGE LOOPS CHAPTER
//    Scanner sc = new Scanner(System.in);
//    System.out.print("enter the number n ");
//    int n = sc.nextInt() ;
//    int i=1;
//    int num =0 ;
//    while(i <= n){
//        num = num + i ;
//        i ++;
//    }
//
//        System.out.println(num);


//        for (int i= 1 ; i <= 4 ; i ++ ){
//            for (int j = 1 ; j <= 4 ; j++){
//                System.out.print( " * ");
//            }
//            System.out.println();
//        }


//    System.out.println(" the number : ");
//    int n = 140227;
//
//    while ( n>0 ){
//        int last_digit = n%10 ;
//        System.out.print( " " + last_digit);
//        n= n/10;
//    }

//    System.out.println(" the number : ");
//    int n = 140227;
//    int rev= 0;
//    while ( n>0 ){
//        int last_digit = n%10 ;
//
//        n= n/10;
//        rev = (rev*10) + last_digit;
//    }
//    System.out.println( rev + " ");

    /* BREAK STATEMENTS

//    Scanner sc = new Scanner(System.in);
//    do {
//
//        System.out.println("Enter the number ");
//        int num = sc.nextInt();
//        if (num % 10 == 0){
//            break;
//        }
//        System.out.println(num);
//    }while(true);
//
        */

    /* CONTINUE STATEMENT
//    Scanner sc = new Scanner(System.in);
//    do {
//        System.out.println("Enter the number ");
//        int num = sc.nextInt();
//        if (num % 10 == 0){
//            continue;
//        }
//        System.out.println(num);
//    }while(true);


    for (int i = 1 ; i <= 5 ;i++) {
        if (i == 3){
            continue;
        }
        System.out.println( i );
    }
    */

//    PRINT ALL THE NUMBER GIVEN BY THE USER EXCEPT THE NUMBERS WHICH IS MULTPLE OF 10

//    Scanner sc = new Scanner(System.in);
//
//
//    do {
//        System.out.println(" Enter the number : ");
//        int num = sc.nextInt();
//        if (num % 10 == 0) {
//            continue;
//        }
//        System.out.println(num);
//    } while (true);
//

//        PRIME OR NOT

    /*
    Scanner sc = new Scanner(System.in);

    System.out.println(" Enter the number : ");
    int num = sc.nextInt();

    if (num ==2){
        System.out.println(" it is the prime number ");
    }else  {
        boolean IS_PRIME = true;
        for ( int i = 2 ; i <=Math.sqrt(num) ; i++){
            if (num % i == 0){
                IS_PRIME = false;
            }
        }

        if ( IS_PRIME == true){
            System.out.println(" it is the prime number ");
        }else {
            System.out.println(" it is not the prime number");
        }
    }
      */

    // HOME WORK PROBLEMS

//    PRINT THE MULTIPLICATION TABLE OF N

//    Scanner sc = new Scanner(System.in);
//    System.out.println(" Enter the number ");
//    int num = sc.nextInt();
//
//    for ( int i = 1 ; i <= 10 ; i++ ){
//        System.out.println( num + " * " + i + " = "+ num*i );
//    }


//               take the user input so many numbers and then classify that numbers into
//                EVEN OR ODD NUMBERS and then print the sum of even and odd numbers


   /* Scanner sc = new Scanner(System.in);
    System.out.println(" how much numbers do you want to give as input :  ");
    int num = sc.nextInt();

    int even_sum = 0;
    int odd_sum = 0;
    for ( int i = 1 ; i <= num ; i++){
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        if ( n %2 == 0){
            even_sum +=n;
        }else {
            odd_sum +=n;
        }

    }
    System.out.println(" the sum of all the even numbers is " +  even_sum);
    System.out.println(" the sum of all the odd numbers is " +  odd_sum);
*/

    // FACTORIAL OF THE NUMBER

//    Scanner sc = new Scanner(System.in);
//    System.out.println(" Enter the number for factorial: ");
//    int num = sc.nextInt();
//    int fact = 1;
//    if ( num < 0){
//        System.out.println(" invalid input factorial can not be produced");
//    } else if (num == 0 || num == 1 ) {
//        System.out.println("factoial :  " + fact);
//    } else {
//        for ( i   nt i = 1 ; i <= num ; i++ ){
//            fact = fact * i ;
//        }
//        System.out.println(" the factorial is "+ fact);
//
//    }
//}

    //    OR
    //   BACKWARD LOOP APPROACH

//    Scanner sc = new Scanner(System.in);
//    System.out.println(" Enter the number for factorial: ");
//    int num = sc.nextInt();
//    int fact = 1;
//    if ( num < 0){
//        System.out.println(" invalid input factorial can not be produced");
//    } else if (num == 0 || num == 1 ) {
//        System.out.println("factoial :  " + fact);
//    } else {
//        for ( int i = num ; 1 <= i; i -- ){
//            fact = fact * i ;
//        }
//        System.out.println(" the factorial is "+ fact);
//
//    }


//    actually this code is also correct


}
}



