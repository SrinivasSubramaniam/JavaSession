import java.util.*;
import java.io.*;

class LoopsII{
    public static void main(String []argh){Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c =a;
            if ((t>=0&&t<=500)&&(a>=0&&a<=50)&&(b>=0&&b<=50)&&(n>=1&&n<=15)) {
                for (int j = 0; j < n; j++) {
                    int d = (int) Math.pow(2, j) * b;
                    c = c + d;
                    System.out.print(c + " ");
                } 
                System.out.println();
            }else
            {
                System.out.println("Please provide the valid input");
            }

    }
        in.close();
    }
}
