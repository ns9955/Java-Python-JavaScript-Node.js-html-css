import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class module3ProjectCrypto{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Script to Normalize: ");
        String text = input.nextLine();
        System.out.println("Enter SHIFT value: ");
        int shift = input.nextInt();
        System.out.println(normalizeText(text));
        System.out.println(caesarify(text, shift));
    } // PART I - Normalize Text
    public static String normalizeText(String text){
        text = text.replaceAll("\\s+", "");
        text = text.replaceAll("\\p{Punct}", "");
        text = text.toUpperCase();
        return text;
    } // PART II - Caesar Cipher
    public static String shiftAlphabet(int shift){
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }
    public static String caesarify(String text, int shift){
        String aToZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedaToZ = shiftAlphabet(shift);
        String result ="";
        for (int i=0; i<text.length(); i++){
            int letter = text.charAt(i);
            char currChar = (char)letter;
            int index = aToZ.indexOf(currChar);
            char newChar = shiftedaToZ.charAt(index);
            result = result+newChar;
        }
        return result;
    }
}

