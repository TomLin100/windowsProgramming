/*
 * 類別名稱：Form1
 * 說明：
 *    本類別是視窗的Layout介面
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Form1 extends JFrame implements ActionListener
{
	//定義所需的視窗物件
	private Container c = getContentPane();
	private JPanel panel = new JPanel();
	private JPanel upperPanel = new JPanel();
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menu1,menu2; 
	private JMenuItem item1,item2,item3,item4;
	private JLabel label1;
	private JButton[] button = new JButton[52]; 
	private ImageIcon imageicon1;
	
	//
	private Picked_up_pair p = new Picked_up_pair();
	private final String imagePath  = ".\\pokerCard\\card-rank";
	public Form1()
	{
		super("撲克牌記憶遊戲               版本：1.00");
		menuInitialize();
		upperPanel.setLayout(new GridLayout(6,9,4,4));
		buttonInitialize();
		labelInitialize();
		addContainer();
	}
	
	private void menuInitialize()  //初始化下拉式選單
	{
		setJMenuBar(menuBar);
		//第一個選單
		menu1 = new JMenu("遊戲(G)");
		menu1.setMnemonic(KeyEvent.VK_G);
		item1 = new JMenuItem("開始(S)",KeyEvent.VK_S);
		item1.addActionListener(this);
		menu1.add(item1);
		item2 = new JMenuItem("結束(E)",KeyEvent.VK_E);
		item2.addActionListener(this);
		menu1.add(item2);
		menuBar.add(menu1);
		//第二個選單
		menu2 = new JMenu("資訊(I)");
		menu2.setMnemonic(KeyEvent.VK_I);
		item3 = new JMenuItem("顯示所有撿到的牌(P)",KeyEvent.VK_P);
		item3.addActionListener(this);
		menu2.add(item3);
		item4 = new JMenuItem("關於(A)",KeyEvent.VK_A);
		item4.addActionListener(this);
		menu2.add(item4);
		menuBar.add(menu2);
	}
	
	private void buttonInitialize()  //初始化按鈕
	{
		for(int i=0;i<52;i++)
		{
			button[i] = new JButton();
			imageicon1 = new ImageIcon(imagePath+"Back.jpg");
			button[i].setIcon(imageicon1);
			button[i].setBackground(Color.WHITE);
			button[i].addActionListener(this);
			upperPanel.add(button[i]);
		}
	}
	
	private void labelInitialize()  //初始化Label
	{
		label1 = new JLabel("得分： ");
		upperPanel.add(label1);
	}
	
	private void addContainer()  //將視窗元件加到Container中
	{
		c.add(upperPanel,BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e)  //實作事件處理常式
	{
		if(e.getSource() == item1)
		{
			
		}
		if(e.getSource() == item2)  System.exit(0);
		if(e.getSource() == item3)  //顯示湊成一對的視窗
		{
			p.setSize(600,600);
			p.setVisible(true);
		}
		if(e.getSource() == item4)
		{
			JOptionPane.showMessageDialog(panel,
                    "程式名稱：撲克牌記憶遊戲\n\n"+
                    "作者：林廣學\n\n"+
                    "版本：1.01\n\n"	+
                    "開發日期：2012/08/28",
                    "關於",
                    JOptionPane.INFORMATION_MESSAGE);
		}
		buttonAction();
	}
	
	private void buttonAction()
	{
		
	}
}