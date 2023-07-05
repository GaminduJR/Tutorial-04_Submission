package Practical_04
import scala.io.StdIn

object Q1 extends App{

    def interest(diposit_Amount : Double): Double = diposit_Amount match{

        case x if x<=20000 => x*0.02
        case x if x<=200000 => x*0.04
        case x if x<=2000000 => x*0.035
        case x if x>2000000 => x*0.06
    }

    printf("Enter Deposit Amount : ")
    var diposit_Amount : Double = StdIn.readDouble()
    printf("Interest Is : %f" , interest(diposit_Amount))
}