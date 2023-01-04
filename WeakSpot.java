import javax.swing.ImageIcon;

/**
 * 
 * @author Ben Dai, Leon Li, Eric Han, Phillip Zhang
 * destructible planks obs
 *
 */
public class WeakSpot extends Obstacles
{
	
	
	private WoodWall wall;
	
	public WeakSpot(int x, int y, int width, int height, WoodWall wall)
	{
		super(width, height, new ImageIcon("WeakSpot.png"));
		setBounds(x, y, width, height);
		this.wall = wall;
	}
	
	public void destroy()
	{
		wall.destroy();
	}
	
	public boolean isDestroyed()
	{
		return wall.isDestroyed();
	}
}
