package day3.assignment3;

import java.util.Arrays;

public class JaggedArray {

    public static void main(String[] args) {
        String[][] jaggedArray = {{"Tony", "Java", "C", "C++"}, {"Thomas", "Java", "Unix"},
                {"Dinil", "Linux", "Oracle"}, {"Delvin", "RDBMS", "C#", "Oracle"}};

        for(String[] array: jaggedArray) {
            for(String entry: array) {
                if(entry.equals("Dinil")) System.out.println(Arrays.toString(array));
            }
        }
    }

}
