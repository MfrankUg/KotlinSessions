
fun main() {
    // This is the main function
    println("hello_world")
    // This is a string defined
    val name: String = "Jerry"
    println(name)
    var a = 1
    a = 2
    println(a)
    var b = 2
    b = a + b
    // This is for summations
    println(b)
    Cards(test = "test")
    animals()
    count()
    repeats()

    // more trial
    val scoreLevel1 = 100
    val scoreLevel2 = 98
    val scoreLevel3 = 52
    val totalScore =  scoreLevel3 + scoreLevel2 + scoreLevel1
    val averageScore = totalScore/3
    println("The total average score is $averageScore")

    // explicit variables
    val str: String = "" + 45 + "!"
    println(str)

    // use of any variable
    var structure :Any = "Block"
    structure = 5
    structure = true

    println(structure)

    // Basic numeric calculations

    println(1 + 2*3)

    // more on numbers
    val smallInt: Int = 15
    val largeValue: Float = smallInt.toFloat()
    val veryLarge : Double = smallInt.toDouble()

    println("This is the conversion of value from int $smallInt to float $largeValue and Double $veryLarge")
     // more on calculations
    println("The modulus of 10%2 is ${10%2}")
    println("The modulus of 5%2 is ${5%2}")
    println("The modulus of 2%5 is ${2%5}")

    val strVal1:Int = 5
    val strVal2: Int = 30
    var strFinal = strVal1 / strVal2
    // The answer below is always a zero because of having Int values
    println("This is a conversion ${(strFinal).toFloat()}")
    // Correction of this is







}
    fun Cards(test: String){

        println("Hello_2 $test")
    }
   fun animals(){
       var name = mutableListOf("Cat" , "Dogs", "Bears",)
       name = mutableListOf("Sheep", "Cows", "Goats")
       println(name)
       println(name.size)
}
 // practice on Loops
fun count(){
    val count1 = 1
     for( count1 in 1..5 ){
         println( "This is number $count1")

     }
}

// practice on for loops

fun repeats() {
    val playerName1 = "James"
    val prayerName2 = "Jerry"
    var player1Score = 1
    player1Score++
    var player2Score = 2
    player2Score--
    var fightCount = 0
    fightCount = player2Score + player1Score

     for(fightCount in 1 ..6){
        println("The count is $fightCount")
    }
    // To continue
}


