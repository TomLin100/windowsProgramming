/*
 * ���O�W�١GForm1
 * �����G
 *    �����O�O������Layout����
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Form1 extends JFrame implements ActionListener
{
	//�w�q�һݪ���������
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
		super("���J�P�O�йC��               �����G1.00");
		menuInitialize();
		upperPanel.setLayout(new GridLayout(6,9,4,4));
		buttonInitialize();
		labelInitialize();
		addContainer();
	}
	
	private void menuInitialize()  //��l�ƤU�Ԧ����
	{
		setJMenuBar(menuBar);
		//�Ĥ@�ӿ��
		menu1 = new JMenu("�C��(G)");
		menu1.setMnemonic(KeyEvent.VK_G);
		item1 = new JMenuItem("�}�l(S)",KeyEvent.VK_S);
		item1.addActionListener(this);
		menu1.add(item1);
		item2 = new JMenuItem("����(E)",KeyEvent.VK_E);
		item2.addActionListener(this);
		menu1.add(item2);
		menuBar.add(menu1);
		//�ĤG�ӿ��
		menu2 = new JMenu("��T(I)");
		menu2.setMnemonic(KeyEvent.VK_I);
		item3 = new JMenuItem("��ܩҦ��ߨ쪺�P(P)",KeyEvent.VK_P);
		item3.addActionListener(this);
		menu2.add(item3);
		item4 = new JMenuItem("����(A)",KeyEvent.VK_A);
		item4.addActionListener(this);
		menu2.add(item4);
		menuBar.add(menu2);
	}
	
	private void buttonInitialize()  //��l�ƫ��s
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
	
	private void labelInitialize()  //��l��Label
	{
		label1 = new JLabel("�o���G ");
		upperPanel.add(label1);
	}
	
	private void addContainer()  //�N��������[��Container��
	{
		c.add(upperPanel,BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e)  //��@�ƥ�B�z�`��
	{
		if(e.getSource() == item1)
		{
			
		}
		if(e.getSource() == item2)  System.exit(0);
		if(e.getSource() == item3)  //��ܴꦨ�@�諸����
		{
			p.setSize(600,600);
			p.setVisible(true);
		}
		if(e.getSource() == item4)
		{
			JOptionPane.showMessageDialog(panel,
                    "�{���W�١G���J�P�O�йC��\n\n"+
                    "�@�̡G�L�s��\n\n"+
                    "�����G1.01\n\n"	+
                    "�}�o����G2012/08/28",
                    "����",
                    JOptionPane.INFORMATION_MESSAGE);
		}
		buttonAction();
	}
	
	private void buttonAction()
	{
		
	}
}