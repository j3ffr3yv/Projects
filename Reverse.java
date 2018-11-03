//Written by:  Jeffrey Viramontes
//Description: Reverses the numbers entered.

public class Reverse
{
   public static void main(String[]args)
   {
      //Create Scanner
      java.util.Scanner input = new java.util.Scanner(System.in);
      
      //Description to user
      System.out.println("This program collects 10 numbers and displays in reverse. ");
      
      //Array for numbers entered
      int[] numbers=new int[10];
      
      //Instruction to user
      System.out.print("Enter 10 numbers: ");
      
      //loop for user input
      for(int i=0;i<numbers.length;i++)
      {
         numbers[i]=input.nextInt();
      }
         //loop to display the numbers in reverse
         for (int i = numbers.length - 1; i >= 0; i--) 
         {
            System.out.print(numbers[i] + " ");
         }
   }
}
