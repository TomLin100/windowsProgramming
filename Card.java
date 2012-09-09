/*
 * 類別名稱：Card
 * 版本：1.00
 * 說明：
 *     本類別是一張卡的類別。
 */

public class Card
{
	private int point,color;  //牌的點數和花色
	private Rand_Number rand_num = new Rand_Number(52);  //取52個不重複的亂數
	public Card()
	{
		color = point = 0;
	}
	
	public int getColor() 
	{
		color = rand_num.CheckRepeat() / 13;
		return color;
	}
	
	public int getPoint()
	{
		point = rand_num.CheckRepeat() % 13;
		return point;
	}
	
	public void Restart()
	{
		rand_num.initialArray();
	}
}