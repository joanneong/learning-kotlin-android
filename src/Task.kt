fun main(args: Array<String>) {
    println("What is your mood today?")
    val mood = readLine()!!
    println(whatShouldIDoToday(mood))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        shouldWalk(mood, weather) -> "go for a walk"
        shouldSleep(mood, weather, temperature) -> "stay in bed"
        isTooHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun shouldWalk(mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun shouldSleep(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun isTooHot(temperature: Int) = temperature > 35
