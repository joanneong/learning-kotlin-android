import java.util.*

fun main(args: Array<String>) {
    println("Hello world")
    feedTheFish()

    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun shouldChangeWater(
    day: String,
    temperate: Int = 22,
    dirty: Int = 20): Boolean {
    return true
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("It is $day and the fish eats $food")

    if (shouldChangeWater(day)) {
        println("Should change water today")
    }
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true): Boolean {

    var totalSize = fishSize
    for (fish in currentFish) {
        totalSize += fish
    }

    return if (hasDecorations) totalSize <= 0.8 * tankSize  else totalSize <= tankSize
}