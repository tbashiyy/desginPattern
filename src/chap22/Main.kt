package chap22

import java.awt.event.*
import javax.swing.Box
import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JFrame
import kotlin.system.exitProcess

class Main(title: String): JFrame(title), ActionListener, MouseMotionListener, WindowListener {
    private val history = MacroCommand()
    private val canvas = DrawCanvas(400, 400, history)
    private val clearButton = JButton("clear")
    private val undoButton = JButton("undo")

    init {
        this.addWindowListener(this)
        canvas.addMouseMotionListener(this)
        clearButton.addActionListener(this)
        undoButton.addActionListener(this)

        val buttonBox = Box(BoxLayout.X_AXIS)
        buttonBox.add(clearButton)
        buttonBox.add(undoButton)

        val mainBox = Box(BoxLayout.Y_AXIS)
        mainBox.add(buttonBox)
        mainBox.add(canvas)
        contentPane.add(mainBox)

        pack()
        isVisible = true
    }

    override fun actionPerformed(p0: ActionEvent?) {
        if (p0?.source == clearButton) {
            history.clear()
            canvas.repaint()
        }

        if (p0?.source == undoButton) {
            history.undo()
            canvas.repaint()
        }
    }

    override fun mouseMoved(p0: MouseEvent?) {
        //
    }

    override fun mouseDragged(p0: MouseEvent?) {
        val cmd = DrawCommand(canvas, p0?.point!!)
        history.append(cmd)
        cmd.execute()
    }

    override fun windowDeiconified(p0: WindowEvent?) {
        //
    }

    override fun windowClosing(p0: WindowEvent?) {
        exitProcess(0)
    }

    override fun windowClosed(p0: WindowEvent?) {
        //
    }

    override fun windowActivated(p0: WindowEvent?) {
        //
    }

    override fun windowDeactivated(p0: WindowEvent?) {
        //
    }

    override fun windowOpened(p0: WindowEvent?) {
        //
    }

    override fun windowIconified(p0: WindowEvent?) {
        //
    }

}

fun main() {
    Main("Command Pattern Sample")
}