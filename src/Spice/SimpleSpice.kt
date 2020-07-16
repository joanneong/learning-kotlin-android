package Spice

class SimpleSpice {
    var name: String = "curry";
    var spiciness: String = "mild";
    var heat: Int
        get() = if (spiciness == "mild") 5 else 0
        set(value) { }
}