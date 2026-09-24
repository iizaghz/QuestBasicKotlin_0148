fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main() {
    println(uppercaseString("hello"))
    // HELLO
}

// Dapat ditulis dalam ekspresi lambda sbb :

fun main() {
    println({ string: String -> string.uppercase() }("hello"))
    // HELLO
}