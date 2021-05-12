import javax.swing.*;
import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;



/*
JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500,500);
*/

public class GUI implements ActionListener
{

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private BufferedImage image;

    public GUI() throws IOException
    {
        //JFrame frame = new JFrame();

        //JButton button = new JButton("TEST BUTTON");
        //button.addActionListener(this);
        //label =new JLabel("Number of clicks: 0");


//        JPanel panel = new JPanel();
//        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));
//        panel.setLayout(new GridLayout(0, 1));
        //panel.add(button);


        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setTitle("TEST GUI");
        //frame.pack();
        //frame.setVisible(true);

        imageExample();
        imageExample();
        //ImagePanelTest();

    }

    public void imageExample() throws IOException
    {

        JPanel panel = new JPanel();

        image =ImageIO.read(new File("C:\\Users\\jonas_ijqnlmm\\Desktop\\JPanel_image\\doot.jpg"));
        label =new JLabel(new ImageIcon(image));
        panel.add(label);

        //main window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Image Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Adding the panel to the main window
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }

//    public void ImagePanelTest() throws IOException
//    {
//        ImageIcon image = new ImageIcon("C:\\Users\\jonas_ijqnlmm\\Desktop\\JPanel_image\\doot.jpg");
//        JLabel label = new JLabel("doot", image, JLabel.CENTER);
//        JPanel panel = new JPanel(new BorderLayout());
//        panel.add( label, BorderLayout.CENTER );
//    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
