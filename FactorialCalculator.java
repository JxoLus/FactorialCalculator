import java.util.Scanner;

class FactorialCalculatorV1
{
  
  private int number = 0;
  private int result = 1;
  
  public static void main (String[] args)
  {
    
    // xoLus FactorialCalculatorV1
    System.out.println("   -----xoLus-----\nFactorialCalculatorV1");
    System.out.println("hi");
    
    // operate
    FactorialCalculatorV1 operator = new FactorialCalculatorV1();
    operator.enter();
    operator.calculation();
    
  }
  
  private void calculation()
  {
    
    for (int i = 1; this.number >= i; i++)
    {
      
      this.result = this.result * i;
      
    }
    
    System.out.println(this.number + "! = " + this.result);
    
  }
  
  private void enter()
  {
    
    // get number
    System.out.println("Enter Number");
    Scanner sc = new Scanner(System.in);
    this.number = sc.nextInt();
    sc.close();
    
   }
  
}