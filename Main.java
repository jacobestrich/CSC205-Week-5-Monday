import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Main 
{
    public static void main(String[] args) 
    {
        //JOptionPane.showMessageDialog(null, "Hello World!");

        

        //window.setContentPane(content);
        
        JFrame window = new JFrame("GUI Test1 - Main file");
        window.setSize(500,500);
        window.setLocation(1000, 300);
        window.setVisible(true);        

        TestJFrame test = new TestJFrame();
    }
    
}