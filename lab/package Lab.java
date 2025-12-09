package Lab;

class Contact {
    private String phone;
    private String email;

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Phone: " + phone + ", Email: " + email;
    }
}

class Student {
    private String name;
    private Contact contact;   

    public Student(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public void showStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Contact: " + contact);
    }
}

class School {
    private String schoolName;
    private Student[] students;  
    private int count = 0;

    public School(String schoolName, int numberOfStudents) {
        this.schoolName = schoolName;
        this.students = new Student[numberOfStudents];  
    }

    public void addStudent(Student s) {
        if (count < students.length) {
            students[count] = s;
            count++;
        } else {
            System.out.println("Cannot add more students to " + schoolName);
        }
    }

    public void showSchool() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Students:");
        for (int i = 0; i < count; i++) {
            students[i].showStudent();
            System.out.println();
        }
    }
}

public class Task1 {
    public static void main(String[] args) {

        School sc = new School("ABC High School", 3);

        sc.addStudent(new Student("Rahim",
                new Contact("01711111111", "rahim@gmail.com")));

        sc.addStudent(new Student("Karim",
                new Contact("01822222222", "karim@gmail.com")));

        sc.addStudent(new Student("Sumaiya",
                new Contact("01933333333", "sumaiya@gmail.com")));

        sc.showSchool();
    }
}
