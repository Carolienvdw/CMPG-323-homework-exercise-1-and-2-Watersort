//30188520
import java.util.Random;
public class Watersort
{
	Character top = null;
	//Create objects
	private	static Character red = new Character('r');
	private	static Character green = new Character('g');
	private	static Character blue = new Character('b');
	
	public static String ShowAll(StackAsMyArrayList bottles[])
	{
		String show = "";
		for (int i = 0; i <5; i++)
		{
			show = show +"\nBottle["+i+"]: "+ bottles[i];
		}
		return show;
	}
	
	public static void clearBottles(StackAsMyArrayList bottles[])
	{
		for (int i = 0; i <5; i++)
		{
			while( bottles[i].getStackSize() != 0)
			{
				bottles[i].pop();
			}
		}
	}
	
	public static void randomArray(Character colourSlots[])
	{
		
		//Clear array from previous values
		for(int i =0; i< 20; i++)
			colourSlots[i] = null;
		
		Random rand  = new Random();
		int slot;
		int count =1;
		
		///////////Fill slots with red
		while(count <5)
		{
			slot = rand.nextInt(20);
			if(colourSlots[slot] == null)
			{
				colourSlots[slot] = red;
				count++;
			}
			
		}
		
		////////////Fill slots with green
		count =1;
		while(count <5)
		{
			slot = rand.nextInt(20);
			if(colourSlots[slot] == null)
			{
				colourSlots[slot] = green;
				count++;
			}
	
		}
		
		//////////Fill slots with blue
		count =1;
		while(count <5)
		{
			slot = rand.nextInt(20);
			if(colourSlots[slot] == null)
			{
				colourSlots[slot] = blue;
				count++;
			}

		}
	}
	
	public static void fillBottles(Character colourSlots[], StackAsMyArrayList bottles[])
	{
		/////////////Push the colours into the bottle0 slots
		for (int i = 0; i<4;i++)
		{
			if(colourSlots[i] != null)
				bottles[0].push(colourSlots[i]);
		}
		
		/////////////Push the colours into the bottle1 slots
		for (int i = 4; i<8;i++)
		{
			if(colourSlots[i] != null)
				bottles[1].push(colourSlots[i]);
		}
		
		/////////////Push the colours into the bottle2 slots
		for (int i = 8; i<12;i++)
		{
			if(colourSlots[i] != null)
				bottles[2].push(colourSlots[i]);
		}
		
		/////////////Push the colours into the bottle3 slots
		for (int i = 12; i<16;i++)
		{
			if(colourSlots[i] != null)
				bottles[3].push(colourSlots[i]);
		}
		
		/////////////Push the colours into the bottle4 slots
		for (int i = 16; i<20;i++)
		{
			if(colourSlots[i] != null)
				bottles[4].push(colourSlots[i]);
		}
	}
	
		
	public static void main(String[] args)
	{
		
		//Create an arry to hold the colours for all the slots
		Character colourSlots[]  = new Character [20];
		
		
		
		
		////////////////////////////////////////////////////////////////////////////////////
		Character top = null;
		System.out.println("\n\nCreate bottles....");
		StackAsMyArrayList<Character> bottle0 = new StackAsMyArrayList<Character>();
		StackAsMyArrayList<Character> bottle1 = new StackAsMyArrayList<Character>();
		StackAsMyArrayList<Character> bottle2 = new StackAsMyArrayList<Character>();
		StackAsMyArrayList<Character> bottle3 = new StackAsMyArrayList<Character>();
		StackAsMyArrayList<Character> bottle4 = new StackAsMyArrayList<Character>();
		
		//Create an array of bottles
		StackAsMyArrayList bottles[] = new StackAsMyArrayList[5];
		bottles[0] = bottle0;
		bottles[1] = bottle1;
		bottles[2] = bottle2;
		bottles[3] = bottle3;
		bottles[4] = bottle4;
		//Print Array bottles
		System.out.println(ShowAll(bottles));
		
		for (int i = 1; i<6; i++)
		{
			System.out.println("\n\n"+i+ ": Scramble bottles....");
			randomArray(colourSlots);						//generate random colour slots
			fillBottles(colourSlots, bottles);				//fill the bottles with these colour slots
			
			//Show bottles
			System.out.println(ShowAll(bottles));
			clearBottles(bottles);							//Clear all bottles
		}
		
	
		
	}
}