import javax.swing.ImageIcon;

/**
 * 
 * @author Ben Dai, Leon Li, Eric Han, Phillip Zhang
 * opposing ninjas
 *
 */
public class EnemyNinja extends Obstacles
{
	
	private boolean killed;
	
	public EnemyNinja(int x, int y, int width, int height)
	{
		
		super(width, height, new ImageIcon("EnemyNinja.png"));
		setBounds(x, y, width, height);
		killed = false;
		
	}
	
	public boolean isKilled()
	{
		return killed;
	}
	
	public void kill()
	{
		setImgPosY(25);
		killed = true;
		setImgIcon(new ImageIcon("DeadEnemy.png"));
		setLocation(getX(), getY() + 20);
	}
	
}
