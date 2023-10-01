import java.time.LocalDate

fun main(args: Array<String>) {
    println("Who are you?")
    val readOnlyName = readln()
    println("Hello, $readOnlyName");

    println("What is the year you have born?")
    val yearOfBirthday = readln()
    println("You was born at: $yearOfBirthday, so you are ${LocalDate.now().year - yearOfBirthday.toInt()}")
}