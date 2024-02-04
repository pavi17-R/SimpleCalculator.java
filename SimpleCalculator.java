import java.util.Scanner;
public class SimpleCalculator
{
    public static void main(String[] args){
  int operator,n1 = 0,n2 = 0,result = 0;
  System.out.println("*****SELECT THE OPERATOR *****");
  System.out.println("1.ADDITION (+)");
  System.out.println("2.SUBTRACTION (-) ");
  System.out.println("3.MULTIPLICATION (*)");
  System.out.println("4.DIVISION (/) ");
  System.out.println("5.MODULUS (%)");
  System.out.println("6.EXPONENTIATION (^)");
  System.out.println("7.FLOOR DIVISION (//)");
  System.out.println("8.MAXIMUM (max)");
  System.out.println("9.MINIMUM (min)");
  System.out.println("10.ABSOLUTE VALUE (|X|)");
  System.out.println("11.SQUARE ROOT (√)");
  System.out.println("12.SINE (sin)");
  System.out.println("13.COSINE (cos)");
  System.out.println("14.TANGENT (tan)");
  System.out.println("15.NATURAL LOGARITHM (ln)");
  System.out.println("16.LOGARITHM (base 10)");
  System.out.println("17.NEGATION (-x)");
  System.out.println("Enter your choice (1-17):");
  Scanner sc = new Scanner(System.in);
  operator = sc.nextInt();
  if (operator >= 10 && operator <=17) {
   System.out.println("Enter number : ");
  n1 = sc.nextInt() ;
 } else {
 System.out.println("Enter number1 :");
  n1 = sc.nextInt();
  System.out.println("Enter number2 :");
  n2 = sc.nextInt();
 }
 switch(operator){
      case 1:
        result = n1 + n2;
        System.out.println("The sum of number1 and number2  :" + result);
        break;
      case 2:
        result = n1 - n2;
        System.out.println("The difference of number1 and number2  :" + result);
        break;
      case 3:
        result = n1 * n2;
        System.out.println("The product of number1 and number2  :" + result);
        break;
        case 4:
        if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println("The quotient of number1 and number2 : " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
        break;
        case 5:
                if (n2 != 0) {
                    result = n1 % n2;
                    System.out.println("The remainder of number1 and number2 : " + result);
                } else {
                    System.out.println("Cannot perform modulo with zero divisor.");
                }
                break;
        case 6:
            result =(int)Math.pow(n1,n2);
        System.out.println("The result is:" + result);
        break;
       case 7:
        if ( n2!=0){
           result = (int) n1 /(int) n2;
         System.out.println("The result : " + result);
        } else {
          System.out.println("Cannot perform floor division with zero divisor.");
      }
       break;
       case 8:
            result = Math.max(n1,n2);
        System.out.println("The maximum of number1 and number2 :"+ result);
        break;
         case 9:
            result = Math.min(n1,n2);
        System.out.println("The minimum of number1 and number2 :"+ result);
        break;
        case 10:
        System.out.println(" Absolute value of " + n1 + " :"+ Math.abs(n1));
        break;
        case 11:
        System.out.println("Square root of " + n1 +" :" +  Math.sqrt(n1));
        break;
        case 12:
        System.out.println(" Sine of " +n1+ ":" + Math.sin(Math.toRadians(n1)));
        break;
       case 13:
        System.out.println(" Cosine of " +n1+" :" + Math.cos(Math.toRadians(n1)));
        break;
       case 14:
        System.out.println(" Tangent of " +n1+" :" + Math.tan(Math.toRadians(n1)));
        break;
       case 15:
        System.out.println(" Natural logarithm of " +n1+ ":" + Math.log(n1));
        break;
       case 16:
        System.out.println("Logarithm base 10 of " +n1+" :" + Math.log10(n1));
        break;
        case 17:
        System.out.println("The result  : " + -n1);
        break;
        default:
        System.out.println("Invalid choice");
  }
}
}