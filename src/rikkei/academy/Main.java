package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "chinh");
        Student s2 = new Student(222, "toan");
        Student s3 = new Student(333,"dung");
        s1.display();
        s2.display();
        s3.display();
    }

}
