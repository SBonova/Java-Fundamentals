package FinalExamTask.PF05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String rawActivationKey = scanner.nextLine();
        String instruction = scanner.nextLine();

        while (!instruction.equals("Generate")){
            String[] commands = instruction.split(">>>");//"Slice>>>3>>>7" ->["Slice", "3", "7"]
            String cases = commands[0];//["Slice"]

            switch (cases){
                case "Contains":
                    // • Contains>>>{substring} – checks if the raw activation key contains the given substring.
                    String substring = commands[1];

                    if (rawActivationKey.contains(substring)){
                      //  If it does prints: "{raw activation key} contains {substring}".
                        System.out.printf("%s contains %s",rawActivationKey, substring);
                    }else {  // ◦ If not, prints: "Substring not found!"
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":// Flip>>>Upper>>>3>>>14 abghijklmnopqrstuvwxyz becomes abgHIJKLMNOPQRstuvwxyz
                    //Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}
                    String upperLower = commands[1];
                    int startIndex = Integer.parseInt(commands[2]);
                    int endIndex = Integer.parseInt(commands[3]);
                    //Changes the substring between the given indices (the end index is exclusive) to upper or lower case.
                    String toChanges = rawActivationKey.substring(startIndex,endIndex);
                    if (upperLower.equals("Upper")){
                        toChanges = toChanges.toUpperCase();
                        StringBuilder flip = new StringBuilder();
                        flip.append(rawActivationKey);
                        flip.replace(startIndex, endIndex, toChanges);
                        rawActivationKey = flip.toString();
                    }else {//or Flip>>>Lower>>>5>>>7 abgHIJKLMNOPQRstuvwxyz becomes abgHIjkLMNOPQRstuvwxyz
                        toChanges = toChanges.toLowerCase();
                        StringBuilder flip = new StringBuilder();
                        flip.append(rawActivationKey);
                        flip.replace(startIndex, endIndex, toChanges);
                        rawActivationKey = flip.toString();
                    }
                    System.out.println(rawActivationKey);
                    break;
                case "Slice"://Slice>>>{startIndex}>>>{endIndex} t.e     1. Slice>>2>>6 abcdefghijklmnopqrstuvwxyz becomes abghijklmnopqrstuvwxyz
                    int startIndexSlice = Integer.parseInt(commands[1]);//startIndexSlice: 3
                    int endIndexSlice = Integer.parseInt(commands[2]);//endIndexSlice: 7

                    StringBuilder deletes = new StringBuilder();//delei2tes: "134softsf5ftun020rockz42"
                    deletes.append(rawActivationKey);//rawActivationKey:"134softsf5ftuni2020rockz42"
                    deletes.replace(startIndexSlice, endIndexSlice, "");// 3 7
                    rawActivationKey = deletes.toString();//delei2tes: "134softsf5ftun020rockz42"

                    System.out.println(rawActivationKey);//rawActivationKey:"134sftuni2020rockz42"
                    break;
                default:
                    throw new IllegalStateException("wrong input!");
            }
            instruction = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", rawActivationKey);
    }
}
