package main.java;

import javax.swing.*;
import java.awt.*;

/**
 * Created by alex on 12/27/16.
 */
public class MainFrame {
    private JFrame frame;
    private Container contentPane;
    JPanel gridPannel;

    /**
     * Constructor for making the main frame and setting it's size and name
     * @param frameName
     */
    public MainFrame(String frameName){
        frame = new JFrame(frameName);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        gridPannel = new JPanel();
        gridPannel.setLayout(new GridBagLayout());

        frame.add(gridPannel);

        addComponentsToFrame();

        //contentPane = frame.getContentPane();
    }

    public JFrame getFrame(){
        return frame;
    }

    public void showFrame(){
        //addToFrame();
        frame.setBounds(100,100,500,500);
        frame.setVisible(true);
    }

    public void addToFrame(){
        JButton sampleButton = new JButton("Sample");
        sampleButton.setSize(100,100);
        sampleButton.doClick();
        contentPane.add(sampleButton);
    }

    public void addComponentsToFrame(){
        JTextField textField = new JTextField(10);
        textField.setSize(0,0);
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weighty = 1.0;
        c.weightx = 1.0;
        c.gridwidth = 8;
        c.gridheight = 8;
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.SOUTH;

        gridPannel.add(textField,c);
        gridPannel.revalidate();
    }
}
