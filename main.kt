fun main() {
    val x = 10
    
    if (x > 5) {
        println("x is greater than 5")
    } else {
        println("x is not greater than 5")
    }
    
    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> println("x is not 1 or 2")
    }
}
