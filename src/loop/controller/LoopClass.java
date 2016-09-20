package loop.controller;

public class LoopClass 
{
	public static void main(String args []) 
	{
		int [] numbers = {10, 20, 30, 40, 50};
		
		for(int x : numbers ) 
		{
			System.out.print( x );
			System.out.print(",");
		}
		System.out.print("\n");
		String [] names = {"James", "Larry", "Tom", "Lacy"};
		
		for( String name : names ) 
		{
			System.out.println( name );
			System.out.println(",");
		}
		
		int [] moreNumbers = {90, 100, 110, 120, 130};
		
		for( int y : moreNumbers )
		{
			System.out.print( y );
			System.out.print(",");
		}
		System.out.println("\n");
		String [] drinks = {"Coke", "Pepsi", "Dr. Pepper", "Water", "Mountain Dew"};
		
		for( String drink : drinks ) 
		{
			System.out.println( drink );
			System.out.println(",");
		}
		
		for(int z = 10; z < 20; z = z + 1) 
		{
			System.out.print("Value of z : " + z);
			System.out.println("\n");
		}
		
		for(int q = 20; q > 9; q = q - 1)
		{
			System.out.print("Value of z : " + q);
			System.out.println("\n");
		}
		
		int b = 20;
		
		while( b > 9 )
		{
			System.out.print("value of b : " + b );
			b--;
			System.out.print("\n");
		}
		
		int yep = 40;
		
		while( yep < 51)
		{
			System.out.print("value of Yep : " + yep );
			yep++;
			System.out.print("\n");
		}
 	}
}