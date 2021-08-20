package Lists.Exercese;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочита първият ред от конзолата//"Ivo Johny Tony Bony Mony"
        String namesInput = scanner.nextLine();
        //прави го на масив namesInput["Ivo Johny Tony Bony Mony"]
        List<String> names = Arrays.stream(namesInput.split("\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();
        //•   "merge {startIndex} {endIndex}" -> split("\\s+") -> ["merge", "{startIndex}", "endIndex"]
        //•   "divide {index} {partitions}" ->split("\\s+") -> ["divide", "{index}", "partitions"]
        while(!command.equals("3:1")) {
            //прочита всеки следващ ред, като започва от вторият ред на конзолата - merge 0 3
            String [] commandData = command.split("\\s+");
            //прочита елемента на нулева позиция
            String commandName = commandData[0]; //merge or divide

            if(commandName.equals("merge")) {
                //прочита елемента на първа позиция
                int startIndex = Integer.parseInt(commandData[1]);
                //прочита елемента на втора позиция
                int endIndex = Integer.parseInt(commandData[2]);
                if(startIndex < 0) {
                    startIndex = 0;
                }
                if(endIndex > names.size() - 1) {
                    endIndex = names.size() - 1;
                }
                //проверка за индексите
                boolean isStartIndexValid = isValidIndex(startIndex, names.size());
                boolean isEndIndexValid = isValidIndex(endIndex, names.size());

                //ако са валидни и двата
                if(isStartIndexValid && isEndIndexValid) {
                    //{abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
                    StringBuilder resultMerge = new StringBuilder();
                    for (int index = startIndex; index <= endIndex; index++) {
                        resultMerge.append(names.get(index));
                    }
                    for (int index = startIndex; index <= endIndex; index++) {
                        names.remove(startIndex);
                    }
                    names.add(startIndex, resultMerge.toString());
                }
            } else if (commandName.equals("divide")) {
                int index = Integer.parseInt(commandData[1]);
                int partitions = Integer.parseInt(commandData[2]);
                String elementForDivide = names.get(index);
                //{abcdef, ghi, jkl} -> {ghi, jkl}
                names.remove(index);
                //"abcdef" -> 6 / 3 = 2
                int partSize = elementForDivide.length() / partitions;
                int begin = 0;

                for (int part = 1; part < partitions; part++) {
                    names.add(index, elementForDivide.substring(begin, begin + partSize));
                    index++;
                    begin += partSize;
                }

                names.add(index, elementForDivide.substring(begin));

            }
            command = scanner.nextLine();
        }

        System.out.println(String.join(" ", names));

    }

    public static boolean isValidIndex(int index, int size) {
        return index >= 0 && index <= size - 1;
    }
}
