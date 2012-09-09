/*
 * 程式名稱：撲克牌記憶遊戲
 * 版本：1.01
 * 說明：
 *    本類別是應用程式的進入點，不需做更改。
 */
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Game extends JFrame
{
	public static void main(String[] args)
	{
		Form1 f = new Form1();
		f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		f.setSize(600, 600);
		f.setVisible(true);
	}
}