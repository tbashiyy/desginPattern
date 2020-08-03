package chap14

class NoSupport(name: String): Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        return false
    }
}
