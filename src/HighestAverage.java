import java.util.*;

public class HighestAverage {

    public static void main(String[] args) {
        String[][] studentsMarks = {
                {"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}
        };
        System.out.println("Highest Average Marks: " + findHighestAverage(studentsMarks));
    }

    public static double findHighestAverage(String[][] data) {

        Map<String, List<Integer>> studentMarks = new HashMap<>();
        for (String[] entry : data) {
            String student = entry[0];
            int marks = Integer.parseInt(entry[1]);

            if (studentMarks.containsKey(student)) {
                studentMarks.get(student).add(marks);
            } else {
                List<Integer> marksList = new ArrayList<>();
                marksList.add(marks);
                studentMarks.put(student, marksList);
            }
        }

        double highestAverage = Double.NEGATIVE_INFINITY;

        for (Map.Entry<String, List<Integer>> entry : studentMarks.entrySet()) {
            String student = entry.getKey();
            List<Integer> marksList = entry.getValue();

            double average = marksList.stream().mapToInt(Integer::intValue).average().orElse(0.0);

            if (average > highestAverage) {
                highestAverage = average;
            }
        }

        return highestAverage;
    }
}
