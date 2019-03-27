import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;
    private StringListener textListener;
    public Toolbar() {
        setBorder(BorderFactory.createEtchedBorder());
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");
        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloButton);
        add(goodbyeButton);
    }
    public void setStringListener(StringListener listener) {
        this.textListener = listener;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton)e.getSource();
        if (clicked == helloButton) {
            //textPanel.appendText("Hello World!\n");
            if (textListener != null) {
                textListener.textEmitted("Hello World!\n");
            }
        }
        else if (clicked == goodbyeButton) {
            //textPanel.appendText("Goodbye World!\n");
            if (textListener != null) {
                textListener.textEmitted("Goodbye World!\n");
            }
        }
    }
}
