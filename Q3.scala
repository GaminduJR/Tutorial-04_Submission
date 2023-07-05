package Practical_04
import scala.io.StdIn

import scala.compiletime.ops.string

object Q3 {

    def toUpper(str : String): String = {
        str.toUpperCase()
    }

    def toLower(str : String): String = {
        str.toLowerCase()
    }

    def formatNames(name : String)(formatFunction: String => String) : String ={
        formatFunction(name)
    }

    def main (args : Array[String]): Unit = {
        val names = List("Benny", "Niroshan", "Saman", "Kumara")
       // printf("Enter a list of names(separated by commas) : ")
       // val input_names = StdIn.readLine()

       // val names = input_names.split(",").map(_.trim)

        names.foreach { name =>
            var formattedName = formatNames(name) {

                case str if str.length % 2 == 0 => toUpper(str)
                case _ => toLower(name)
            }

            printf(formattedName)
        }
    }

    
}