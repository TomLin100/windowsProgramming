/*
 * ���O�W�١GCard
 * �����G1.00
 * �����G
 *     �����O�O�@�i�d�����O�C
 */

public class Card
{
	private int point,color;  //�P���I�ƩM���
	private Rand_Number rand_num = new Rand_Number(52);  //��52�Ӥ����ƪ��ü�
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