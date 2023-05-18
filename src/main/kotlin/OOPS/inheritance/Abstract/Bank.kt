package OOPS.inheritance.Abstract

abstract class Bank {
    abstract fun simpleInterest(p:Int ,r:Double,t:Int):Double

}
class SBI:Bank(){
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
        return (p*r*t)/100

    }

}
class PNB : Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
        return (p * r * t) / 100
    }
}

fun main() {
    var sbi =SBI()
    var sbiInt=sbi.simpleInterest(400,100.0,200)
    println("SBI bank Interst :$sbiInt")

    var pnb =PNB()
    var pnbInt=pnb.simpleInterest(400,50.000,200)
    println("PNB bank Interst :$pnbInt")
}