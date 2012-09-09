import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Picked_up_pair extends JFrame implements ActionListener
{
	private Container c = getContentPane();
	//private JLabel[][] label = new JLabel[26][];
	private JLabel label1 = new JLabel("以湊成一對的牌");
	private JPanel panel = new JPanel();
	private JPanel msgPanel = new JPanel(); 
	private JButton button1;
	//private String imagePath = ".\\pokerCard\\card-rank";
	//private int totalPair = 0;
	
	public Picked_up_pair()
	{
		msgPanel.add(label1);
		GridLayout gLayout = new GridLayout(5,1,2,2);
		panel.setLayout(gLayout);
		button1 = new JButton("關閉視窗(C)");
		button1.setMnemonic(KeyEvent.VK_C);
		button1.addActionListener(this);
		c.add(msgPanel,BorderLayout.NORTH);
		c.add(panel,BorderLayout.CENTER);
		c.add(button1,BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent e)  //實作事件處理常式
	{
		if(e.getSource() == button1)
		{
			this.setVisible(false);
		}
	}
}