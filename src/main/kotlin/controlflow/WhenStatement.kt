package controlflow

fun main() {
    var number =4

    var numberProvided= when(number){
        1-> "One"
        2-> "Two"
        3-> "Three"
        4-> "Four"

        else -> {
            println("Inavlid number")

        }
    }
    println("your number: $numberProvided")


//+++++++++++++++++++++++++++++++++++++++++++++++++++
              println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")

    var num=5
    when(num){
        1-> println("one ")
        2-> println("Two")
        3-> println("three")
        4-> println("four")
        5-> println("five")
        else -> println("Invalid number")
    }


    var n=7
    when(n){
        1-> {
            println("First day of the month")
        }
        7->{
            println("last day of the month")


        }
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
            println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")


    var nums=12
    when(nums){
        1,2,4,5->{
            println("Summer Season ")
        }
        3,6,7,8 ->{
            println("It's a  rainy season ")

        }
        9,10,11,12,13 ->{
            println(" it's a winter season ")


        }


    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
          println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
    var N=8
    when(N){
        in 1..5-> println("input is provided in the range of 1 to 5")
        in 6..10-> println("Input is provided in the range of 1 to 10")
    }


    }