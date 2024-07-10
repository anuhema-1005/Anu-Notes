/*

let x=1;
let x=2;
console.log(x);// Javascript throws error

var x=1;
var x=2;
console.log(x); //prints x=2

let x=1;
const x=2; //CONST is majorly used datatype
console.log(x);// Javascript throws error

SCOPE of var, let, const:

-> Global Scope
var x=1;
let y=2;
const z=3;
Can be used in any part of code.

->Local Scope
Example 1:
{
    let y=4;
    console.log(y);// y=4
}
When used within block the variable scope is within that block.Can

Example 2:
function myFunc()
{
    const z=5;
    console.log(z);// z=5
}
console.log(y);// y=2
console.log(z);// z=3 since function is not called
myFunc // call function to print z=5

Scope is uesd in 
-> IF statements
-> Switch statements
-> LOOPS

// code is always executed line by line
// var is function scope inside function the variable is same irrespective of blocks present inside function

// ----------------------------------------------------------------------------------------------------------------------------------------

// ARRAYS

const myArray = []; // empty array
console.log(myArray); // [] (empty array)

const myArray = [];
// adding element
myArray [0]="Anu";
myArray [1]="Anu";
myArray [2]=999;
myArray [3]=true;
console.log(myArray); // [ 'Anu','Anu',999,true ]

myArrayA = ["false",56,445];

console.log(myArray.length);
console.log(myArray[3]);
console.log(myArray[myArray.length-1]);

//adding and deleting elements in predefined array at last
myArray.push("Sree");
console.log(myArray);
myArray.pop();
console.log(myArray);

//adding and deleting elements in predefined array at first
myArray.unshift("Sree");
console.log(myArray);
myArray.shift();
console.log(myArray) 

const lastItem = myArray.push("abc");
console.log(lastItem); // prints length of array by adding element at last.
const firstItem = myArray.push("abc");
console.log(firstItem); // prints length of array by adding element at first.

const lastItem = myArray.pop();
console.log(lastItem); // prints element at last  and  deletes it.
const firstItem = myArray.shift();
console.log(firstItem); // prints element at first and deletes it.

// delete in middle
delete myArray[5]; // displays empty
myArray.splice(); //no change
myArray.splice(2,1);// position , how many elements to delete.
myArray.splice(1,0,"mnjfhuwhyf");// adds element in given position no deletion
myArray.splice(1,1,"mnjfhuwhyf");// adds element in given position deletes the element

// slice method - stores in new array displays the copy
const newArray = myArray.slice(1,1); // dispalys empty 
const newArray = myArray.slice(1,2); // dispalys element at 1st position

//reverse
const newArray = myArray.reverse(); // reverses the element

// join
const newArray = myArray.join(); // joins as single element and converts into string

// split
const newwArray=newArray.split(,);// converts join string to array (split using comma)

// join two array
const newArray =myArray.concat(myArrayA);
const newArray =myArrayA.concat(myArray);
const newArray =[...myArray,...myArrayA];

// display elements
console.log(array1[1],array[2]);

//single to two dimension (multi dimension)
const newarr=[array1,array];
console.log(newarr);// [Array(2),Array(2)]
console.log(newarr[0][1]);

-> same concept for multi dimension arrays (3D,4D,..)
-> can store complex data
*/