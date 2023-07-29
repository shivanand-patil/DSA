//chinmay
package Arrays;

import java.util.ArrayList;
import java.util.List;



public class ArrayOperations {
    public static void main(String[] args) {
        String[] inputArray = {"5", "+", "2", "c", "3", "+"};
        List<Integer> outputArray = new ArrayList<>();
        processInputArray(inputArray, 0, outputArray);
        System.out.println("Output Array: " + outputArray);
    }

    public static void processInputArray(String[] inputArray, int index, List<Integer> outputArray) {
        if (index >= inputArray.length) {
            return;
        }
        String currentElement = inputArray[index];

        if (isInteger(currentElement)) {
            outputArray.add(Integer.parseInt(currentElement));
        } else if (currentElement.equals("d")) {
            int lastElement = outputArray.get(outputArray.size() - 1);
            outputArray.add(lastElement * 2);
        } else if (currentElement.equals("c")) {
            outputArray.remove(outputArray.size() - 1);
        } else if (currentElement.equals("+")) {
            int lastElement = outputArray.get(outputArray.size() - 1);
            if (outputArray.size() > 1) {
                int secondLastElement = outputArray.get(outputArray.size() - 2);
                outputArray.add(lastElement + secondLastElement);
            } else {
                outputArray.add(lastElement);
            }
        }

        processInputArray(inputArray, index + 1, outputArray);
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


