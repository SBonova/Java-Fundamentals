package TextProcessing.Exercise;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Тип дани в който съхраняваме инфо- String, int, double...
        //в "" вси1ко се приема за текст
        String text = "sdgdfhjykj";
                //взимаме всеки симбол на съответният индекс
                char[] symbols = text.toCharArray();
        System.out.println(text.length());//брой симболи
        System.out.println(text.replace('e', 'r'));
        text.equals("");//Прави разлика м/у главни и малки букви
                text.equalsIgnoreCase("");//неправи разлика между главни и малки букви
        text.split("");//връща елементите на масив,който са разделени със дадения разделител
        text.trim();//Одрязва празните места отпред и отзад на нашият текс
        text.toUpperCase();//Прави всички букви главни
        text.toLowerCase();//Прави всички букви малки


        //в BigInteger -съхраняваме много големи цели числа
        //в BigDecimal- съхраняваме много големи дробни числа



    }
}
