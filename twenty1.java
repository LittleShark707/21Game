package datastruc;

import java.util.Scanner;
import java.util.Stack;

public class twenty1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = "";
		String card1 = "";
		String card2 = "";
		String card3 = "";
		String[] temp;
		int first = 0;
		int second = 0;
		int third = 0;
		int sum;
		
		String[] typeCards = new String[]
				{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] classCards = new String[]
				{"S", "D", "C", "H"};
		String[] deck = new String[52];
		int count = 0;
		
		for(int i = 0; i < classCards.length; i++)
		{
			for(int j = 0; j < typeCards.length; j++)
			{
				deck[count] = classCards[i] + "-" + typeCards[j];
				count++;
			}
		}
		
		Stack<String> theStack = new Stack<String>();
		for(int i = 0; i < deck.length; i++)
		{
			int j = (int)(Math.random() * deck.length);
			if(deck[j].equals(" "))
			{
				i--;
			}
			else
			{
				theStack.push(deck[j]);
				System.out.print(deck[j] + " ");
				deck[j] = " ";
			}
		}
		
		System.out.println();
		System.out.print("your cards: ");
		
		card1 = theStack.pop();
		card2 = theStack.pop();
		System.out.print(card1 + " " + card2);
		
		System.out.println();
		
		if(card1.length() == 4)
		{
			card1 = "10";
		}
		else
		{
			temp = card1.split("");
			card1 = temp[2];
		}
		try
		{
			first = Integer.parseInt(card1);
		}
		catch(Exception e)
		{
			switch(card1)
			{
			case "A":
				System.out.print("pick a value (1 or 11): ");
				s = in.nextLine();
				first = Integer.parseInt(s);
				break;
			case "J":
				first = 10;
				break;
			case "Q":
				first = 10;
				break;
			case "K":
				first = 10;
				break;
			}
		}
		
		if(card2.length() == 4)
		{
			card2 = "10";
		}
		else
		{
			temp = card2.split("");
			card2 = temp[2];
		}
		try
		{
			second = Integer.parseInt(card2);
		}
		catch(Exception e)
		{
			switch(card2)
			{
			case "A":
				System.out.print("pick a value (1 or 11): ");
				s = in.nextLine();
				second = Integer.parseInt(s);
				break;
			case "J":
				second = 10;
				break;
			case "Q":
				second = 10;
				break;
			case "K":
				second = 10;
				break;
			}
		}
		sum = first + second;
		System.out.println("total: " + sum);
		
		System.out.print("draw 1 more card?(Y/N): ");
		s = in.nextLine();
		
		if(s.equalsIgnoreCase("y"))
		{
			System.out.print("your card: ");
			card3 = theStack.pop();
			System.out.print(card3);
			
			System.out.println();
			
			if(card3.length() == 4)
			{
				card3 = "10";
			}
			else
			{
				temp = card3.split("");
				card3 = temp[2];
			}
			try
			{
				third = Integer.parseInt(card3);
			}
			catch(Exception e)
			{
				switch(card3)
				{
				case "A":
					System.out.print("pick a value (1 or 11): ");
					s = in.nextLine();
					third = Integer.parseInt(s);
					break;
				case "J":
					third = 10;
					break;
				case "Q":
					third = 10;
					break;
				case "K":
					third = 10;
					break;
				}
			}
			sum = first + second + third;
			System.out.println("total: " + sum);
			
			if(sum == 21)
			{
				System.out.println("YOU WIN! =D");
			}
			else
			{
				System.out.println("you lose =(");
			}
			
		}
		else
		{
			if(sum == 21)
			{
				System.out.println("YOU WIN! =D");
			}
			else
			{
				System.out.println("you lose =(");
			}
			
		}

	}

}
