import javax.swing.ImageIcon;

/**
 * 
 * @author Ben Dai, Leon Li, Eric Han, Phillip Zhang
 * chained spike ball obstacle
 *
 */
public class CeilingSpikeBall extends Obstacles
{ 
	public CeilingSpikeBall(int x, int y, int width, int height)
	{
		
		super(width, height, new ImageIcon("Spike Ball.png"));
		setBounds(x, y, width, height);
		
	}
}
