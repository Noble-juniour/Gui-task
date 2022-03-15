
package alphabet1;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JPanel;

public class Alphabet1 {
    public static void main(String[] args) {
    Runnable GuiTask = new Runnable() {
        @Override
        public void run() {
          init();
        }
    };
        SwingUtilities.invokeLater(GuiTask);
    }
    
    public static void init()
    {
        JFrame frame = new JFrame();
    
    frame.setPreferredSize(new Dimension(400,400));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("Lord lead me");
    frame.setContentPane(label);
    frame.setVisible(true);
    frame.pack();
    }
   
    }
      

