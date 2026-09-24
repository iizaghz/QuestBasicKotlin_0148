fun main() {
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Membuat salinan yang tepat dari User
    println(user.copy())
    // User(nama = Alex, id = 1)

    // Membuat salinan User dengan nama: "Max"
    println(user.copy("Max"))
    // User(nama = Max, id = 1)

    // Membuat salinan User dengan id: 3
    println(user.copy(id = 3))
    // User(nama = Alex, id = 3)
}