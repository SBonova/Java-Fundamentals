package Methods.Lab;

import java.util.Scanner;

public class returnMethods {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);

        System.out.println(getMax(69, 42));

    }

   static int getMax(int first, int second) {
        if (first > second){
            return first;
        }else {
            return second;
        }
    }
}
