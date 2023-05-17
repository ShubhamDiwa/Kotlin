package ClassesAndObject

import jdk.jfr.DataAmount

class BankTransactions {

    class Bank(){
        var acc_no: Int = 0
        var name: String =  ""
        var amount: Float = 0.toFloat()
        fun Data(ac: Int,n: String, am: Float ) {
            acc_no=ac
            name=n
            amount=am
            println("Account no: ${acc_no} holder :${name} amount :${amount}")
        }

        fun Deposit( am: Float,X: Float){
            this.amount= amount+X

        }
        fun Debit(am:Float,X: Float){
            this.amount -=X
        }

    }

}

fun main() {
var acc=BankTransactions.Bank()
    acc.Data(12345,"Shubam",1000F)
    acc.Deposit(acc.amount,100F)
    acc.Debit(acc.amount,50F)
    print(acc.amount)



}