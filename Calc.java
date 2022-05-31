class Calc
{
// instance variable
 int a=10;
 int b=20;
 int c;

void add()
{
 c=a+b;
 System.out.println(a);
 System.out.println(b);
 System.out.println(c);
 
}

void square()
{
// local variable
 int sq=5;
 int area;
 area= sq*sq;
  System.out.println("The area of square inside method: "+area);
}

void display()
{
 System.out.println("The addition of 2 numbers: "+c);
// System.out.println("The area of square: "+area);
}
 public static void main(String args[])
 {
   Calc c=new Calc();
   c.add();
   c.square();
   c.display();
}
}
