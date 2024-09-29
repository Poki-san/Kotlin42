//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val map = hashMapOf(
        1 to "Ира",
        2 to "Олег",
        3 to "Миша",
        4 to "Никита",
        5 to "Максим",
        6 to "Саша",
        7 to "Григорий",
    )
    println(map)

    println("Задание 1")
    println(map.filter {it.key < 5})

    println("\nЗадание 2")
    println(map.filter {it.value.last() == 'а'})

    println("\nЗадание 3")
    println(map.filter {it.value.first() == 'Г'})

    println("\nЗадание 4")
    val prizeMap = hashMapOf(
        "2713" to 20,
        "1925" to 4,
        "7636" to 13,
        "4249" to 25,
        "1050" to 16,
        "1965" to 31,
        "9371" to 7,
    )
    println(prizeMap.filter {it.key.last()=='5' && it.value > 20})
}