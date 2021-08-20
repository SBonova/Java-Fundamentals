package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E09Camino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dnaLength = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int[] bestSequence = new int[dnaLength];
        int bestSequenceLength = 0;
        int bestSequenceIndex = 0;
        int minIndex = dnaLength;
        int bestSum = 0;

        int sequenceIndex = 0;
        while (!command.contains("Clone them!")) {
            sequenceIndex++;
            int[] sequence = Arrays.stream(command.split("!+"))
                    .mapToInt(Integer::parseInt).limit(dnaLength).toArray();

            int currentLen = 0,
                    currentSum = 0,
                    longestLen = 0,
                    startIndex = 0;

            for (int i = 0; i < sequence.length; i++) {
                currentSum += sequence[i];

                if (sequence[i] == 1) {
                    currentLen++;
                } else {
                    currentLen = 0;
                }

                if (currentLen > longestLen) {
                    longestLen = currentLen;
                    startIndex = i - currentLen + 1;
                }
            }

            if ((longestLen > bestSequenceLength)
                    || (longestLen == bestSequenceLength && minIndex > startIndex)
                    || (longestLen == bestSequenceLength && minIndex == startIndex && currentSum > bestSum)) {
                bestSequenceLength = longestLen;
                bestSequence = sequence;
                bestSequenceIndex = sequenceIndex;
                bestSum = currentSum;
                minIndex = startIndex;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.\n", bestSequenceIndex, bestSum);
        for (int num : bestSequence) {
            System.out.printf("%d ", num);
        }
    }
}

