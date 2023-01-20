fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Invalid number of arguments. Usage: convertDistance <distance> <fromUnit> <toUnit>")
        return
    }

    val distance = args[0].toDouble()
    val fromUnit = args[1]
    val toUnit = args[2]

    val result = convertDistance(distance, fromUnit, toUnit)
    println("$distance $fromUnit = $result $toUnit")
}

fun convertDistance(value: Double, currentUnit: String, desiredUnit: String): Double {
    return when(currentUnit) {
         "km" ->  when(desiredUnit) {
            "mi" -> value * 0.621371
            "m" -> value * 1000
            "ft" -> value * 3280.84
            "yd" -> value * 1093.61
            "cm" -> value * 100000
            "mm" -> value * 1000000
            else -> {
                println("Invalid desired unit of measurement.")
                return value
            }
        }
        "mi" ->  when(desiredUnit) {
            "km" -> value * 1.60934
            "m" -> value * 1609.34
            "ft" -> value * 5280
            "yd" -> value * 1760
            "cm" -> value * 160934
            "mm" -> value * 1609344
            else -> {
                println("Invalid desired unit of measurement.")
                return value
            }
        }
        "m" ->  when(desiredUnit) {
            "km" -> value * 0.001
            "mi" -> value * 0.000621371
            "ft" -> value * 3.28084
            "yd" -> value * 1.09361
            "cm" -> value * 100
            "mm" -> value * 1000
            else -> {
                println("Invalid desired unit of measurement.")
                return value
            }
        }
        "ft" ->  when(desiredUnit) {
            "km" -> value * 0.0003048
            "mi" -> value * 0.000189394
            "m" -> value * 0.3048
            "yd" -> value * 0.33333
            "cm" -> value * 30.48
            "mm" -> value * 304.8
            else -> {
                println("Invalid desired unit of measurement.")
                return value
            }
        }
        "yd" -> when(desiredUnit) {
            "km" -> value * 0.0009144
            "mi" -> value * 0.000568182
            "m" -> value * 0.9144
            "ft" -> value * 3
            "cm" -> value * 91.44
            "mm" -> value * 914.4
            else -> {
                println("Invalid desired unit of measurement.")
                return value
            }
        }
        "cm" -> when(desiredUnit) {
            "km" -> value * 0.00001
            "mi" -> value * 0.0000062137
            "m" -> value * 0.01
            "yd" -> value * 0.010936133
            "ft" -> value * 0.0328
            "mm" -> value * 10
            else -> {
                println("Invalid desired unit of measurement.")
                return value
            }
        }
        "mm" ->  when(desiredUnit) {
            "km" -> value / 1000000
            "mi" -> value / 1609344
            "m" -> value / 1000
            "yd" -> value / 0.001094
            "ft" -> value / 305
            "cm" -> value / 10
            else -> {
                println("Invalid desired unit of measurement.")
                return value
            }
        }
        else -> value
    }
}