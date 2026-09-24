fun main() {
    val x = 2

    val result = when (x) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Unknown"
    }

    println(result)
}