import static java.lang.Math.pow;

public class Circle extends Shape
{
    int radius;


    public Circle(int r)
    {
        super("Circle");
        radius=r;
    }



    double Calculatearea()
    {
        Area=3.14*pow(radius,2);
        return Area;
    }


}
