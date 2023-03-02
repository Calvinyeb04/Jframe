import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Random;


public class FortuneTeller extends JFrame {


    public static void main(String[] args) {
        //Declared the Scanners outside the code so everyone can access it //

        JFrame Frame = new JFrame();
        JPanel Panel = new JPanel();


        //Create JFrame//
        Frame.setSize(500, 500);
        Frame.setTitle("Fortune Teller");
        Frame.setVisible(true);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Create the Picture//
        ImageIcon FortuneIcon = new ImageIcon("src/Fortune_Icon.png");

        //Scaling the Picture so its Fits//
        Image ScaledImage = FortuneIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(ScaledImage);


        //Stating the Header //
        JLabel FortuneLabel = new JLabel("Fortune Teller", scaledIcon, JLabel.CENTER);

        //Positioning it //

        FortuneLabel.setVerticalTextPosition(JLabel.BOTTOM);
        FortuneLabel.setHorizontalTextPosition(JLabel.CENTER);
        FortuneLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));

        // Adding labels to panel and frame// IMPORTANT ElSE NOTHING WILL BE VISIBLE//
        Panel.add(FortuneLabel);
        Frame.add(Panel);

        Frame.setVisible(true);



        /*
        Middle Panel PT.1
         */

        //Creating The TextField//
        ////Middle Panel///
        // create the middle panel with a JTextArea within a JScrollPane
        JTextArea fortunesArea = new JTextArea(10, 40); // specify the number of rows and columns for the text area
        fortunesArea.setFont(new Font("Arial", Font.PLAIN, 14)); // set the font for the text area
        JScrollPane scrollPane = new JScrollPane(fortunesArea); // wrap the text area in a scroll pane
        Panel.add(scrollPane);

        // add the panel to the frame and display it
        Frame.add(Panel);
        Frame.setVisible(true);

        /*
        MIDDLE PART PT.2
         */

        //Scanners//
        ArrayList<String> Fortunes = new ArrayList<>();
        Random FortuneRandom = new Random();


        ///Fortunes//
        Fortunes.add("Every new beginning comes from some other beginning's end.");
        Fortunes.add("Don't let yesterday take up too much of today.");
        Fortunes.add("There is always something left to love.");
        Fortunes.add("Graduation is the first step of the next chapter of your life.");
        Fortunes.add("Wishes are granted in a mother's heart.");
        Fortunes.add("Life is not about hoping and wishing, it's about doing and becoming.");
        Fortunes.add("When you come to the end of your rope, tie a knot and hold on.");
        Fortunes.add("Follow your heart. See what turns up.");
        Fortunes.add("Don't make a wish. Make a decision.");


        //Getting Fortune Buttom//
        JButton GETFORTUNE = new JButton("GET FORTUNE");
        GETFORTUNE.setBounds(450,450,20,10);

        //Action Listeners//
        GETFORTUNE.addActionListener(e -> {
            int randomIndex = new Random().nextInt(Fortunes.size());
            fortunesArea.append(Fortunes.get(randomIndex) + "\n"); // add fortune to text area
        });



        //Make it visble//
        Panel.add(GETFORTUNE);














             /*
        Bottom Panel
         */

//Creating a Quit Button//
        JButton QuitButton = new JButton("Quit");
        QuitButton.setBounds(1-0,50,50,50);

//The Button ActionListener//
        QuitButton.addActionListener(e -> System.exit(0));

// Add the QuitButton to the Panel
        Panel.add(QuitButton);

// Add the Quit Panel to the Frame
        Frame.add(Panel);

// Make the Quit Frame visible
        Frame.setVisible(true);














    }
}

























