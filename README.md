# CS.11.05-Lab-5.1

Your task is to create a class called ArrayUtility and implement all of the described methods below.
You should pass all of the tests in the ArrayUtilityTester class that has been provided to you.

ALL methods should be contained within a class called ArrayUtility.
ALL methods in this class should be declared as static. 
Do not use or import java.util.Arrays! 
Do not use the Math class!

1. Method called print that prints out each element in an array of integers on a single line.
The format will be: 12, 34, 67, 89, 91, 34
Takes an array of integers as a parameter. 
Does not return any data.

2. Method called sum that returns the sum of an array of integers. 
	Takes an array of integers as a parameter. 
Returns an int.

3. Method called average that returns the average of an array of integers. 
	Takes an array of integers as a parameter. 
Returns a double.
// Note: ensure that your returned value is rounded to two decimal places. 

4. Method called minimum that returns the minimum value of an array of integers. 
Takes an array of integers as a parameter. 
Returns an int.

5. Method called maximum that returns the maximum value of an array of integers. 
	Takes an array of integers as a parameter. 
Returns an int.

6. Method called evenCount that counts the number of even numbers in an array of integers. Use an enhanced for loop. 
	Takes an array of integers as a parameter. 
Returns an int. 
	
7. Method called reverseOne that returns a copy of an array with the elements reversed. For example, [1,2,3,4] will return [4,3,2,1]. 
Takes an array of integers as a parameter. 
Returns the new array. 


8. Method called reverseTwo that reverses the order of elements in an array. For example, [1,2,3,4] becomes [4,3,2,1]. 
Takes an array of integers as a parameter. 
Does not return any data. Only modifies the elements in the array that is passed to the method. 

9. Method called linearSearchInt that checks to see if a given value exists in an array of integers.
Takes two parameters: the first is an array of integers, the second is an integer. 
     	Returns a boolean.
     	
10. Method called linearSearchString that checks to see if a given value exists in an array of strings.
Takes two parameters: the first is an array of Strings, the second is a String. 
     	Returns a boolean.

11. Write a method called multiplyByTwo that multiplies each element in an array of type int by two.
Takes an array of integers as a parameter.    
  	Does not return any data. Only modifies the elements in the array that is passed to the method. 
    
12. Write a method called multiplyByN that multiplies each element in an array of type int by n.
Takes two parameters: the first is an array of integers, the second is an integer. 
     	Does not return any data. Only modifies the elements in the array that is passed to the method. 
     	
13. Write a method called toString that combines all the elements in an array of integers into a string. The format of the string will be, for example: 1,2,3,4,5
	Takes an array of integers as a parameter. 
     	Returns a string.
Note: do not use the Arrays class (cheater!)

14. Write a method called twoSum that checks if any two elements in an array add to a specific number.
Takes two parameters: the first is an array of integers, the second is an integer. 
     	Returns a boolean.
	
15. Method called shiftRight that shifts each element in an array of integers one index right. 
Takes an array of integers as a parameter. 
Does not return any data. Only modifies the elements in the array that is passed to the method. 
	 For example, [1,2,3,4] becomes [4,1,2,3]. 

16. Method called shiftLeft that shifts each element in the array one index left. 
Takes an array of integers as a parameter. 
Does not return any data. Only modifies the elements in the array that is passed to the method. 
	For example, [1,2,3,4] becomes [2,3,4,1]. 

17. Method called shiftRightNTimes that shifts each element in the array n indexes right. 
Takes two parameters: the first is an array of integers, the second is an integer. 
Does not return any data. Only modifies the elements in the array that is passed to the method. 
	For example, a shift of 2 means that [1,2,3,4] becomes [3,4,1,2]. 
	Note: You have already written a method called shiftRight. 

18. Method called shiftLeftNTimes that shifts each element in the array n indexes left. 
Takes two parameters: the first is an array of integers, the second is an integer. 
Does not return any data. Only modifies the elements in the array that is passed to the method. 
	For example, a shift of 3 means that [1,2,3,4] becomes [4,1,2,3]. 
Note: You have written a method called shiftLeft.

