class Fruit
{
    String name,taste,size;
    Fruit(String n,String t,String s)
    {
        name = n;
        taste =t;
        size =s;
    }
    void eat()
    {
        System.out.print(name+" "+taste);
    }
}
class Apple extends Fruit
{
    Apple(String n,String t,String s)
    {
    super(n,t,s);
    
}
@Override
void eat()
{
      System.out.print(name+" "+taste);
}
}
class Orange extends Fruit
{
    Orange(String n,String t,String s)
    {
    super(n,t,s);
    }
 @Override
void eat()
{
      System.out.print(name+" "+taste);
}  
    
}
class Fruitcheck
{
    public static void main(String args[])
    {
        Apple a =  new Apple("Apple","Sweet","Heart");
        Orange o =  new Orange("Orange","Sweet","Round");
        a.eat();
        o.eat();
    }
}