package yashas;

class Student {
    int rollNo = 101;
    String name = "Kiran";

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class exp1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
