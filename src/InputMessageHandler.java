import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputMessageHandler implements ActionListener {
    private final JTextField messageSourceTextField;
    private final JTextArea messageDestTextArea;

    public InputMessageHandler(JTextField messageSourceTextField, JTextArea messageDestTextArea) {
        this.messageSourceTextField = messageSourceTextField;
        this.messageDestTextArea = messageDestTextArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (messageSourceTextField.getText().isBlank()){
            return;
        }
        sendMessage();
    }

    private void sendMessage(){
        messageDestTextArea.setText(
                new StringBuilder(messageDestTextArea.getText())
                                .append(messageSourceTextField.getText())
                                .append('\n')
                                .toString());
        messageSourceTextField.setText("");
        messageSourceTextField.requestFocus();
    }
}
