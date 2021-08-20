package MidExam2MidExamProgrammingFundamentalsMidExam;

import java.util.*;
import java.util.stream.Collectors;

public class E03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       // Лист който чете входните стойности
        List<Integer> list = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        //тук се презаписват най -големите стойности
        List<Integer>newList = new ArrayList<>();

        int sum = 0;
        //минава се през всяко едно число от листа
        for (Integer num: list) {
            sum += num;
        }
        //<10 20 30 40 50> -> Average number = 30. - средната сума
        double average = (double) sum / list.size();

        for (int i = 0; i < list.size(); i++) {
            //There are no numbers, greater than 1.
            if (list.size() == 2){
                System.out.println("No");
                break;
                // top 5 numbers that are greater than the average value in the sequence, sorted in descending order.
            }else if (average < list.get(i)){
                newList.add(list.get(i));
            }
        }
        Collections.sort(newList);
        Collections.reverse(newList);

        int count = 0;

        //обхожда нови лист и принтира, като всеки път увеличава с 1
        //по услови се принтират първите 5 най големи числа
        for (Integer num : newList) {
            System.out.print(num + " ");
            count++;
            //The top 5 numbers among
            if (count == 5){
                break;
            }
        }
    }
}

