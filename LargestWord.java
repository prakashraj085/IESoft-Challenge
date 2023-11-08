import java.util.Scanner;

public class LargestWord{

    public static String largestWord(String sen) {
        String[] words = sen.split("[^a-zA-Z0-9]+");

        int longestWordIndex = 0;
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWordIndex) {
                longestWord = words[i];
                longestWordIndex = words[i].length();
            }
        }

        String finalOutput = longestWord + "2ap0xkbvf4e";

        for (int i = 3; i < finalOutput.length(); i++) {
            if(i%4==0){
            finalOutput = finalOutput.substring(0, i-1) + "_" + finalOutput.substring(i);
            }
        }

        return finalOutput;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String finalOutput = largestWord(inputString);
        System.out.println(finalOutput);
    }
}
