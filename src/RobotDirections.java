public class RobotDirections {

    public static int[] finalCoordinates(String directions) {
        int x=0, y=0;
        String[] dirArray;
        if(directions.contains(" ")) {
            dirArray = directions.split(" ");
        } else {
            dirArray = directions.split("");
        }

        for(int i=0;i<dirArray.length;i++) {
            String dir = dirArray[i];
            if(dir.contains("x")) {
                String[] parts = dir.split("x");
                int count = Integer.parseInt(parts[0]);
                String direction = parts[1];
                switch (direction) {
                    case "up" : y+=count;
                                break;
                    case "down" : y-=count;
                        break;
                    case "left" : x-=count;
                        break;
                    case "right" : x+=count;
                        break;
                }
            }
            else {
                switch (dir) {
                    case "u", "up" : y++;
                        break;
                    case "d", "down" : y--;
                        break;
                    case "l", "left" : x--;
                        break;
                    case "r", "right" : x++;
                        break;

                }
            }
        }

        return new int[] {x, y};
    }

    public static void main(String[] args) {
        // Example 1: UUU
        String directions1 = "UUU".toLowerCase();
        int[] result1 = finalCoordinates(directions1);
        System.out.println("Final coordinates after 'UUU': (" + result1[0] + ", " + result1[1] + ")");

        // Example 2: URRDDL
        String directions2 = "URRDDL".toLowerCase();
        int[] result2 = finalCoordinates(directions2);
        System.out.println("Final coordinates after 'URRDDL': (" + result2[0] + ", " + result2[1] + ")");

        // Additional Testcase: DOWN UP 2xRIGHT DOWN 3xLEFT
        String directions3 = "DOWN UP 2xRIGHT DOWN 3xLEFT".toLowerCase();
        int[] result3 = finalCoordinates(directions3);
        System.out.println("Final coordinates after 'DOWN UP 2xRIGHT DOWN 3xLEFT': (" + result3[0] + ", " + result3[1] + ")");
    }

}
