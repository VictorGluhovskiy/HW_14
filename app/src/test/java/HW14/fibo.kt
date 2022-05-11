package HW14

class fibo {
}
fun fib() {
    val a = 20
    var b = 0
    var c = 1
    print("First $a numbers:")
    for (i in 1..a) {
        print("$b -")
        val sum = b + c
        b = c
        c = sum


    }
}

fun fibonachi_recursive() {
    val num = 20
    val fib = fib_rec(num)
    println("Fib ($num) = $fib")
}

fun fib_rec(n: Int): Int {
    if (n == 0)
        return 0
    if (n == 1)
        return 1
    else
        return fib_rec(n - 2) + fib_rec(n - 1)

}
