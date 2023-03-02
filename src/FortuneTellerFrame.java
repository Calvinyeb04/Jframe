import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Random;

public class FortuneTellerFrame extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setTitle("Fortune Teller");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create header label and add it to panel
     //   JLabel headerLabel = new JLabel("Fortune Teller");
       // panel.add(headerLabel);

        // create icon label with image and text
        ImageIcon fortuneIcon = new ImageIcon("src/Fortune_icon.png"); // replace with your image file name
        Image scaledImage = fortuneIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel fortuneLabel = new JLabel("Fortune Teller", scaledIcon, JLabel.CENTER);
        fortuneLabel.setVerticalTextPosition(JLabel.BOTTOM);
        fortuneLabel.setHorizontalTextPosition(JLabel.CENTER);
        fortuneLabel.setFont(new Font("Times New Roman", Font.BOLD, 25)); // replace with a font face that works with your image

        // add labels to panel and frame
        panel.add(fortuneLabel);
        frame.add(panel);

        frame.setVisible(true);



        ////Middle Panel///
        //Delcear the Scanner//
        // create the middle panel with a JTextArea within a JScrollPane
        JTextArea fortunesArea = new JTextArea(10, 40); // specify the number of rows and columns for the text area
        fortunesArea.setFont(new Font("Arial", Font.PLAIN, 14)); // set the font for the text area
        JScrollPane scrollPane = new JScrollPane(fortunesArea); // wrap the text area in a scroll pane
        panel.add(scrollPane);

        // add the panel to the frame and display it
        frame.add(panel);
        frame.setVisible(true);



        // Create the top panel with a large text label
        JButton fortuneButton = new JButton("Get your fortune");
        fortuneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add fortunes to the list
                ArrayList<String> fortunes = new ArrayList<>();
                fortunes.add("Every new beginning comes from some other beginning's end.");
                fortunes.add("Don't let yesterday take up too much of today.");
                fortunes.add("There is always something left to love.");
                fortunes.add("Graduation is the first step of the next chapter of your life.");
                fortunes.add("Wishes are granted in a mother's heart.");
                fortunes.add("Life is not about hoping and wishing, it's about doing and becoming.");
                fortunes.add("When you come to the end of your rope, tie a knot and hold on.");
                fortunes.add("Follow your heart. See what turns up.");
                fortunes.add("Don't make a wish. Make a decision.");

                // Generate a random index within the range of the list size
                Random fortuneRandom = new Random();
                int randomIndex = fortuneRandom.nextInt(fortunes.size());

                // Get the fortune at the random index
                String randomFortune = fortunes.get(randomIndex);

                // Add the fortune to the text area
                fortunesArea.append(randomFortune + "\n");
            }
        });
        panel.add(fortuneButton, BorderLayout.NORTH);

        // Create the middle panel with a JTextArea within a JScrollPane
        JTextArea FortunesArea = new JTextArea(10, 40); // specify the number of rows and columns for the text area
        fortunesArea.setFont(new Font("Arial", Font.PLAIN, 14)); // set the font for the text area
        JScrollPane ScrollPane = new JScrollPane(fortunesArea); // wrap the text area in a scroll pane
        panel.add(scrollPane);

        /*
        // Display a random fortune when the button is clicked
        JButton FortuneButton = new JButton("Tell me my fortune!");
        fortuneButton.addActionListener(e -> {
            int randomIndex = new Random().nextInt(fortunes.size());
            fortunesArea.append(fortunes.get(randomIndex) + "\n"); // add fortune to text area
        });
        panel.add(fortuneButton);
         */

        // add the panel to the frame and display it
        frame.add(panel);
        frame.setVisible(true);







    }
}
