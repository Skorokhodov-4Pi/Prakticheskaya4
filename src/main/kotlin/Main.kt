import java.util.Scanner

/*val exam1 = (1..10).random()
val exam2 = (1..10).random()
val exam3 = (1..10).random()
fun main(args: Array<String>) {
    println("Оценка по первому экзамену: $exam1")
    println("Оценка по второму экзамену: $exam2")
    println("Оценка по третьему экзамену: $exam3")
    if (exam1 >= 5)
    {
        println("Экзамен №1: сдан хорошо")
    }
    else
    {
        println("Экзамен №1: сдан плохо")
    }
    if (exam2 >= 5)
    {
        println("Экзамен №1: сдан хорошо")
    }
    else
    {
        println("Экзамен №1: сдан плохо")
    }
    if (exam3 >= 5)
    {
        println("Экзамен №1: сдан хорошо")
    }
    else
    {
        println("Экзамен №1: сдан плохо")
    }
}
*/
/*
var totalScore = 0;
fun main(args: Array<String>){
    for (i in 1..3) {
        val result = (0..1).random() // генерируем случайное число от 1 до 10
        val score = if (result > 0) 1 else 0 // если результат больше 5, записываем 1, иначе 0
        totalScore += score
        println("Выстрел $i: $result, Балл: $score")
    }
    println("Общее количество баллов спортсмена: $totalScore")
}
*/
/*
var population = 10000000
var birthRate = 14
var deathRate = 8
fun main(args: Array<String>){
    for (i in 1..10) {
        birthRate -= 1
        deathRate -= 1

        if (birthRate < 7) {
            birthRate = 7
        }

        if (deathRate < 6) {
            deathRate = 6
        }

        val births = (population * birthRate / 1000)
        val deaths = (population * deathRate / 1000)

        population += (births - deaths)
    }
    println("Численность населения через 10 лет: $population")
}
*/
/*
fun main(args: Array<String>){
    var sc = Scanner(System.`in`)
    println("Введите сумму вклада: ")
    var deposit = sc.nextFloat()
    println("Введите кол-во месяцев: ")
    var month = sc.nextInt()
    for (mount in 1..month)
    {
        deposit += deposit * 0.07f
    }
    println("Конечная сумма вклада с учётом процентов: $deposit")
}
 */
/*
fun main(args: Array<String>){
    var sc = Scanner(System.`in`)
    println("Введите сумму вклада: ")
    var deposit = sc.nextFloat()
    println("Введите кол-во месяцев: ")
    var months = sc.nextLong()
    var month = 1
    while (month <= months) {
        deposit += deposit * 0.07f
        month++
    }
    println("Конечная сумма вклада с учётом процентов: $deposit")
}
 */
fun main(args: Array<String>){
    for(i in 1 .. 10){
        for(j in 1 .. 10)
            print("%d x %d = %d ".format(i, j, i*j))
        println()
    }
}