package Binarysearchalgoritham;
//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//package is Binary search algoritham
import java.util.Scanner;
//import : we use import keyword to access the packages.
//java.util.scanner : util is readymade package under the main package Java,so we import a pacakge 
//when we need to use some classes belonging to that pacakge in current program
public class Binary {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
	//declares a class called Binary.
	public static void main(String[] args) {
	//Public is a keyword that is used as an access modifier for methods and variables.
	//static used to prepare a field,method or inner classes as a class field.
	//void: it is void if the method does not return a value.
	//main:it is a function name When a program starts running, it has to start execution from somewhere.
	//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
	// TODO Auto-generated method stub
		int c,first,middle,last,n,search,array[];
		//first is first element of an array
		//middle is the middle element of an array
		//last is the last element of an array
		//n is no.of elements in arrays
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		//system : system is a class in java language.lang package
		//out : out is the static member of system class.It's type PrintStream
		//println: which is used to print the output.
		//Inside the brackets is value which to be printed
		n=in.nextInt();
		//scans next token of the input as int
		array=new int[n];
//declaring the values to arrray
		System.out.println("Enter"+n+"integers");
//here we enter integers
		for (c=0;c<n;c++)
			array[c]=in.nextInt();
		System.out.println("Enter value to find");
		search=in.nextInt();
		
		first=0;
		last=n-1;
		middle=(first+last)/2;
		
		while(first<=last)
		{
			if(array[middle]<search)
				first=middle+1;
			else if(array[middle]==search)
			{
				System.out.println(search+"found at location"+(middle+1)+".");
				break;		
			}
			else
				last=middle-1;
			middle=(first+last)/2;
		}
		if(first>last)
			System.out.println(search+"is not present in list.\n");
		//system : system is a class in java language.lang package
				//out : out is the static member of system class.It's type PrintStream
				//println: which is used to print the output.
				//Inside the brackets is value which to be printed
		//binary search comparing the middle element of the array with the target value.
		//If the target value matches the middle element,its position in the array is returned
		//If the target value is less than or greater than the middle element, the search continues 
		//in the lower or upper half of the array respectively ,eliminating the other half from consideration
		//Given an array A of n elements with values 
	}

}
