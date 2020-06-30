fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getFortune(birthday: Int) : String {
    val fortunes = listOf( "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune.")

   return  when (birthday) {
       28, 31 -> "You are a lucky baby!"
       in 1..7 -> fortunes[birthday - 1]
       else -> fortunes[birthday.rem(fortunes.size)]
    }
}

fun getBirthday(): Int {
    println("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

