package Task3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPassword {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file/Password.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))){

            StringBuilder text = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line);
            }
            findPassword(String.valueOf(text),"[a-z]{8,}","Mustahkam parolllar ");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void findPassword(String text ,String regex ,  String description) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while (matcher.find()) {

            System.out.println(matcher.group());
        }

    }
}
