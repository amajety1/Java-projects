// Base class representing a person
class Person {
    // Fields
    private String name;
    private int age;
    private String gender;

    // Constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Method to print person's information
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

// Derived class representing a student, inheriting from Person
class Student extends Person {
    // Additional fields specific to Student
    private String major;

    // Constructor
    public Student(String name, int age, String gender, String major) {
        super(name, age, gender);
        this.major = major;
    }

    // Getter and setter for major
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Override printInfo() method to include major
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Major: " + major);
    }
}

// Derived class representing a teacher, inheriting from Person
class Teacher extends Person {
    // Additional fields specific to Teacher
    private String subject;

    // Constructor
    public Teacher(String name, int age, String gender, String subject) {
        super(name, age, gender);
        this.subject = subject;
    }

    // Getter and setter for subject
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Override printInfo() method to include subject
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Subject: " + subject);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of class Person, Student, and Teacher
        Person person = new Person("John Doe", 30, "Male");
        Student student = new Student("Alice Smith", 20, "Female", "Computer Science");
        Teacher teacher = new Teacher("Dr. Smith", 45, "Male", "Computer Science");

        // Accessing and printing information of objects
        System.out.println("Person:");
        person.printInfo();
        System.out.println();

        System.out.println("Student:");
        student.printInfo();
        System.out.println();

        System.out.println("Teacher:");
        teacher.printInfo();
    }
}
