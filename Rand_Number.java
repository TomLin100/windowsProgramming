/*
 * ���O�W�١GRand_Number
 * �����G
 *     �����O���D�n�\��O���üƤ����ơA�L����惡���O
 */

public class Rand_Number
{
	private int amount;   //button���ƶq
	private boolean[] isRepeat;

	public Rand_Number(int amount)  //Constructor
	{
		this.amount = amount;
		isRepeat = new boolean[amount];
	}

	public void initialArray()
	{
		for(int i=0;i<amount;i++) isRepeat[i] = false;
	}

    public int CheckRepeat()  //�ˬd�üƬO�_����
    {
   	    int i;
   	    while(true)
        {
      	   i = (int)(Math.random() * 52);
      	   if( !isRepeat[i] )
      	   {
      		  isRepeat[i] = true;
      		  break;
      	   }
        }
        return i+1;
    }
}
