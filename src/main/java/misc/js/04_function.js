    // Function Declaration
    // we can access to function call if
    // this function was declared anywhere in program

    // Function Expression
    // we can't call the function if she wasn't
    // declared before

    // function greet(name) {
    //     return ("name: " + name)
    // }
    //
    // console.log(greet("Yaroslav"));
    // console.dir (greet)
    // its object

    // all function extends from Object, got  a prototype from Object
    // Object is prototype

    // Anonymous functions

    // let counter = 0
    //
    // const interval = setInterval (function() {
    //     if (counter === 5) {
    //         clearInterval(interval)
    //     } else {
    //         console.log(++counter)
    //     }
    // }, 1000)

    // arrow functions

    // function greet (name) {
    //     console.log("Hi :" , name)
    // }
    // greet("Caps")
    //
    // const arrow = (name) => {
    //     console.log("Hi :", name)
    // }
    // arrow("Caps")


    // const pow2 = num => num ** 2
    // const greet = name => console.log ("name:" , name)
    //
    // const divide = (op1, op2) => {
    //     if  (op2>0) return (op1 / op2)
    // }
    //
    // console.log(divide (3,4))
    //
    // greet("caps")
    // console.log(pow2(2))

    // default parameters
    // if we have not second parameter in function we have a NaN

    // const sum = (a,b=3) => a+b
    //
    // console.log(sum(2))

    // function sum (...all) {
    //     let result = 0
    //     for (let num of all) {
    //         result += num
    //     }
    //     return result
    // }
    //
    // console.log(sum(1,2,3,4,5,6,7,8,9))


    // Closures
    // when we are calling function from another function
    // with storing some context

    function createMember(name) {
        return function(lastName) {
            console.log(name + " " + lastName)
        }
    }

    // internal function works with parameter "name" as in context

    const logWithLastName = createMember("Yaroslav")
    console.log(logWithLastName("Hamuha"))
    console.log(logWithLastName("Mudryi"))

    // using closures js allow to have incapsulation
    // js doesn't have native way to have private variable
    // in this case our private variable is name
