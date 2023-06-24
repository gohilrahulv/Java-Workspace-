import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator 
{
    JFrame f;
    JButton b1,b2;    
    JLabel l1,l2 ,result;
    JTextField t1,t2;

    public Calculator()
    {
        f = new JFrame();

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        
		l1 =new JLabel("Enter First Value: ");
		l1.setBounds(50, 50, 100, 30);
		
		l2 =new JLabel("Enter Second Value: ");
		l2.setBounds(50, 100, 100, 30);
		
		
		t1 = new JTextField();
		t1.setBounds(160, 50, 150, 30);
		
		t2 = new JTextField();
		t2.setBounds(160, 100, 150, 30);

		
		b1 = new JButton("+");
		b1.setBounds(100,150,50,30);
		b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(t1.getText());
                Double num2 = Double.parseDouble(t2.getText());
                Double r = num1 + num2;
                result.setText("Result: " + r);
            }
        });

		b2 = new JButton("-");
		b2.setBounds(200,150,50,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double num1 = Double.parseDouble(t1.getText());
                Double num2 = Double.parseDouble(t2.getText());
                Double r = num1 - num2;
                result.setText("Result: " + r);
            }
        });
        result = new JLabel("Result: ");
        result.setBounds(50, 200, 300, 30);




        f.add(b1);
        f.add(b2);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(result);
		

    }
    public static void main(String args[])
    {
        new Calculator();
    } 

}
