fun main(){
    // Practice on Logic Operations
    val myPercentage = 70
    //val isPercentage = myPercentage >= 0 && myPercentage<= 80
    val isPercentage = true
    println("Is my score percentage greater in range $isPercentage ")

    // if- function use case
    val user1 ="John"
    val pack = "free"
    val user2 = "James"
    val pack2 ="paid"

    if (pack == "free"){
        println("we only have one free user")
    }
    else {
        println("error")
    }

    //if-else variable value
    val paid = if (pack2 == "paid" ) "no ads" else "display ads"
    println("$paid this is  paid version ")

    val free = if (pack == "free") "display ads" else "no ads"
    println("This is a free version $free")


    val finishedHomework = true
    if (finishedHomework) {
        println("Can go to the cinema")

    }

    val isWorkDone = true
    if (isWorkDone){
        println("Well done you have done the work...")
    }
    else {
        println("work harder please.")
    }



}