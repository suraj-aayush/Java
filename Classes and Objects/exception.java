public class exception {
    public static void main(String[] args) {
        int a=5,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("not divided by zero");
        }
        System.out.println("executed");
        

    }
}
