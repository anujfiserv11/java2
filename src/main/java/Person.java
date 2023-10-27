public class Person extends Animal
{
    String firstname;
    String lastname;
    
    int num;
    public Person()
    {
        firstname = "";
        lastname = "";
        super.age = 0;
        num = 0;
    }
    public Person(String f,String l)
    {
        firstname = f;
        lastname = l;

    }
    public Person(String f,String l, byte a,int n)
    {
        firstname = f;
        lastname = l;
       super.age = a;
        num = n;
    }
    public String speak()
    {
        if(firstname.equals(""))
        {
            return "I don't have a name.";
        }
        else
        {
        if(age == 0)
        {
        return "My name is " + firstname + " " + lastname + ".";
        }
        else
        {
           return "My name is " + firstname + " " + lastname + " and I am " + super.age + " years old.";
        }
    }
    }
    public static int getPersonCount()
    {
        return 3;
    }
    public String toString()
    {
        if(firstname == "")
        {
            return "N/A";
        }
        if(num == 0)
        {
            return firstname + " " + lastname;
        }
        else{
            int f= num;
            int a =0;
            for(int i=0; i < 4;i++)
            {
             a+= f%10 * Math.pow(10,i);
             f = f/10;   
            }
            return firstname + " " + lastname + " " + a;
        }
    }
    public static void main(String[] args)
    {
        var p1 = new Person();
        var p2 = new Person("Jon", "Smith");
        var p3 = new Person("Mary", "Jane", (byte) 12, 123456789);

        System.out.println(p1.speak());
        System.out.println(p2.speak());
        System.out.println(p3.speak());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Person count: " + Person.getPersonCount());
    }
}