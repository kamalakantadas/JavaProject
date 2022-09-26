package kk.java.desingstar;

public class Design3 {
    public static void main(String[] args) {
         for(int i=0;i<5;i++){
             /*
             * 00 01 02 03 04
             * 10 11 12 13
             * 20 21 22
             * 30 31
             * 40
             * */
           for(int j=5;j>i;j--){
               System.out.print("  +");
           }
            System.out.println();
        }

    }
}
