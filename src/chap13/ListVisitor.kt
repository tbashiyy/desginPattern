package chap13

class ListVisitor: Visitor() {
    private var currentDir = ""

    override fun visit(file: File) {
        println("$currentDir/$file")
    }

    override fun visit(directory: Directory) {
        println("$currentDir/$directory")
        val saveDir = currentDir
        currentDir = "$currentDir/${directory.getName()}"
        val it = directory.iterator()
        while(it.hasNext()) {
            val entry = it.next()
            entry.accept(this)
        }
        currentDir = saveDir
    }
}