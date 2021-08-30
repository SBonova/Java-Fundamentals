package FinalExam14082021;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //?- да се реща 0 или един път
        String productRegex = "^(.*)>(?<firstGrup>[0-9]+)\\|(?<word>[a-z]+)\\|(?<upper>[A-Z]+)\\|([^<>]*)<\\1$";
        Pattern pattern = Pattern.compile(productRegex);

        for (int i = 0; i < n; i++) {
            String password = scanner.nextLine();
            //валиден баркод
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                String password1 = matcher.group(2);
                String password2 = matcher.group(3);
                String password3 = matcher.group(4);
                String password4 = matcher.group(5);

                System.out.println("Password: "+password1+password2+password3+password4);

            }else {
                System.out.println("Try another password!");
            }
        }
    }
}
