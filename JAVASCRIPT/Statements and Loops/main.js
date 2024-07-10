/*
let viewer = "Javascript full course";
let reply;
if(viewer)
{
    reply = `Enjoy ${viewer}`;// Back tick ``
}
else
{
    reply='Sorry ! I am still working';
}
console.log(reply);


let customerIsBanned = true;
let viewer = "Javascript full course";
let reply;
if(customerIsBanned)
{
    reply='Sorry';
}
else if(viewer)
{
    reply = `Enjoy ${viewer}`;// Back tick ``
}
else
{
    reply='Sorry ! I am still working';
}
console.log(reply);


let customerIsBanned = false;
let viewer = "Javascript full course";
let reply;
if(customerIsBanned)
{
    reply='Sorry';
}
else if(viewer)
{
    reply = `Enjoy ${viewer}`;// Back tick ``
}
else
{
    reply='Sorry ! I am still working';
}
console.log(reply);


let customerIsBanned = false;
let viewer = "Javascript full course";
let reply;
let finance = true;
if(customerIsBanned)
{
    reply='Sorry';
}
else if(viewer && finance)
{
    reply = `Enjoy ${viewer} and content`;// Back tick ``
}
else if(viewer)
{
    reply = `Enjoy ${viewer}`;// Back tick ``
}
else
{
    reply='Sorry ! I am still working';
}
console.log(reply);

// ORDER OF IF STATEMENTS IS IMPORTANT


let testscore = 88; // js is case sensitive
let grade;
let collegeStudent = true;
if(testscore>=90)
{
    grade ='A'; // no else if means output is undefined.
}
else if(testscore>=80)
{
    grade ='B';
}
else if(testscore>=70)
{
    grade ='C';
}
else if(testscore>=60)
{
    grade ='D';
}
else
{
    if(collegeStudent) // NESTED IF
    {
        grade = 'RA';
    }
    else
    {
        grade ='F';
    }
}
console.log(grade);

// IF ELSE - DECISION TREE


//SWITCH STATEMENTS

switch(expressions or values)
{
    case choice1:
        // code 1
        break;
    case choice1:
        // code 1
        break;
    default:
        // code 1
}

let player = "rock";
let computer = "scissors";
switch(player)
{
    case computer:
        console.log("Tie!");
        break;
    case "rock":
        if(computer === "scissors")
        {
            console.log("Player Wins");
        }
        else
        {
            console.log("Computer Wins");
        }
        break;
    default:
        console.log("No Tie!");
}

// TERNARY OPERATOR

condition ? exprIfTrue : exprIfFalse

let subscriber;
let response = subscriber ? "Welcome" : "Kindly Subscribe";
console.log(response);

let testScore = 90;
let grade = testScore > 89 ? "A" : testScore > 79 ? "B" : testScore > 69 ? "C" : "D";
console.log(grade);

let player = "rock";
let computer = "scissors";
let result =
         player === computer ? "Tie" : 
         player === "rock" && computer === "paper" ? "Computer Wins!" : 
         player === "paper" && computer ==="scissors" ? "Computer wins!" : 
         player === "scissors" && computer === "rock" ? "Computer wins!" : 
         "Player Wins";
console.log(result);


// User Input

alert ("Hi Subscribers");

let myBoolean = confirm("Hi Subscribers"); //Getting Input // OK - True // Cancel - Flase
console.log(myBoolean);

let myBoolean = prompt("Enter your name"); //Getting Input from user // OK - Input // Cancel - null
console.log(myBoolean);

// Nullish Coalescing Operator (??) 

let myBoolean = prompt("Enter your name"); 
console.log(myBoolean ?? "You didn't Enter your name");
console.log(typeof myBoolean); // if no values and clicked ok means it returns String

// The above error rectification

let myBoolean1 = prompt("Enter your name"); 
if(myBoolean1.length)
{
    console.log(myBoolean1 ?? "You didn't Enter your name");
}
else
{
    console.log("You didn't Enter your name"); // cancel does not work
}

// The above error rectification

let myBoolean1 = prompt("Enter your name"); 
if(myBoolean1)
{
    console.log(myBoolean1 ?? "You didn't Enter your name");
}
else
{
    console.log("You didn't Enter your name"); // cancel work
}

let myBoolean1 = prompt("Enter your name"); 
if(myBoolean1)
{
    console.log(myBoolean1 ?? "You didn't Enter your name");
}
else
{
    console.log("You didn't Enter your name"); 
}
console.log(myBoolean1.length); // calculates space also

// Code to remove space*/
let myBoolean1 = prompt("Enter your name"); 
if(myBoolean1)
{
    console.log(myBoolean1 ?? "You didn't Enter your name");
}
else
{
    console.log("You didn't Enter your name"); 
}
console.log(myBoolean1.trim().length);