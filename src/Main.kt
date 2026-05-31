fun main() {
    println(greet("Alex"))
    println(max(5, 4))
    println(describe(null))
    println(isEven(2))
}

fun greet(name: String): String = "Привет, $name!"

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun describe(text: String?): String {
    return if (text != null) "Длина: ${text.length}" else "Нет текста"
}

fun isEven(n: Int): Boolean {
    return n % 2 == 0
}