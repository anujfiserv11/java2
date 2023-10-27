public class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double l,double w)
    {
        length = l;
        width = w;
    }
    public void draw()
    {
        for(int i=0; i < width;i++)
        {
            for(int j =0; j <length;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    
}
