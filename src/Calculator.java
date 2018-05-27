import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Calculator
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                CalculatorFrame frame = new CalculatorFrame();
                frame.setTitle("Calculator");
                frame.setIconImage(new ImageIcon(getClass().getResource("./cal.png")).getImage());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}