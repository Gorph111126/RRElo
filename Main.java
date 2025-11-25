import java.awt.BorderLayout;
import java.io.File;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //frame setup
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton();
        JLabel instruction = new JLabel("Put your stuff here");
        JPanel topPanel = new JPanel();
        JPanel filePanel = new JPanel();
        JFileChooser replayFile = new JFileChooser("C:\\Users\\Alexander Granville\\Documents\\League of Legends\\Replays");


        button.setSize(200,50);
        frame.setSize(600,700);
        filePanel.add(button);
        
        frame.add(topPanel,BorderLayout.NORTH);
        frame.add(filePanel,BorderLayout.CENTER);
        topPanel.add(instruction);
        topPanel.setVisible(true);
        frame.setVisible(true);
        filePanel.setVisible(true);    
    
    //show the replay file selector
            button.addActionListener(e -> {
            int result = replayFile.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION){
                File selectedFile = replayFile.getSelectedFile();
                System.out.println(selectedFile);
            }
        });
    }
}
