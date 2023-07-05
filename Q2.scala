package Practical_04
import scala.io.StdIn

object Q2 extends App{

    def PatternMatching(input_Int: Int) : String = input_Int match{

        case x if x<=0 => "It's Negative or Zero"
        case x if x%2 == 0 => "It's Even"
        case x if x%2 == 1 => "It's Odd"
         
    }

    printf("Enter Integer : ")
    var input_Int : Int = StdIn.readInt()
    printf(PatternMatching(input_Int))
     
}