package chap22

import java.awt.Point

class DrawCommand(private val drawable: Drawable, private val position: Point): Command {
    override fun execute() {
        println("call draw")
        drawable.draw(position.x, position.y)
    }
}