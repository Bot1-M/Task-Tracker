package org.miguelangel

import java.io.File

val DATABASE = File("src/resources/data.json")

fun main() {

   //* The JSON file should be created if it does not exist.
    fileSetUp()

}


fun fileSetUp(){
    if (!DATABASE.exists()) {
        DATABASE.createNewFile()
    }
    return
}

