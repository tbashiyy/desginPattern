package chap6.framework

class Manager {
    private val showcase = hashMapOf<String, Product>()

    fun register(name: String, proto: Product): Unit {
        showcase[name] = proto
    }

    fun create(protoname: String): Product? {
        val p = showcase[protoname]
        return p?.createClone()
    }
}