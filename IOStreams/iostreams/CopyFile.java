package iostreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input file name: ");
        String input = sc.nextLine();

        System.out.print("Enter the output file name: ");
        String output = sc.nextLine();

        FileReader fr = new FileReader(input);
        FileWriter fw = new FileWriter(output);

        int ch;

        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();
        sc.close();

        System.out.println("File is copied.");
    }
}
