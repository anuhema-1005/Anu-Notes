/*function sum()
{
    return 2+2;
    // Always return 4 since no arguments passed
}
function sumall(num1,num2)
{
    console.log(num1);
    console.log(num2);
    if(num2 == undefined)
    {
        return num1;
    }
    return num1+num2;
    // Returns values according to the arguments passed
    // if num2 is not assigned NaN is returned
}
console.log(sumall(10,2));
console.log(sumall(100,2));
console.log(sumall(1000,2));
console.log(sumall(10000,2));
console.log(sumall(1052,2));
console.log(sumall(10588,2));

let email='bdvhbeiy@gmail.com';
console.log(email.slice(0,email.indexOf("@")));

function getUserNameFromEmail (email)
{
    return email.slice(0,email.indexOf("@"));
}
console.log(getUserNameFromEmail(email));

 const toProperCase = function (name)*/
 const toProperCase =  (name) =>
{
    return name.charAt(0).toUpperCase()+name.slice(1).toLowerCase();

}
console.log(toProperCase("sdbgvhdsnv"));