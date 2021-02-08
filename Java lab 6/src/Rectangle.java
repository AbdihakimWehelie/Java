public class Rectangle extends Shape
{
    int width;
    int height;

    public Rectangle(int h, int w)
    {
        super("rectangle");
        width=w;
        height=h;
    }




    @Override
    double Calculatearea()
    {
        Area=width*height;
        return Area;
    }




}
