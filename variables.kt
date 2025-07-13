
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


