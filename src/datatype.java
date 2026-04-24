import java.util.Scanner;

public class datatype {

    public static void main(String[] args) {
//        System.out.println("What is you name ");
//        Scanner sc = new Scanner(System.in);

//        String name = sc.next();
//        System.out.println(name);
//        System.out.println("write your full name ");
//        String full_name = sc.nextLine();
//        System.out.println(full_name);
//
//        System.out.println("cdwrite the number");
//        int number = sc.nextInt();
//        System.out.println("you gave the number is " + number );
//
//        System.out.println("is your age is true");
//        boolean age = sc.nextBoolean();
//        System.out.println("it is  " + age );
//
//        System.out.println("what was your percentage in the class X ");
//        float percent = sc.nextFloat();
//        System.out.println("your percent was " + percent );

//        System.out.println("Enter the number 1");
//        int a = sc.nextInt();
//        System.out.println("Enter the number 2");
//        int b = sc.nextInt();
//        int c = a + b ;
//        System.out.println("the sum of the two numbers are " + c );

//        System.out.println("Enter the number 1");
//        int a = sc.nextInt();
//        System.out.println("Enter the number 2");
//        int b = sc.nextInt();
//        int c = a * b ;
//        System.out.println("the product of the two numbers are " + c );

//        System.out.println("Enter the value of the radius ");
//        int a = sc.nextInt();
//        double c = 3.142 * a * a ;
//        System.out.println("the area of the circle is  " + c + "cm" );


       /* #TYPE CONVERSION also known as IMPLICIT CONVERSION OR WIDENING CONVERSION
        byte<short<int<float<long<double.
        only smaller datatype can be fitted into the greater one
        i.e byte can fit into short ,
            int can fit into the float

            but int can not fit into the short
            or long can not fit into the int datatype
           */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        double number = sc.nextInt();
//        System.out.println("THE NUMBER YOU ENTER IS " + number);

        /*
         #TYPE CASTING also known as EXPLICIT CONVERSION OR NARROWING CONVERSION
                - when the datatype is bigger and then also we try to store it into the
                smaller datatype than this process is known as the type casting
                for ex. 5786798 this int value forcefully will be stored in the short
         */


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the decimal number ");
//        int  number = (int) sc.nextFloat();
//        System.out.println(" you gave the number is " + number);

//        THE UPPER CODE IS OF USER INPUT
//        THE BELOW CODE IS OF THE ALREADY GIVEN INPUT

//        int  a =(int) 79.7f;
//        System.out.println("the type casted (forcefully placed the smaller value \n datatype into the larger value datatyped) value is  " + a );

//        char ch = 'A';
//        int num = ch ;
//        System.out.println("the type converion of the character into the number is " + num );

        //HOMEWORK PROBLEM

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Price of pencil ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the Price of pen");
        float pen = sc.nextFloat();
        System.out.println("Enter the Price of eraser");
        float eraser = sc.nextFloat();

        float total_price = (pencil + pen + eraser)/18 *100 ;
        System.out.println("the total price is with added 18% GST is  " + total_price);
        */


        /* HOMEWORK PROBLEMS
//        int x = 2 , y = 5;
//
//        int exp1 = (x * y / x);
//        int exp2 = (x * (y / x));
//
//        System.out.println( exp1);
//        System.out.println( exp2 );
//
        */
//
//        int x= 200 ; int y = 50 , int z = 100;
//        if (x>y && y> z){
//            System.out.println("hello Devesh ");
//        }

        int x, y ,z;
        x=y=z=2;
        x+=y;
        y-=z;
        z/=(x+y);
        System.out.println( x + "," + y +"," + z    );

    }
}
