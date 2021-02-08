public class Triangle extends Shape
{
    int width;
    int height;



    public Triangle(int h, int w)
    {
        super("triangle");
        width=w;
        height=h;
    }

    @Override
    double Calculatearea()
    {
        Area= 0.5*(width*height);
        return Area;
    }





}
