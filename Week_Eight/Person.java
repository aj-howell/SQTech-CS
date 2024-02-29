package Week_Eight;

public class Person {
    public static void main(String[] args) {
        Person p = new Person(23, "Aj");
        System.out.println(p.toString());
    }
    
    //Attributes
    private int age;
    private String name;

    //constructor
    public Person(int age, String name)
    {
        this.name=name;
        this.age=age;
    }

    //Getters
    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    //Setters
    public void setAge(int age)
    {
        this.age=age;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    @Override
    public String toString()
    {
        return "{ Student name: "+getName()+" age: "+getAge()+" }";
    }
}
