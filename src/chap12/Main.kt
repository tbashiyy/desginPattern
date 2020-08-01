package chap12

import chap12.prac.MultiStringDisplay

fun main() {
    val md = MultiStringDisplay()
    md.add("おはようございます")
    md.add("こんにちは。")
    md.add("おやすみなさい。また明日。")
    md.show()

    val d1 = SideBorder(md, '#')
    d1.show()
}