import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private final JTextArea messagesTextArea = new JTextArea();
    private final JButton sendButton = new JButton("Отправить");
    private final JTextField inputTextField = new JTextField();

    public MainWindow(){
        int SIZE_WIDTH = 800;
        int SIZE_HEIGHT = 600;
        setTitle("Чат для интроверта");
        setBounds(getGraphicsConfiguration().getBounds().width / 2 - SIZE_WIDTH / 2,
                getGraphicsConfiguration().getBounds().height / 2 - SIZE_HEIGHT / 2,
                SIZE_WIDTH, SIZE_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        initHandlers();
        setVisible(true);
        inputTextField.requestFocus();
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel textTypingPanel = new JPanel(new BorderLayout());
        messagesTextArea.setEditable(false);
        JScrollPane messagesScrollPane = new JScrollPane(messagesTextArea);
        mainPanel.add(messagesScrollPane, BorderLayout.CENTER);
        textTypingPanel.add(inputTextField, BorderLayout.CENTER);
        textTypingPanel.add(sendButton, BorderLayout.EAST);
        mainPanel.add(textTypingPanel, BorderLayout.SOUTH);
        this.add(mainPanel, BorderLayout.CENTER);
    }

    private void initHandlers() {
        InputMessageHandler messageHandler = new InputMessageHandler(inputTextField, messagesTextArea);
        inputTextField.addActionListener(messageHandler);
        sendButton.addActionListener(messageHandler);
    }

}
