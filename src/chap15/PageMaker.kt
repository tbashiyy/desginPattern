package chap15

import java.io.FileWriter
import java.io.IOException

class PageMaker {
    companion object {
        fun makeWelcomePage(mailAdder: String, fileName: String) {
            try {
                val mailProp = Database.getProperties("src/chap15/mailData")
                val userName = mailProp.getProperty(mailAdder)
                val writer = HtmlWriter(FileWriter(fileName))
                writer.title("Welcome to $userName's page!")
                writer.paragraph("$userName のページへようこそ!")
                writer.paragraph("hogehoge")
                writer.mailto(mailAdder, userName)
                writer.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }
}