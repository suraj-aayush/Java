import java.util.*;

interface myinter
{
    void volume();
}

class cone implements myinter
{
    int r,h;
    cone(int r, int  h)
    {
        this.r=r; this.h=h;
    }
   public void volume()
    {
        System.out.println(0.33 * r*r*h);
    }
}

public class fifteenshapes {
    public static void main(String[] args) {
        cone sc = new cone(1,1);
        sc.volume();
    }
}
