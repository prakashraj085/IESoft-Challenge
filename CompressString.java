import java.util.Scanner;

public class CompressString {

    public static String compressString(String str) {
        StringBuilder compressedString = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char nextChar = (i + 1 < str.length()) ? str.charAt(i + 1) : currentChar;

            if (currentChar == nextChar) {
                count++;
            } else {
                compressedString.append(count).append(currentChar);
                count = 1;
            }
        }
         
        String finalOutput = compressedString.toString() + "2ap0xkbvf4e";

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
        String finalOutput = compressString(inputString);
        System.out.println(finalOutput);
    }
}