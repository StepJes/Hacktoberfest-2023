# Explanation Line by Line

## class Solution: 
This line starts the definition of a C++ class called Solution. The class contains a method PowMod for modular exponentiation.

## { and }: 
These curly braces define the beginning and end of the class definition.

## public: 
This keyword specifies that the following members (methods and variables) are accessible from outside the class.

## long long int PowMod(long long int x, long long int n, long long int M): 
This line declares a method named PowMod that takes three long long int parameters: x, n, and M. It's used for calculating (x^n) % M.


## long long int res = 1; : 
This line declares a variable res and initializes it to 1. This variable will store the result of the modular exponentiation.

## while (n > 0) {: 
This line starts a while loop that continues as long as n is greater than 0. This loop implements the binary exponentiation algorithm.

## if (n & 1) :
This line checks if the least significant bit of n is set to 1 (i.e., n is odd).

## res = ((res) % M * (x) % M) % M; :
If n is odd, this line multiplies res by x modulo M and updates the value of res. This is part of the binary exponentiation algorithm.

## x = ((x) % M * (x) % M) % M; : 
This line squares x modulo M, which is also part of the binary exponentiation algorithm.

## n = n >> 1; : 
This line right-shifts n by one bit, effectively halving its value. This is used to divide the exponent n by 2 in each iteration of the loop.

## return res; : 
Finally, this line returns the result res after the loop has completed.

This C++ code efficiently calculates (x^n) % M using the binary exponentiation technique, making it suitable for large numbers and large exponents while reducing the number of operations performed.