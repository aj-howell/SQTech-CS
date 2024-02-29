package Week_Five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class MyIO {
    public static void main(String[] args) {
        //writeText("Hello World", "C:/Users/anazj/OneDrive/Desktop/IOexample.txt");
        readText("C:/Users/anazj/OneDrive/Desktop/IOexample.txt");
        System.out.println();
        pathNames("C:/Users/anazj/OneDrive/Desktop/AJ");
    }

    public static void writeText(String s, String path)
    {
        Path p = Path.of(path);

        try( BufferedWriter writer = Files.newBufferedWriter(p, StandardCharsets.UTF_8);) {
            writer.write(s);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void readText(String path)
    {
         Path p = Path.of(path);

         try (BufferedReader reader = Files.newBufferedReader(p)) {

            String line = reader.readLine();

            while(line != null)
            {
                System.out.println(line);
                line=reader.readLine();
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void pathNames(String path)
    {
        Path p = Path.of(path);

        try {
           Stream<Path> paths= Files.walk(p, FileVisitOption.values());
           paths.forEach(fp->
           {    
                System.out.println(fp);
           });
           paths.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
