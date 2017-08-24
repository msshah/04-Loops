/**
	* Copyright (c) 2017 Mian Safyan Shah
	*
	* WRITTEN BY		: MIAN SAFYAN SHAH
	* CONTACT		: safyanshah@live.com
	*
	* This program demonstrates the use of Loops in Java and creating Class Object
	*
	* Use the command line to compile and run this program. It'll run in any IDE but 
	* using command line is preferred.
	*
	* How to compile : Open Command Prompt on Windows or Terminal on Mac OS/Linux/Unix
	* then navigate to the directory of this program and type the following command
	*
	* javac JavaLoops.java
	*
	* How to Run : after successful compilation, type java JavaLoops, you'll see output
	* on the command line.
	*
	*
  */
  
class Loops
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = 0;
	
		/**
		  *
		  * FOR LOOP ONLY
		  * 
		  */
		// for loop
		for(i = 1; i <= 100; i++)
		{
			System.out.println("Count now is : " + i);
		}
	
		System.out.println();
	
		/**
		  *
		  * NESTED FOR LOOP
		  * 
		  */
		// inner-for loop
		for(i = 1; i <= 21; i++)
		{
			for(j = 1; j < i+1; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	
		System.out.println();
	
		// while - Must initialize i
		/**
		  *
		  * WHILE LOOP
		  * 
		  */
		i = 0;
		while(i < 100)
		{
			System.out.println("While Loop Count is : " + i);
			i++;
		}

		System.out.println();
	
		/**
		  *
		  * DO-WHILE LOOP
		  * 
		  */
		// initalize i to 0
		i = 0;
		// do while
		do
		{
			System.out.println("do-While Loop Count is : " + i);
			i++;
		} while(i < 10);
	
		System.out.println();
	}
}
