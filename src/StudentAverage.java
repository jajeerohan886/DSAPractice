import java.util.HashMap;
import java.util.Map;

public class StudentAverage {

    public static void main(String[] args) {
        // Input data: Student names and corresponding marks
        String[][] data = {
                {"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"John", "23"},
                {"Charles", "20"}
        };

        // Call the method to find the student with the highest average marks
        String result = findStudentWithHighestAverage(data);
        System.out.println(result); // Output: John 61
    }

    public static String findStudentWithHighestAverage(String[][] data) {
        // Map to store student names and their total marks and count
        Map<String, int[]> studentMap = new HashMap<>();

        // Process each entry in the input data
        for (String[] entry : data) {
            String name = entry[0];
            int marks = Integer.parseInt(entry[1]);

            // If student is already in the map, update their total marks and count
            if (studentMap.containsKey(name)) {
                int[] stats = studentMap.get(name);
                stats[0] += marks; // Update total marks
                stats[1] += 1;     // Increment count
            } else {
                // If student is not in the map, add them with initial marks and count
                studentMap.put(name, new int[]{marks, 1});
            }
        }

        // Variables to track the student with the highest average
        String topStudent = "";
        double highestAverage = Double.NEGATIVE_INFINITY;

        // Calculate the average for each student and find the highest
        for (Map.Entry<String, int[]> entry : studentMap.entrySet()) {
            String name = entry.getKey();
            int[] stats = entry.getValue();
            double average = (double) stats[0] / stats[1];

            // Update if this student's average is higher than the current highest
            if (average > highestAverage) {
                highestAverage = average;
                topStudent = name + " " + (int) average; // Store name and floored average
            }
        }

        return topStudent;
    }
}
