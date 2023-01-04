import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 * 
 * @author Ben Dai, Leon Li, Eric Han, Phillip Zhang
 * ninja star
 *
 */
public class NinjaStar extends JComponent
{
	
	private int mvtCount;
	private JLabel hsurieken;
	
	public NinjaStar(int x, int y, int w, int h)
	{
		
		setBounds(x, y, w, h);
		hsurieken = new JLabel(new ImageIcon("Ninja Star-1.png"));
		hsurieken.setBounds(0, 0, w, h);
		add(hsurieken);
		mvtCount = 1;
		
	}
	
	public void update(int gameSpeed)
	{
		mvtCount++;
		if (mvtCount == 3)
			mvtCount = 1;
		hsurieken.setIcon(new ImageIcon("Ninja Star-" + mvtCount + ".png"));
		setLocation(getX() + gameSpeed, getY());
	}
	
	public boolean isTouching(Obstacles block)
	{
		
		return getBounds().intersects(block.getBounds());
		
	}
	
}
