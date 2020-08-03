package chap13

import chap11.FileTreatmentException

fun main() {
    try {
        println("making root entries...")
        val rootDir = Directory("root")
        val binDir = Directory("bin")
        val tmpDir = Directory("tmp")
        val usrDir = Directory("usr")

        rootDir.add(binDir)
        rootDir.add(tmpDir)
        rootDir.add(usrDir)

        binDir.add(File("vi", 10000))
        binDir.add(File("latex", 20000))
        rootDir.accept(ListVisitor())
    } catch (e: FileTreatmentException) {
        e.printStackTrace()
    }
}