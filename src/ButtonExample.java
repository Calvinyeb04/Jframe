import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ButtonExample {
    private static final List<String> PLAYERS = Arrays.asList("Messi", "Curry", "Neymar", "Ter Stegen");
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);

        JButton button = new JButton("Click Here");
        button.setBounds(50, 100, 95, 30);
        button.addActionListener(e -> textField.setText("Player: " + getRandomPlayer()));

        frame.add(button);
        frame.add(textField);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private static String getRandomPlayer() {
        return PLAYERS.get(RANDOM.nextInt(PLAYERS.size()));
    }
}
