package org.miguelangel

import org.miguelangel.CommonFixtures.author

fun main() {
    //TIP Start of the app , if you need to change the author name, pls look a the fixtures
    printStart(author)

}


fun printStart(author : String ){

    clearConsole()

    println("""
        ==================================
        HELLO, WELCOME TO THE TASK TRACKER
        AUTHOR: $author
        ==================================
    """.trimIndent())
}

private fun clearConsole() {
    print("\u001b[H\u001b[2J")
    System.out.flush()
}