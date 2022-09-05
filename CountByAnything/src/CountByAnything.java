import java.util.Scanner;
public class CountByAnything {

	public static void main(String[] args) {
		{
			
			Scanner input = new Scanner(System.in);
			int number;
			System.out.print("Enter a number >> ");
			number = input.nextInt();
			final int START = number;
			final int STOP = 500;
			final int NUMBER_PER_LINE = 50;
			for(int i = START; i <= STOP; i += START)
			{
			System.out.print(i + " ");
			if(i % NUMBER_PER_LINE == 0)
			System.out.println();
			}

	}

	}
	}
