import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 * 
 * @author Ben Dai, Leon Li, Eric Han, Phillip Zhang
 * main player ninja v2
 *
 */
public class PlayerNinja extends JComponent
{
	
	private int currRunSprite;
	private JLabel showSprite;
	private ArrayList<ImageIcon> runSprites;
	private ImageIcon jumpSprite;
	private ImageIcon slideSprite;
	private ImageIcon deadSprite;
	
	private String currAction; //"Run", "Jump", "Slide", "Dead"
	
	public PlayerNinja(int x, int y, int width, int height)
	{
		
		currAction = "Run";
		
		setLocation(x, y);
		setSize(width, height);
		runSprites = new ArrayList<ImageIcon>();
		for (int i = 1; i <= 6; i++)
		{
			runSprites.add(new ImageIcon("Run " + i + ".png"));
		}
		currRunSprite = 0;
		showSprite = new JLabel(runSprites.get(currRunSprite));
		showSprite.setBounds(0, 0, width, height);
		add(showSprite);
		
		jumpSprite = new ImageIcon("Jump.png");
		slideSprite = new ImageIcon("Slide.png");
		deadSprite = new ImageIcon("DeadPlayer.png");
		
	}
	
	public void update()
	{
		if (currAction.equals("Run"))
		{
			showSprite.setLocation(0, 0);
			currRunSprite++;
			if (currRunSprite == 6)
			{
			currRunSprite = 0;
			}
			showSprite.setIcon(runSprites.get(currRunSprite));
		}
		else if (currAction.equals("Jump"))
		{
			showSprite.setLocation(0, 0);
			showSprite.setIcon(jumpSprite);
		}
		else if (currAction.equals("Slide"))
		{
			showSprite.setLocation(0, 0);
			showSprite.setIcon(slideSprite);
		}
		else if (currAction.equals("Dead"))
		{
			showSprite.setLocation(0, 15);
			showSprite.setIcon(deadSprite);
		}
		repaint();
	}
	
	public void setAction(String action)
	{
		currAction = action;
	}
	
	public void setY(int y)
	{
		setLocation(getX(), y);
	}
	
	public boolean isTouching(Obstacles block)
	{
		
		if (!currAction.equals("Slide")) //check hit reg while NOT sliding
		{
			return getBounds().intersects(block.getBounds());
		}
		else //check hit reg while sliding
		{
			Rectangle bounds = new Rectangle(getX(), getY() + getHeight() / 3 * 2, getWidth(), getHeight() / 3);
			return bounds.intersects(block.getBounds());
		}
		
	}
	
}
