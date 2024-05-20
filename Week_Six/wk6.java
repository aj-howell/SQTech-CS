package Week_Six;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Week_Eight.Person;

class Pair
{
    Person p1;
    Person p2;
    public Pair(Person p1, Person p2)
    {
        this.p1=p1;
        this.p2=p2;
    }

}

//swapped week 6 to 8 
public class wk6 {
    public static void changeNameToThomas(List<String> names) {
        Random random = new Random();
        int randomIndex = random.nextInt(names.size());
        names.set(randomIndex, "Thomas");
    }

    public static void writeNamesToFile(List<String> names, String filename) {
        Path p = Path.of(filename);
        try (BufferedWriter writer = Files.newBufferedWriter(p, StandardCharsets.UTF_8)) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readNamesFromFile(String filename) {
        List<String> names = new ArrayList<>();
        Path p = Path.of(filename);
        
        try (BufferedReader reader = Files.newBufferedReader(p)) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }

    public static List<Person> createPeople(List<String> names) {
        List<Person> people = new ArrayList<>();
        Random random = new Random();
        for (String name : names) {
            int age = random.nextInt(13) + 18; // Age between 18 and 30
            people.add(new Person(age, name));
        }
        return people;
    }

    public static void writePeopleToFile(List<Person> people, String filename) {
        Path p = Path.of(filename);
        try (BufferedWriter writer = Files.newBufferedWriter(p, StandardCharsets.UTF_8)) {
            for (Person person : people) {
                writer.write(person.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Pair getMarried(Person p1, Person p2)
    {

        if(p1.married==false && p2.married==false)
        {
            p1.married=true;
            p2.married=true;
        }   

        return new Pair(p1, p2);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bob");
        names.add("Jack");
        names.add("Jimmy");
        names.add("Peter");
        names.add("Larry");

        changeNameToThomas(names);
        writeNamesToFile(names, "Week_Six/names.txt");
        names = readNamesFromFile("Week_Six/names.txt");

        List<Person> people = createPeople(names);
        writePeopleToFile(people, "Week_Six/people.txt");

        for (Person person : people) {
            System.out.println(person);
        }

        //marry as many persons as you can & store the pairs of married people into an array of pairs 
    }
}
