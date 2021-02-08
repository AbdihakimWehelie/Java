public abstract class Shape implements Comparable<Shape>
{
    static int counter=0;
    int id;
    String label;
    double totalArea;
    double Area;

    public Shape(String label){
        this.label=label;
        counter++;
        this.id=counter;
    }





    abstract double Calculatearea();


    public String toString() // when an object is called, prints out statement
    {
        return "The area of a "+ label +"(ID: "+id+") is " +Calculatearea();
    }

    public int compareTo(Shape a)
    {
        if (this.Area< a.Area)
            return 1;
        else
            return -1;
    }



}
