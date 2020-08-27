
    // factorial
    function factorial() {
        let fact = 1
        const number = 5
        for (i=1; i<=number; i++){
            fact = fact * i
        }
        console.log(fact)
    }
    factorial()

    // Fibonacchi
    function fibonacchi() {
        for (i = 0, j = 1, k = 0, fib = 0; i < 10; i++, fib = j + k, j = k, k = fib) {
            console.log(fib)
        }
    }
    fibonacchi()
