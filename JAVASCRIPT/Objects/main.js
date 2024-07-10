/*

//objects
//key-value pairs in curly brackets
//can give any datatype inside

const myObj = {name:"Anusree"};
const anotherObj=
{
    subscriber : true,// subscriber is key
    no : 1000,
    content:
    {
        earn:"32",
        grow :"stocks",

    },
    subdivisions : ["Earn","Grow","Give"],
    action : function()
    {
        //return"Hello World";
        return `Earn by learning ${this.content.earn}`
    }
};
console.log(anotherObj.no);
console.log(anotherObj.content);
console.log(anotherObj["subdivisions"]);
console.log(myObj.name);
console.log(anotherObj.action());


const vehicle =
{
    door:2,
    engine: function()
    {
        return "Vrrroom!";
    }
};
console.log(vehicle.engine());
const car=Object.create(vehicle);
console.log(car.engine());


const vehicle =
{
    door:2,
    engine: function()
    {
        return "Vrrroom!";
    }
};
console.log(vehicle.engine());
const car=Object.create(vehicle);// inherited from vehicle
car.wheels=4;// adding new property
console.log(car);
console.log(car.door);
car.engine=function()
{
    return "Whoo"
};
console.log(car.engine);
console.log(car.engine());
const tesla=Object.create(car);// inherited from car
tesla.engine=function()
{
    return "shshssh"
};
console.log(tesla.engine());


const movie =
{
    actor : "Kavin",
    music : "Arr",
    director : "Lokesh",
    producer : "Anbu"
};
movie.actress="bsdfh";
delete movie.producer;// when it is displayed it shows undefined
console.log(Object.keys(movie));
console.log(Object.values(movie));
console.log(movie.hasOwnProperty("producer"));// boolean

// for in loop
for(let job in movie)
{
   // console.log(movie.job); -> result is undefined
   console.log(movie[job]);
   console.log(`${job},its ${movie[job]}`);
}


// destructuring the objects

const movie =
{
    actor : "Kavin",
    music : "Arr",
    director : "Lokesh",
    producer : "Anbu"
};

const {music : myFavMusicDirector,director:favDirector}=movie;
console.log(myFavMusicDirector,favDirector);// director property is used as variable by defining another name

const{actor,music,director,producer}=movie;
console.log(actor);// actor is used as variable

function sings(music)// gives all values
{
    return music;
};
function sings({music})// gives music value
{
    return music;
};

console.log(sings(movie));

*/