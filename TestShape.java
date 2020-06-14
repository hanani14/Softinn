import java.util.Scanner;
import java. util.*;
public class TestShape{

	public static void main(String[] args)
	{	Scanner in = new Scanner(System.in);
		Scanner sh = new Scanner(System.in);
		Triangle t = new Triangle();
		Square s = new Square();
		Diamond d = new Diamond();

		System.out.println("Hello, please select which shape to be displayed: ");
		System.out.println("[Option: 'S' = Square, 'T' = Triangle, 'D' = Diamond] ");
		char input = in.next().charAt(0);

		input = Character.toUpperCase(input);


		switch(input) {
		         case 'S' :
			        System.out.println("Please key in the size of the shape: ");
		   		    int shape = sh.nextInt();
		         	s.printSquare(shape);
		            break;
		         case 'T' :
		            System.out.println("Please key in the size of the shape: ");
				    int shape2 = sh.nextInt();
		         	t.printTriangle(shape2);
		         	break;
		         case 'D' :
			        System.out.println("Please key in the size of the shape: ");
				    int shape3 = sh.nextInt();
		         	d.printDiamond(shape3);
		            break;
		         default :
		            System.out.println("Invalid shape");
		            break;
      }
	}
}

class Diamond{
	public void printDiamond (int size)
	{	int space= size-1 ;
		 for (int p = 1; p <= size; p++)
		        {
		            for (int l = 1; l <= space; l++)
		            {
		                System.out.print(" ");
		            }
		            space--;
		            for (int r = 1; r <= 2 * p - 1; r++)
		            {
		                System.out.print("*");
		            }
		            System.out.println("");
        }
		space = 1;
		for (int q = 1; q <= size - 1; q++)
		        {
		            for (int b = 1; b <= space; b++)
		            {
		                System.out.print(" ");
		            }
		            space++;
		            for (int u = 1; u <= 2 * (size - q) - 1; u++)
		            {
		                System.out.print("*");
		            }
		            System.out.println("");
        }

	}
}

class Square
{
	public void printSquare (int size)
		{
			for(int i = 0; i<=size-1; i++)
			{
				for(int j = 1; j<=size; j++)
				{
				   System.out.print("*");
				}
			System.out.println();
			}
		}
}
class Triangle
{
	public void printTriangle (int size)
		{
			for(int m = 0; m<=size; m++)
			{
				for(int n = m; n<size; n++)
					{System.out.print(" ");}
				for(int o=1; o<(m*2); o++)
				    {System.out.print("*");}
		   	 System.out.print("\n");
			}
		}

}