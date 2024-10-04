package temo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OrderIDExtractor {

    public static String extractOrderID(String text) {
        // Regex pattern to find an order ID (example: "ORD123456")
        String orderIDPattern = "ORD\\d+";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(orderIDPattern);

        // Match the pattern in the input text
        Matcher matcher = pattern.matcher(text);

        // If a match is found, return the matched order ID
        if (matcher.find()) {
            return matcher.group(0);
        } else {
            return "Order ID not found";
        }
    }

    public static void main(String[] args) {
        // Example input string
        String text = "Your order has been processed. Order ID: ORD123456. Please keep it for your records.";

        // Extract the Order ID from the text
        String orderID = extractOrderID(text);

        // Print the result
        System.out.println("Extracted Order ID: " + orderID);
    }
}

