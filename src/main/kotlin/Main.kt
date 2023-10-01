fun main(args: Array<String>) {
    println("Who are you?")
    val readOnlyName = readln()
    println("Hello, $readOnlyName");

    println("What year is it?")
    var mutableName = readln()
    println("Hello, $mutableName");

    println("What is the year you have born?")
    mutableName = readln()
    println("You was born at, $mutableName");
}