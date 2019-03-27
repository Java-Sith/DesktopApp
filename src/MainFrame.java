import javax.swing.JFrame;
//import javax.swing.JButton;
import java.awt.BorderLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private TextPanel textPanel;
    //private JButton button;
    private Toolbar toolbar;
    private FormPanel formPanel;
    public MainFrame() {
        super("First Program");
        setLayout(new BorderLayout());
        textPanel = new TextPanel();
        //button = new JButton("Click Me!");
        toolbar = new Toolbar();
        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String string) {
                textPanel.appendText(string);
            }
        });
        formPanel = new FormPanel();
        /*button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //textPanel.append("Button works\n");
                textPanel.appendText("Hello\n");
            }
        });*/
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        //add(button, BorderLayout.SOUTH);
        add(formPanel, BorderLayout.WEST);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
