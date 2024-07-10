/*
// Classes

// Object Creation 

const myPizza =
{
    size : "medium",
    crust : "original",
    bake : function()
    {
        return console.log(`Baking a ${this.size} ${this.crust} crust pizza`);
    }
};
myPizza.bake();

//Class creation

class Pizza 
{
    constructor(typePizza,sizePizza,crustPizza) //default - to initialize
    {
        this.type=typePizza;
        this.size =sizePizza;
        this.crust=crustPizza;
        //this.toppings="Olives";
        this.toppings=[];
    }
    gettoppings()//get toppings1()
    {
        return this.toppings;
    }
    settoppings(toppings1)//set toppings1(toppings1)
    {
        this.toppings.push(toppings1);// this.toppings=toppings1;
    }
    bake()
    {
        return console.log(`Baking a ${this.size} ${this.type} ${this.crust} crust pizza with ${this.toppings}`);
    }
}

//const anotherPizza = new Pizza();// object 
//console.log(anotherPizza.bake());
const anotherPizza = new Pizza("Margarita","Small","Thin");// object 
//anotherPizza.toppings="saucs"; - This is not safe to change values 
//anotherPizza.toppings1="sausage"; - aliter
anotherPizza.settoppings("sausage");
anotherPizza.settoppings("egg");
anotherPizza.bake();
console.log(anotherPizza.gettoppings());
//const appPizza = new Pizza("Pepperoni","Medium","Original"); appPizza.bake(); - extra object


class Pizza  // parent class
{
    constructor(sizePizza) //default - to initialize
    {
        this.size =sizePizza;
        this.crust="Original";
    }
    getcrust()
    {
        return this.crust;
    }
    setcrust(crustnew)
    {
        this.crust=crustnew;
    }
}

class specialPizza extends Pizza // child class
{
    constructor(sizePizza)
    {
        super(sizePizza);
        this.type="Magarita";
    }
    slice()
    {
        console.log(`Our ${this.type} ${this.size} pizza has 8 slices`);
    }
}

// Object creation

const mySpecial = new specialPizza("medium");
mySpecial.slice();


//factory function
function pizzaFactory(sizePizza)
{
    const crust = "Original";
    const size = sizePizza;
    return{
        bake: ()=> console.log(`Baking a ${size} ${crust} crust pizza`)// no ; only ,
    };
}

const Pizza1 = pizzaFactory("small");
Pizza1.bake();
//console.log(Pizza1.crust);// undefined -> connot work as object


class Pizza  // parent class
{
    constructor(sizePizza) //default - to initialize
    {
        this.size =sizePizza;// this._size = sizePizza; -> Private Member
        this.crust="Original";
    }
    getcrust()
    {
        return this.crust;
    }
    setcrust(crustnew)
    {
        this.crust=crustnew;
    }
}
*/
// new update

class Pizza  // parent class
{
    crust ="Original";
    #sauce = "tomato"; // can be used within the class only
    constructor(sizePizza) //default - to initialize
    {
        this.size =sizePizza;// this._size = sizePizza; -> Private Member
    }
    getcrust()
    {
        return this.crust;
    }
    setcrust(crustnew)
    {
        this.crust=crustnew;
    }
    bake()
    {
        return console.log(`Baking a ${this.size} ${this.crust} ${this.#sauce}  pizza `);// simply sauce give means undefined will show
    }
}

const Pizza2 =new Pizza("small");
Pizza2.bake();
// console.log(Pizza2.crust);// public
console.log(Pizza2.getcrust());// Important
// console.log(Pizza2.#sauce);// error
// console.log(Pizza2.sauce);// undefined