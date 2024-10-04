package temo;

public class InsertUnderscore {

    public static String insertUnderscoreBetweenLowerAndUpper(String input) {
        StringBuilder result = new StringBuilder();

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            result.append(currentChar); // Append the current character

            // Check if the current character is lowercase and the next is uppercase
            if (i < input.length() - 1) {
                char nextChar = input.charAt(i + 1);
                if (Character.isLowerCase(currentChar) && Character.isUpperCase(nextChar)) {
                    result.append("_"); // Insert underscore
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "helloWorldExampleTest";
        String result = insertUnderscoreBetweenLowerAndUpper(input);

        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result);
    }
}

