public class AwesomeNumber {
    int number;
    public AwesomeNumber(int n)
    {
        number = n;
    }
    public static AwesomeNumber add(AwesomeNumber one, AwesomeNumber two)
    {
        return new AwesomeNumber(one.number + two.number);

    }
    public static AwesomeNumber subtract(AwesomeNumber one, AwesomeNumber two)
    {
        return new AwesomeNumber(one.number - two.number);

    }
    public String toString()
    {
        return Integer.toString(number);
    }
    public static void main(String[] args)
    {
        var n1 = new AwesomeNumber(4);
        var n2 = new AwesomeNumber(2);
        var result1 = AwesomeNumber.add(n1, n2);
        var result2 = AwesomeNumber.subtract(n1, n2);
        System.out.println(result1);
        System.out.println(result2);
    }

}
