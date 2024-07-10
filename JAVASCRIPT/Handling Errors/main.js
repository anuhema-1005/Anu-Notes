/*
// reference error - code executes
// In javascript variables may execute without declaring -> to avoid this
"use strict";
// variable =10; 
let variable =10;
console.log(variable);

// syntax error - code does not execute

// type error - assignment to constant variable
const variable = "Anusree";
console.log(variable);
variable ="super";

// try catch method to handle errors
// create function
 const makeError =()=>
 {
     try{
          const name="Anusree";// let means no error
          name="Anu";
          // if error breaks and go to catch
     }
     catch(err)
     {
        //console.log(err);
        console.error(err);
        console.error(err.stack);// datailed explanation
        console.error(err.name);
        console.warn(err);
        console.table(err);// displays what error and its properties
        logTheError(err.stack); 
     }
 };
 // calling function
 makeError();

// create error on our own
function customError(message)
{
    this.message=message;
    this.name="Custom Error";
    this.stack=`${this.name}:${this.message}`;
}
const makeError=()=>
{
    try{
        throw new customError("This is a custom error");
    }
    catch(err)
    {
        console.error(err.stack);
    }
}
makeError();

// in built javascript function to throw error
const makeError=()=>
{
    try{
        throw new Error("This is a custom error");
    }
    catch(err)
    {
        console.error(err.stack);
        console.error(err.name);
        console.error(err.message);
    }
    finally{
        console.log("....finally");
        // good code in try is executed  and then finally is executed
        // error code in try is gone to catch and then finally is executed
    }
}
makeError();
*/

// making use of finally
const makeError=()=>
{
    let i=0;
    while(i<=5)
    { 
        try{
           if(i%2!=0)
           {
             throw new Error("Odd Number");
           }
           console.log("Even Number");
        }
        catch(err)
        {
            console.error(err.message);
        }
        finally{
            console.log("....finally");
            i++;
        }
    }
}
makeError();