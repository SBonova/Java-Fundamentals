package AssociativeArrays.MoreExercises;

import java.util.*;

public class E01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> contests = new LinkedHashMap<>();
        TreeMap<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end of contests")) {
            //You will receive some lines of input in the format "{contest}:{password for contest}"until you receive "end of contests"
            String[] tokens = input.split(":");
            String contest = tokens[0];
            String password = tokens[1];

            //Check if the contest is valid (if you received it in the first type of input)
            if (!contests.containsKey(contest)) {
                contests.put(contest, password);
            } else {
                contests.put(contest, password);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        //After that you will receive other type of inputs in format
        //"{contest}=>{password}=>{username}=>{points}" until you receive "end of submissions".
        while (!input.equals("end of submissions")) {
            String[] tokens = input.split("=>");
            String contest = tokens[0];
            String password = tokens[1];
            String userName = tokens[2];
            int userPoints = Integer.parseInt(tokens[3]);

            //Check if the password is correct for the given contest
            if (contests.containsKey(contest)) {
                if (contests.get(contest).equals(password)) {

                    //Save the user with the contest they take part in (a user can take part in many contests) and the points the user has in the given contest.
                    // If you receive the same contest and the same user, update the points only if the new ones are more than the older ones.
                    LinkedHashMap<String, Integer> course = new LinkedHashMap<>();
                    course.put(contest, userPoints);

                    if (!users.containsKey(userName)) {
                        users.put(userName, course);
                    } else {
                        if (!users.get(userName).containsKey(contest)) {
                            users.get(userName).put(contest, userPoints);
                        } else {
                            users.get(userName).put(contest, Math.max(userPoints, users.get(userName).get(contest)));
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

        //At the end you have to print the info for the user with the most points in the format
        // "Best candidate is {user} with total {total points} points.".
        int totalSum = 0;
        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet()) {
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > totalSum) {
                totalSum = sum;
            }
        }

        //
        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet()) {
            if (user.getValue().values().stream().mapToInt(i -> i).sum() == totalSum) {
                System.out.printf("Best candidate is %s with total %d points.%n", user.getKey(), totalSum);
            }
        }

        System.out.println("Ranking:");
//After that print all students ordered by their names. For each user print each contest with the points in descending order.
        users.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });
        }
    }

