package temo;

public class CharacterDistance {

    public static int findDistance(String str, char char1, char char2) {
        int index1 = str.indexOf(char1);
        int index2 = str.indexOf(char2);

        if (index1 == -1 || index2 == -1) {
            System.out.println("One or both characters not found in the string.");
            return -1;
        }
        if (index1 > index2) {
            return index1 - index2;
        } else {
            return index2 - index1;
        }
    }

    public static void main(String[] args) {
        String str = "programming";
        char char1 = 'r';
        char char2 = 'm';
        int distance = findDistance(str, char1, char2);

        if (distance != -1) {
            System.out.println("The distance between '" + char1 + "' and '" + char2 + "' is: " + distance);
        }
    }
}


