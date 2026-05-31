fun main() {
    println(greet("Alex"))
    println(max(5, 4))
    println(describe(null))
    println(isEven(2))
}

fun greet(name: String): String {
    return "Привет, " + name + "!"
}

fun max(a: Int, b: Int): Int {
    if (a > b) return a
    else if (a < b) return b
    else return a
}

fun describe(text: String?): String {
    return (text?.length ?: "нет текста").toString()
}

fun isEven(n: Int): Boolean {
    return n % 2 == 0
}