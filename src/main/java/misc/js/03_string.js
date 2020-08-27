    // "" == ''
    // `` <- dynamical expression

    // const name = "Caps"
    // const age = 26
    // function getAge(){
    //     return age
    // }
    //
    // const output = `my name is  ${name} and my age is
    //                             // ternary operators is good here
    //                             ${age < 20 ? "A" : "B"}`
    // console.log(output)

    // const output = `
    //     This is a text with
    //     paragraph as I want
    //         yes
    // `
    //
    // console.log(output)

    // js wrapped all simple type to objects
    // like new String()

    // const name = "Yaroslav"
    //
    // console.log (name.charAt(2))
    // console.log (name.indexOf("a"))
    // console.log (name.indexOf("!"))
    // console.log (name.startsWith("Yar"))
    // console.log (name.toUpperCase().startsWith("YAR"))
    // console.log (name.endsWith("av"))
    // console.log (name.repeat(3))
    //
    // const string = "     password    "
    // console.log(string.trimLeft());
    // console.log(string.trim());

    function logPerson (name, age) {
        // console.log(s, name, age)
        if (age<0) {
            age = "do not born yet"
        }
        // return `${s[0]} ${name} ${s[1]} ${age} ${s[2]}`
        return `${name} ${age}`
    }

    // const personName = "Yaroslav"
    // const personAge = "-1"
    //
    // const output = logPerson ` Name: ${personName } , Age: ${personAge}`
    // console.log(output)

    const name = "Yaro"
    const output = logPerson(name, -1)
    console.log(output)


