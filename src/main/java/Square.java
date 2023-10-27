public class Square extends Shape{
    int side;
    public Square(int s)
    {
        side = s;
    }
    public void draw()
    {
        for(int i=0; i < side;i++)
        {
            for(int j =0; j <side;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
