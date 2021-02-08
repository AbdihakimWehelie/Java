import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class tester
{

    public static void main(String[] args)
    {

        int i;
        int select;
        int area=0;
        Shape[] ShapeArray = new Shape[10];
        Random rand= new Random();

        Triangle tri=new Triangle(77,77);
        Circle cir= new Circle(22);
        Rectangle rec= new Rectangle(78,98);



        for(i=0; i<10; ++i)
        {

            select=rand.nextInt(3)+1;
            switch(select)
            {
                case 1:
                    ShapeArray[i]= new Circle(rand.nextInt(50)+1);
                    break;
                case 2:
                    ShapeArray[i]= new Triangle(rand.nextInt(50)+1,rand.nextInt(50)+1);
                    break;
                case 3:
                    ShapeArray[i]= new Rectangle(rand.nextInt(50)+1,rand.nextInt(50)+1);
                    break;
                default:
                    break;

            }


            //System.out.println(ShapeArray[i]);
            ShapeArray[i].Calculatearea();


        }


        Arrays.sort(ShapeArray);

        for (i=0;i<10; ++i)
        {
            System.out.println(ShapeArray[i]);
        }



    }


}
