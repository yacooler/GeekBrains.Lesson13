import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private JTextArea messagesTextArea;
    private JButton sendButton;
    private JTextField inputTextField;

    public MainWindow(){
        int SIZE_WIDTH = 800;
        int SIZE_HEIGHT = 600;
        setTitle("Сетевой чат");
        setBounds(getGraphicsConfiguration().getBounds().width / 2 - SIZE_WIDTH / 2,
                getGraphicsConfiguration().getBounds().height / 2 - SIZE_HEIGHT / 2,
                SIZE_WIDTH, SIZE_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();

    }

    private void initComponents() {

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel messagesPanel = new JPanel(new BorderLayout());
        JPanel textTypingPanel = new JPanel(new BorderLayout());

        messagesTextArea = new JTextArea();
        messagesTextArea.setEditable(false);
        messagesPanel.add(messagesTextArea);
        mainPanel.add(messagesPanel, BorderLayout.CENTER);

        inputTextField = new JTextField();
        sendButton = new JButton("Отправить");

        textTypingPanel.add(inputTextField, BorderLayout.CENTER);
        textTypingPanel.add(sendButton, BorderLayout.EAST);

        mainPanel.add(textTypingPanel, BorderLayout.SOUTH);

        this.add(mainPanel, BorderLayout.CENTER);
    }

}
