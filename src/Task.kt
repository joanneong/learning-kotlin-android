fun main(args: Array<String>) {
    println(whatShouldIDoToday("sad"))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        temperature > 23 -> "hide in air con"
        else -> "Stay home and read."
    }
}
