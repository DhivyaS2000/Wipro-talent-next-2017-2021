Person.java
public class Person
{
  private String name;
  public Person(String n)
  {
    name=n;
  }
  public void setName(String n)
  {
    name=n;
  }
  public String getName()
  {
    return name;
  }
  public String toString()
  {
    return name;
  }
}
Employee.java
  
public class Employee extends Person
{
  private double annual_salary;
  private int emp_yr;
  private String insurance_no;
  
  public Employee(String n,double a,int y,String i)
  {
    super(n);
    annual_salary=a;
    emp_yr=y;
    insurance_no=i;
  }
  public void setSalary(double a)
  {
    annual_salary=a;
  }
  public void setYear(int y)
  {
    emp_yr=y;
  }
  public void setInsurance_no(String i)
  {
    insurance_no=i;
  }
  public double getSalary()
  {
    return annual_Salary;
  }
  public int getYear()
  {
    return emp_yr;
  }
  public String getInsurance_no()
  {
    return insurance_no;
  }
  public String toString()
  {
    return super.toString()+" "+annual_salary+" "+emp-yr+" "+insurance_no;
  }
}
TestEmployee.java
public class TestEmployee
{
  public static void main(String[] args)
  {
    Person p=new Person("Thomas");
    Employee e=new Employee("Edison",20000,2019,"abcd");
    System.out.println(p);
    System.out.println(e);
  }
}
                       
                  
    