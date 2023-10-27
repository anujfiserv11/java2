import java.util.*;
public class ShoppingCart{
    private ArrayList<Item> items;
    private double total;
    private double charge;
    public ShoppingCart()
    {
        items = new ArrayList<Item>();
        total = 0;
        charge = 0;
    }
    public ShoppingCart(double c)
    {
    items = new ArrayList<Item>();
        total = 0;
        charge = c;
    }

    public void addItem(Item a)
    {
        items.add(a);
    }
    public void calculateTotal()
    {
        total = 0;
        for(Item a: items)
        {
            if(a.price*a.quantity < 10)
            {
                total += 1.1*charge;
            }
            total += 1.1*a.price*a.quantity;
        }
        
    }
   
    public double getTotal()
    {
        return total;
    }
   
    
}
