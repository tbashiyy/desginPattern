package chap15

import java.io.FileInputStream
import java.io.IOException
import java.util.*

class Database {
    companion object {
        fun getProperties(dbName: String): Properties {
            val fileName = "$dbName.txt"
            val prop = Properties()
            try {
                prop.load(FileInputStream(fileName))
            } catch(e: IOException) {
                println("Warning: $fileName is not found.")
            }
            return prop
        }
    }
}