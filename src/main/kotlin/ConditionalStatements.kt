fun main(args: Array<String>) {
    // IF STATEMENTS

    var age = 20
    if (age < 18){
        println("You are underage")
    }else{
        println("Welcome to the party")

    }

    var weight = 100
    var height = 1.9
    var bmi = weight / (height * height)
    if (bmi <= 18){
        println("Underweight")
    }else if (bmi <= 29){
        println("Normal weight")
    }else if (bmi <=34){
        println("Overweight")
    }else{
        println("Obese")
    }

    var math = 50
    var language = 45
    var science = 65
    var geography = 80
    var mean = (math + language + science + geography) / 4
    if (mean <= 30){
        println("D")
    }else if (mean <= 50){
        println("C")
    }else if (mean <= 75){
        println("B")
    }else{
        println("A")
    }
    // WHEN STATEMENTS
    var bettingNumber = 3
    when(bettingNumber){
        1 ->{
            println("You lost")
        }
        2 ->{
            println("You lost")
        }
        3 ->{
            println("You won")
        }
        4 ->{
            println("You lost")
        }
        else ->{
            println("Enter a number from 1 - 4 to bet")
        }
    }

}