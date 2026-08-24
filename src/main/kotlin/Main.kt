package org.miguelangel

import java.io.File
import java.util.InputMismatchException
import java.util.Scanner

val DATABASE = File("src/resources/data.json")

fun main() {

    //* The JSON file should be created if it does not exist.
    fileSetUp()

    val input = Scanner(System.`in`)

    do {

        print(
            """
          //////////////////////////////////////
          /////////////TASK-TRACKER/////////////
          //////////////////////////////////////
          
          
          1. Register new task
          2. Update task
          3. Delete Task
          4. List all tasks
          5. List all finished tasks
          6. List all unfinished tasks
          7. List all task in progress
          
          Enter your option number (Press enter continue):
           
      """.trimIndent()
        )
        val option: Int
        try {
            option = input.nextInt()
        } catch (e: InputMismatchException) {
            error("EXIT + ${e.cause}")
        }

        print("Chosen option $option")
        println()

    } while (input.hasNextLine())

    println("EXIT")

}


fun fileSetUp() {
    if (!DATABASE.exists()) {
        DATABASE.createNewFile()
    }
    return
}

