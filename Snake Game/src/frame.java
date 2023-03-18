import javax.swing.*;

public class frame extends JFrame {
    frame() {
        //adding the panel to the frame
        this.add(new panel());
        // naming the frame window
        this.setTitle("SnakeGame");
        // To make sure uniform window
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
    }
}
