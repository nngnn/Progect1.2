import kotlin.math.*
fun main(args: Array<String>) {
    //Task1
    val exercises = 13
    var exercisesSolved : Int = 0
    exercisesSolved++
    //Task2
    val age: Int = 19
    exercisesSolved++
    //3
    var averageAge: Double = 19.0
    averageAge = (averageAge + 30) / 2
    exercisesSolved++
    //4
    val testNumber: Int = 99
    val evenOdd : Int = testNumber % 2
    exercisesSolved++
    //5
    var answer: Int = 0
    answer += 1
    answer += 10
    answer shr 3
    println(answer)
    exercisesSolved++
    //6
    var age2 = 16
    print(age2)
    age2 = 30
    print(age2)
    exercisesSolved++
    //7
    (5*3) - ((4/2)*2)
    exercisesSolved++
    //8
    val a : Double = 22.0
    val b : Double = 41.5
    val average : Double = (a + b) / 2
    exercisesSolved++
    //9
    val fahrenheit : Double = 77.2
    val celcius : Double = (fahrenheit - 32) / 1.8
    exercisesSolved++
    //10
    val position : Int = 10
    val row : Int = position / 8
    val column : Int = position % 8
    exercisesSolved++
    //11
    val degrees : Double = 78.0
    val radians : Double = degrees * PI / 180
    exercisesSolved++
    //12
    val x1 : Double = 20.0
    val y1 : Double = 78.0
    val x2 : Double = 300.0
    val y2 : Double = 75.0
    val distance : Double = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
    exercisesSolved++
    println()
    println(exercisesSolved)
}