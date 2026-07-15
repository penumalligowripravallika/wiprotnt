package collections;

public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = (str) -> str.trim().split("\\s+").length;

        String s = "Java is very easy to learn";

        System.out.println("Sentence : " + s);
        System.out.println("Word Count : " + wc.count(s));
    }
}