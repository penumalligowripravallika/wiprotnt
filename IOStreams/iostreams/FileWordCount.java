package iostreams;

import java.io.*;
import java.util.*;

public class FileWordCount {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input file name: ");
        String input = sc.nextLine();

        System.out.print("Enter output file name: ");
        String output = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(input));

        TreeMap<String, Integer> map = new TreeMap<>();

        String line;

        while ((line = br.readLine()) != null) {

            String[] words = line.split("\\s+");

            for (String word : words) {

                if (map.containsKey(word))
                    map.put(word, map.get(word) + 1);
                else
                    map.put(word, 1);
            }
        }

        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(output));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            bw.write(entry.getKey() + " : " + entry.getValue());
            bw.newLine();
        }

        bw.close();
        sc.close();

        System.out.println("Word count written to " + output);
    }
}