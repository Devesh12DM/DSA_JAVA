import java.util.Scanner;

public class conditionalstatements{

    static void main() {
//        /*Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the bumber between 1 to 3");
//        int number = sc.nextInt();
//        switch (number){
//            case 1 :
//                System.out.println("hey, this is your samosa ");
//                break ;
//
//            case 2 :
//                System.out.println( "this is your maggie");
//                break ;
//
//            case 3 :
//                System.out.println(" this is your coke "  );
//                break ;
//
//            default:
//                System.out.println(" wake up to the reality ");
//        }*/
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the num a : ");
//        int num_a = sc.nextInt();
//        System.out.println("Enter the num b : ");
//        int num_b = sc.nextInt();
//        System.out.println(" the operations ");
//        char operator = sc.next().charAt(0);
//
//        switch (operator){
//            case '+' :
//                System.out.println(num_a+num_b );
//                    break;
//            case '-' :
//                System.out.println(num_a - num_b);
//                    break;
//            case '*' :
//                System.out.println(num_a * num_b);
//                    break;
//            case '/' :
//                System.out.println(num_a / num_b);
//            default:
//                System.out.println("incorrect operator");
//        }

//        HOMEWORK PROBLEMS


        //number is positive or negative
//        Scanner sc= new Scanner(System.in);
//        System.out.println(" Enter the number");
//        int num = sc.nextInt();
//        if(num>= 0 ){
//            System.out.println( num + " is positive ");
//        }
//        else{
//            System.out.println(num + " is negative ");
//        }


//         Do you have fever or not
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your current temperatur :");
//        double temp = sc.nextDouble();
//
//        if(temp >= 100) {
//            System.out.println("you have fever ");
//        }
//        else{
//            System.out.println("you dont have fever");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the day between 1 to 7 :");
//        int Day  = sc.nextInt();
//
//        switch (Day) {
//            case  1 :
//                System.out.println("sunday");
//                break;
//            case  2 :
//                System.out.println("monday");
//                break;
//            case  3 :
//                System.out.println("tuesday");
//                break;
//            case  4 :
//                System.out.println("wednesday");
//                break;
//            case  5 :
//                System.out.println("thursday");
//                break;
//            case  6 :
//                System.out.println("friday");
//                break;
//            case  7 :
//                System.out.println("saturday");
//                break;
//            default:
//                System.out.println("error");
//        }
        int i = 1;
        while (i<+5){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year  = sc.nextInt();

        if (year% 4 == 0){
            System.out.println(year + " is the LEAP Year");
        }
        else
        {
            System.out.println(year + " is not the LEAP Year ");
        }
        i++;
        }

    }
}


