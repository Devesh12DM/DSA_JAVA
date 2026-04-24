import org.w3c.dom.ls.LSOutput;

public class patterns {
     static  void  main() {
//
//         for (int i = 1 ; i <= 5 ; i++ ){
//             for ( int j= 1 ; j <= i ; j++ ){
//                 System.out.print(" * ");
//             }
//             System.out.println( );
//         }
//             *
//             *  *
//             *  *  *
//             *  *  *  *
//             *  *  *  *  *


//         for (int i = 5 ; i >= 1 ; i-- ){
//             for ( int j= 1 ; j <= i ; j++ ){
//                 System.out.print(" * ");
//             }
//             System.out.println( );
//         }


         for ( int line = 1 ; line <= 5 ; line++ ){
             for ( int i = 1 ; i <= line; i++){
                 System.out.print(i);
             }
             System.out.println();
         }






     }
}
