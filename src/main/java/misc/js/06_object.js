
    // Objects

    // const person = {
    //     name: "Yaroslav",
    //     age: 30,
    //     isPresent: true,
    //     'complex key': 'complex value',
    //     ['key_'+(1+2)]: 'computed key',
    //     languages: ['ru', 'en', 'de'],
    //     greet() {
    //         console.log("greet from person")
    //     }
    // }
    //
    // person.languages.push('by')
    // person.languages.unshift('ua')
    // console.log(person)
    // const firstItem = person.languages.shift()
    // const lastItem = person.languages.pop()
    // console.log(firstItem, lastItem)
    //
    // var myArray = ['one','two','three', 'four', 'five']
    // console.log(myArray)
    // var removed = myArray.splice(1,1)
    // console.log(removed)
    // console.log(myArray)


    // objects isn't iterable

    // for (let key in person) {
    //
    //     if (person.hasOwnProperty(key)) {
    //         console.log('name:' + key)
    //         console.log('value:' + person[key])
    //     }
    //
    // }
    //
    // person.toString()

    // for in dangerous because it access not only by object but by prototype too
    // it may cause some troubles

    // const keys = Object.keys(person)
    // // console.log(keys)
    //
    // keys.forEach((key)=>{
    //     console.log('name:' + key)
    //     console.log('value:' + person[key])
    // })

    // bind return function
    // after that we are calling her where we want

    // call already call it

    // keyword function do own context
    // and this is related to current function scope

    // => do no ceate own context, you'll have minimum quantity of troubles
    //