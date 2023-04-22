class marryMe{
    int num;
    String name;
    double years;

    marryMe(int a,String naam)
    {
        num=a;
        name=naam;
    }
    marryMe(double a, String naam)
    {
        years=a;
        name=naam;
    }

    void display()
    {
        System.out.println(num+" "+name+" "+years);
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        marryMe yes = new marryMe(5, "raat");
        marryMe no = new marryMe(0.5,"mann nhi hai av");

        yes.display();
        no.display();

    }
}
