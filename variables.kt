
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
