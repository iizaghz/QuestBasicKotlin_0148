fun main() {

    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")

    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
    // [apple, banana, cherry]

    // Read-only view of mutable set
    val fruitLocked: Set<String> = fruit

    println(fruit.count())
    println("banana" in fruit)

    fruit.add("orange")
    fruit.remove("apple")

    println(fruit)
}