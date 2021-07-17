fun main() {
    val hands = arrayOf("Rock", "Paper", "Scissors")
    printResult(hands)
}

fun pickHand(hands: Array<String>): String {
    return hands[(Math.random() * hands.size).toInt()]
}

fun printResult(hands: Array<String>) {
    val input = takeInput(hands)
    val hand = pickHand(hands)

    if (input == "Scissors" && hand == "Paper")
        println("You chose Scissors, I chose Paper. You win!")
    else if (input == "Rock" && hand == "Scissors")
        println("You chose Rock, I chose Scissors. You win!")
    else if (input == "Paper" && hand == "Rock")
        println("You chose Paper, I chose Rock. You win!")
    else if (input == "Paper" && hand == "Scissors")
        println("You chose Paper, I chose Scissors. I win!")
    else if (input == "Scissors" && hand == "Rock")
        println("You chose Scissors, I chose Rock. I win!")
    else if (input == "Rock" && hand == "Paper")
        println("You chose Rock, I chose Paper. I win!")
    else
        println("This game is a filthy draw!!!")
}

fun takeInput(hands: Array<String>): String{
    val prompt = "Please enter one of the following: Rock Paper Scissors: "
    println(prompt)

    var userInput = readLine().toString()
    while (userInput !in hands){
        println("You must enter a valid choice")
        println()
        print(prompt)
        userInput = readLine().toString()
    }
    return userInput
}