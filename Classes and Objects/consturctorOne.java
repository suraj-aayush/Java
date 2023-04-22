import java.util.*;

class employee {
    int mob;
    String name;

    employee(int number, String names) {
        mob = number;
        name = names;
    }

    void display() {
        System.out.println(mob + " " + name);
    }
}

public class consturctorOne {
    public static void main(String[] args) {
        employee emp = new employee(7555555,"jaa bhaaag");
    emp.display();
    }
    
}
