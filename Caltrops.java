import javax.swing.ImageIcon;

/**
 * 
 * @author Ben Dai, Leon Li, Eric Han, Phillip Zhang
 * caltrops obstacle 
 *
 */
public class Caltrops extends Obstacles
{
	public Caltrops(int x, int y, int width, int height)
	{
		
		super(width, height, new ImageIcon("Caltrops.png"));
		setBounds(x, y, width, height);
		
	}
}
