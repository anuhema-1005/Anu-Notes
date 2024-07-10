console.log ("Hello Parents") ;
console.log (typeof("Parents")) ;

// Strings
let myVariable = "Mathematics";
console.log (myVariable) ;

// length property (space is a character)
console.log (myVariable.length);
console.log ("hufauyrfhAQYHBJA".length);

// String Methods 

// CharAt (positon : 0 to n-1)
console.log (myVariable.charAt(0));
console.log (myVariable.charAt(10));
console.log (myVariable.charAt(11));
console.log (myVariable.charAt(5));

//indexOf (shows first palce)
console.log (myVariable.indexOf("at"));
console.log (myVariable.indexOf("ati"));
console.log (myVariable.indexOf("cs"));
console.log (myVariable.indexOf("zz"));

// lastIndexOf
console.log (myVariable.lastIndexOf("at"));
console.log (myVariable.lastIndexOf("fft"));

// slice
console.log (myVariable.slice(5,8)); // start from 5th index to 7th index last index is not displayed
console.log (myVariable.slice(5)); // start from 5th index 
console.log (myVariable.slice(5,3)); // no output
console.log (myVariable.slice(5,6)); // 5th index only

// toUpperCase toLowerCase
console.log (myVariable.toUpperCase());
console.log (myVariable.toLowerCase());

// includes
console.log (myVariable.includes("mat")); // boolean output
console.log (myVariable.includes("ta,")); // boolean output

// split
console.log (myVariable.split("e")); //array output
console.log ("myVariable".split("a")); //array output
console.log ("myVariable".split("")); //array output
console.log ("my,Var,iable".split(",")); //array output
console.log ("myVa ria ble".split(" ")); //array output

// ----------------------------------------------------------------------------------------------------------------------------------------

// Numbers

const myString="42";//string
const myString1="42.09ggg";//string
const myString2="gggg42.09ggg";//string
const myNumber=42;
const myFloat=42.0;
const myFoar=42.3366;

console.log (myNumber === myFloat);
console.log (myNumber === myFoar);
console.log (myFloat);
console.log (myString);
console.log (myString+3);

//converting string to number datatype

console.log (Number(myString));
console.log (Number("myString")+6); // NaN - not a number
console.log (Number(myString)+6);
console.log (Number(true)+6);
console.log (Number(false)+6);

// Number Methods

console.log (Number.isInteger()); // false
console.log (Number.isInteger(42));
console.log (Number.isInteger("42"));
console.log (Number.isInteger(myVariable));

//parseFloat,parseInt
console.log (Number.parseFloat(myString));
console.log (Number.parseFloat(myFoar));
console.log (Number.parseFloat(myFoar).toFixed(2)); // number to string 
console.log (Number.parseFloat(myString1));

console.log (Number.parseInt(myString2));

// to string
console.log (myFoar.toString());

// chaining  // combining two different methods in single line using dot (.)
console.log (Number.parseFloat(myFoar).toFixed(2).toString()); // number to string 

// isNaN 1.Number.isNaN() 2.isNaN() - global isNaN
console.log(Number.isNaN(42)); //false
console.log(Number.isNaN("hgajka")); //false because only numbers can be passed as arguments
console.log(isNaN("hgajka"));//true

//--------------------------------------------------------------------------------------------------------------------------------------

// Math Methods
console.log (Math.PI);
console.log (Math.trunc(Math.PI));
console.log (Math.round(Math.PI));
console.log (Math.round(4.3));
console.log (Math.round(4.8));
console.log (Math.ceil(4.8));// 4. gives next number 5
console.log (Math.floor(4.8));// 4. gives same number 4 
console.log (Math.pow(3,4));
console.log (Math.min(3,4,456,0.89,90));
console.log (Math.max(3,4,456,0.89,90));
console.log (Math.random());// 0 to less than 1
console.log (Math.random()*10);
console.log (Math.floor(Math.random()*10)+1);// one to ten
// ceil is not used because 0 is not displayed no where as it takes upper values.

//------------------------------------------------------------------------------------------------------------------------------------
