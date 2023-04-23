class student{
    int roll;
    String name;
    student (int n, String naam)
    {
        roll=n;
        name=naam;
    }
    student(student s2)
    {
        roll=s2.roll;
        name=s2.name;
    }
    void display()
    {
        System.out.println(roll+" "+name);
    }
}

public class CopyConstructor{
    public static void main(String[] args) {
        student s1=new student(2,"aayush");
        student s=new student(s1);
        s.display();
        System.out.println("new");
        s1.display();
    }
}