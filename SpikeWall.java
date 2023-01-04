import javax.swing.ImageIcon;

/**
 * 
 * @author Ben Dai, Leon Li, Eric Han, Phillip Zhang
 * spike wall obstacle
 *
 */
public class SpikeWall extends Obstacles
{
	
	public SpikeWall(int x, int y, int width, int height)
	{
		
		super(width, height, new ImageIcon("SpikeWall.png"));
		setBounds(x, y, width, height);
		
	}
	
}
