package rikkei.academy;

public class Student {

        private int rollNo;
        private String name;
        private static String college = "BBDIT";

        Student(int r, String n){
            rollNo = r;
            name= n;

        }
        static void change(){
            college = " rikkei academy";
        }
        void display(){
            System.out.println(rollNo + " " + name + " " + college);
        }
    }


