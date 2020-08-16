package chap22

import java.awt.Canvas
import java.awt.Color
import java.awt.Graphics

class DrawCanvas(width: Int,height: Int, private val history: MacroCommand): Canvas(), Drawable {
    private val color = Color.RED
    private val radius = 6

    init {
        setSize(width, height)
        background = Color.WHITE
    }

    override fun draw(x: Int, y: Int) {
        val g = graphics
        g.color = color
        g.fillOval(x - radius, y - radius, radius*2, radius*2)
    }

    override fun paint(g: Graphics) {
        history.execute()
    }
}