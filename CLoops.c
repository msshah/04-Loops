/**
	* Written by Mian Safyan Shah
	* Contact : safyanshah@live.com
	*
	* This program demonstrates the use of Loops in C
	*
	* Use the command line to compile and run this program. It'll run in any IDE but
	* using command line is preferred.
	*
	* How to compile : Open Command Prompt on Windows or Terminal on Mac OS/Linux/Unix
	* then navigate to the directory of this program and type the following command
	*
	* gcc -v CLoops.c -o CLoops
	*
	* How to Run : after successful compilation, type ./CLoops, you'll see output
	* on the command line.
	*
	*
 */

#include <stdio.h>

int main(void)
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
		printf("Count now is : %d\n", i);
	}
	
	printf("\n\n");
	
	// inner-for loop
	for(i = 1; i <= 21; i++)
	{
		for(j = 1; j < i+1; j++) {
			printf("*");
		}
		printf("\n");
	}
	
	printf("\n\n");
	
	// while - Must initialize i
	i = 0;
	while(i < 100)
	{
		printf("While Loop Count is : %d.", i);
		i++;
	}

	printf("\n\n");
	
	// initalize i to 0
	i = 0;
	// do while
	do
	{
		printf("do-While Loop Count is : %d.\n", i);
		i++;
	} while(i < 10);
	
	printf("\n\n");
}
