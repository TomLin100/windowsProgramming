/*
 * 類別名稱：Rand_Number
 * 說明：
 *     本類別的主要功能是取亂數不重複，無須更改此類別
 */

public class Rand_Number
{
	private int amount;   //button的數量
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

    public int CheckRepeat()  //檢查亂數是否重複
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
