
/*
Write a function that takes two positive numbers as input and compute the greatest 
common divisor.	
The input comes as two positive integer numbers.
The output should be printed on the console.

*/
function gcd_two_numbers(x, y) {
    if ((typeof x !== 'number') || (typeof y !== 'number')) 
      return false;
    x = Math.abs(x);
    y = Math.abs(y);
    while(y) {
      var t = y;
      y = x % y;
      x = t;
    }
    return x;
  }

  console.log(gcd_two_numbers(2154, 458))

