package h_you.demo;

public class Person {
    private String name;
    private int age;

    public Person() {
        this("Unnamed");
    }
    public Person(String name) {
        this(name, 18);
    }
    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return calcAge();
    }
    private int calcAge() {
        return this.age + 1;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Invalid age value!");
        }
        this.age = age;
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    public static int count;
    public static int getCount() { return count;}

    public void run() {
        System.out.println("Person.run");
    }
    public static void main (String[] args) {
        var person = new Student("TestUser", 7, 60);
        var teacher = new Teacher();
        System.out.println(teacher.getName() + "'s age: " + teacher.getAge());

        var group = new Group();
        group.setNames("1", "2", "3");
        System.out.println(person.getName() + "'s age is " + person.getAge());

        Person p = new Person("xiao ming", 12);
        Student s = new Student("xiao hong", 20, 99);
        Student ps = new PrimaryStudent("xiao jun", 9, 100, 5);
        System.out.println(ps.getName() + "'s score is " + ps.getScore());
        s.run();
    }
}

class Group {
    private String[] names;

    public String[] getNames() {
        return this.names;
    }
    public void setNames(String... names) {
        this.names = names;
    }
}

class Student extends Person {
    private int score;
    protected Book book;
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}

class PrimaryStudent extends Student {
    private int grade;
    public PrimaryStudent(String name, int age, int score, int grade) {
        super(name, age, score);
        this.grade = grade;
    }
}
class Teacher extends Person {
    private String lessonName;

    public String getLessonName() {
        return lessonName;
    }
}

class Book {
    protected String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
