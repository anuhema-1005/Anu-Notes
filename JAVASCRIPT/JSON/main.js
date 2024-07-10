// If error occurs in one line the consecutive next lines are not executed in javascript.
// JSON - JavaScript Object Notation
// text format
// to send and receive data in many programming languages

const myObj =
{
    name:"Anusree",
    content:["One","Two","Three"],
    sub : function()
    {
        console.log("Thank you");
    }
};
console.log(myObj);

// OBJECT TO JSON

const sendJSON = JSON.stringify(myObj);
console.log(sendJSON); // gives string format because JSON is text format (.json file not .txt file).
// when converting an object to JSON the function inside the object does not change as function does not have any data it's just a code.
console.log(sendJSON.name);//undefined
console.log(typeof sendJSON);// string

// JSON TO OBJECT 

const receiveJSON =JSON.parse(sendJSON);// filename from server
console.log(receiveJSON);

