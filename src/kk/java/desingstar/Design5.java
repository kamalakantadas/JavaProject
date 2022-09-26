package kk.java.desingstar;

public class Design5 {
    public static void main(String[] args) {
        /*

        * */
        for(int i=0;i<5;i++){
            /*00 01 02 03 04
              10 11 12 13
              20 21 22
              30 31
              40
            * */
            for(int j=5;j>i;j--){
                System.out.print("  ");

            }
            /*           00
                      10 11
                   20 21 22
                30 31 32 33
             40 41 42 43 44
            * */
            for(int j=0;j<=i;j++){
                System.out.print("% ");
            }
            System.out.println();
        }
    }
}
