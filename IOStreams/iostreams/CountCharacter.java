package iostreams;

import java.io.*;
import java.util.Scanner;

public class CountCharacter {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name");
        String fileName = sc.nextLine();

        System.out.println("Enter the character to be counted");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        FileReader fr = new FileReader(fileName);

        int c, count = 0;

        while ((c = fr.read()) != -1) {
            if (Character.toLowerCase((char) c) == ch) {
                count++;
            }
        }

        fr.close();

        System.out.println("File '" + fileName + "' has " + count +
                " instances of letter '" + ch + "'");
    }
}