/*
Write a function that calculates how much money you need to buy fruit. 
You will receive a string for the type of fruit you want to buy, 
a number for weight in , and another number for the price per kilogram. 
Print the following text on the console:  
`I need ${money} to buy {weight} kilograms {fruit}.`
*/


function calculateMoney(fruit, weight, price){

    let kg = weight / 1000;

    let money = kg * price;

    console.log(`I need $${money.toFixed(2)} to buy ${kg.toFixed(2)} kilograms ${fruit}.`);
}
calculateMoney('apple', 1563, 2.35);