import java.time.LocalDate

fun main() {
    println("Who are you?")
    val readOnlyName: String = readln()
    println("Hello, $readOnlyName")

    println("What is the year you have born?")
    val yearOfBirthday: UInt = readln().toUInt()
    println("You was born at: $yearOfBirthday, so you are ${LocalDate.now().year - yearOfBirthday.toInt()}")
}