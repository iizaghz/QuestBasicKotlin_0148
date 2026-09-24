// Class.kt
class Customer

// Properties.kt
class Contact(val id: Int, var email: String)

// CreateInstance.kt
fun createInstance() {
    val contact = Contact(1, "mary@gmail.com")
}

// AccessProperties.kt
fun accessProperties() {
    val contact = Contact(1, "mary@gmail.com")

    // Prints the value of the property: email
    println(contact.email)
    // mary@gmail.com

    // Updates the value of the property: email
    contact.email = "jane@gmail.com"

    // Prints the new value of the property: email
    println(contact.email)
    // jane@gmail.com
}

// MemberFunctions.kt
class ContactWithFunction(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    // Create Instance
    createInstance()

    // Access Properties
    accessProperties()

    // Member Functions
    val contact = ContactWithFunction(1, "mary@gmail.com")
    contact.printId()
    // 1
}