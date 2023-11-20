import javax.swing.JFrame;

public class TestJFrame extends JFrame
{
    public TestJFrame() 
    {
        super("Gui Test - TestJFrame file");
        setContentPane(new MyJPanel());
        setSize(500, 500);
        setLocation(1000, 300);
        setVisible(true);
    }


}
