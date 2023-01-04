import javax.swing.ImageIcon;

/**
 * 
 * @author Ben Dai, Leon Li, Eric Han, Phillip Zhang
 * destructible planks obs
 *
 */
public class WoodWall extends Obstacles
{
	
	private boolean destroyed;
	
	public WoodWall(int x, int y, int width, int height)
	{
		super(width, height, new ImageIcon("WoodWall.png"));
		setBounds(x, y, width, height);
		setImgPosY(-40);
		
		destroyed = false;
	}
	
	
	public void destroy()
	{
		destroyed = true;
		
		setImgPosY(0);
		this.setImgIcon(new ImageIcon("Planks.png"));
		this.setImgBounds(60, 60);
		this.setLocation(this.getX(), 800);
	}
	
	public boolean isDestroyed()
	{
		return destroyed;
	}
}
