package chap14

class LimitSupport(name: String, private val limit: Int): Support(name) {
    override fun resolve(trouble: Trouble): Boolean {
        return trouble.getNumber() < limit
    }
}