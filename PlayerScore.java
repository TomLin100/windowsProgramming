public class PlayerScore
{
	private int score = 0;
	public PlayerScore()
	{
		ResetScore();
	}
	
	public void ResetScore()
	{
		score = 0;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public int ScoreSum(int sum)
	{
		return score += sum;
	}
}