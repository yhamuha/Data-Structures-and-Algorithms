

    // arrays

    // function if it had been wrote separately
    // method if it is calling in object context

    // cars = ["One", "Two"]
    // cars.push("Three")
    // console.log(cars)
    // cars.push("Four")
    // console.log(cars)
    // cars.unshift("Zero")
    // console.log(cars)
    // cars[0] = "Zero-upd"
    // console.log(cars)
    //
    // console.log(cars.includes("One"));
    //
    // const firstItem = cars.shift()
    // const lastItem = cars.pop()
    // console.log(cars)
    // console.log(firstItem)
    // console.log(lastItem)

    // array:
    //  unshift(add) shift(get) ... push(add) pop(get)

    // let array = []
    // for (let i=1; i<=10; i++) {
    //     array.push("item " + i)
    // }
    // console.log(array)
    //
    // console.log(array.reverse())
    //
    // const text = "Hi, my name is"
    // const reverseText = text.split("").reverse().join("")
    // console.log(reverseText)
    //
    // console.log(array.indexOf("item 1"))

    // const people = [
    //     {name: "Yaroslav", budget: 4200},
    //     {name: "Terry", budget: 3500},
    //     {name: "Viktoria", budget: 1700}
    // ]

    // const index = person.findIndex( function (person) {
    //     // console.log(person)
    //     return person.budget === 3500
    // })

    // const person = people.find (function (person) {
    //     return person.budget === 3500
    // })

    // const person = people.find ( (person) => {
    //     return person.budget === 3500
    // } )
    // console.log(person)

    //
    // console.log(person)
    // console.log(person[index])

    // use let when variable will changed
    // use const when variable will not changed

    // let findedPerson
    // for(const person of people) {
    //     if (person.budget === 4200) {
    //         findedPerson = person
    //     }
    // }
    //
    // console.log(findedPerson)

    // method map always return a new array

    // cars = ["Mazda", "BMW", "Toyota"]
    //
    // const upperCaseCars = cars.map ( car => {
    //     return car.toUpperCase()
    // })
    //
    // console.log(upperCaseCars)
    // console.log(cars)
    //
    // fib = [1,2,3,4,5,6]
    //
    // // function which get a num and put to **2
    // const pow2 = num => num ** 2
    //
    // // declarative nice
    // const pow2Fib = fib.map( pow2)
    //
    // console.log(pow2Fib)

    // array = [1, 3, 5, 8]
    // const add = num => num + 10
    // const addElemToArray = array.map(add)
    // console.log(addElemToArray)

    // const fib = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]
    //
    // // const pow2Fib = fib.map( num => num ** 2)
    // const filteredNumbers = fib.filter(num => {
    //     return num > 20
    // })
    //
    // // console.log(pow2Fib)
    // console.log(filteredNumbers)


    // map
    // filter
    // reduce

    const people = [
        {name: "Yaroslav", budget: 3500},
        {name: "Terry", budget: 3000},
        {name: "Criss", budget: 1700}
    ]

    // sum all budgets when > 2000 for example
    const allBudget = people
        // chaining in js
        .filter(person => person.budget>2000)
        .reduce((acc, person) => {
        acc += person.budget
        return acc
    },0)

    console.log(allBudget)


