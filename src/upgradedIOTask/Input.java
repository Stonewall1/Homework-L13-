package upgradedIOTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    private static List<String> input() {
        // src//upgradedIOTask//Docs1.txt

        List<String> listOfFilesPaths = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path of files , enter 0 to stop");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("0")) {
                break;
            }
            listOfFilesPaths.add(line);
        }
        return listOfFilesPaths;
    }

    public static List<String> getInput() {
        return input();
    }
}
