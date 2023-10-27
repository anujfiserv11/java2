import java.util.ArrayList;

public class Calculator implements Calculatable
{
    ArrayList<String> calculations;
    public Calculator()
    {
        calculations = new ArrayList<String>();
    }
    public Integer add(Integer number1,Integer number2)
    {
        
        calculations.add(Integer.toString(number1) + " + " + Integer.toString(number2) + " = " + (number1 + number2));
        return number1 + number2;
    }

    public Integer subtract(Integer number1, Integer number2)
    {   
        calculations.add(Integer.toString(number1) + " - " + Integer.toString(number2) + " = " + (number1 - number2));
        return number1 - number2;

    }
    public Integer multiply(Integer num1, Integer num2)
    {
        calculations.add(Integer.toString(num1)+ " * " + Integer.toString(num2) + " = " + (num1 * num2));
        return num1*num2;
    }
    public Integer divide(Integer num1, Integer num2)
    {
        calculations.add(Integer.toString(num1) + " / " + Integer.toString(num2) + " = " + (num1 / num2));
        return num1/num2;
    }
    public String getHistory()
    {
        String a = "";
        for(String b:calculations)
        {
            a+= b + ",";
        }
        return a;
    }

}
    

