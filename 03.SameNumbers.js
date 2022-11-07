
/*
Write a function that takes an integer number as an input and
 check if all the digits in a given number are the same or not.
Print on the console true if all numbers are the same and false if not.
 On the next line print the sum of all digits.
The input comes as an integer number.
The output should be printed on the console.
*/

function checkIfDigitsAreEqual (number){
    let input = String(number);
    let isSame = true;
    let sum = 0;

    let firstDigit = input[0];

    for(let i = 0; i < input.length; i++){
        let currentDigit = +input[i];
        sum += currentDigit;
        if(firstDigit != currentDigit){
            isSame = false;
        }
    }
    console.log(isSame);
    console.log(sum);
}

checkIfDigitsAreEqual (2222222)
