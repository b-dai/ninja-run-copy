import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
/**
 * 
 * @author Ben Dai, Eric Han. Leon Li Phillip Zhang
 * olay mnusic
 *
 */
public class MusicPlayer extends Thread
{
	
	private boolean hasStopped;
	private String filePath;
	
	public MusicPlayer(String filePath)
	{
		this.filePath = filePath;
		hasStopped = false;
	}
	
	public void stopMusic()
	{
		
		hasStopped = true;
		
	}
	
	public void run()
	{
		
		int BUFFER_SIZE = 4096;
		File audioFile = new File(filePath);
		
        try
        {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            SourceDataLine audioLine = (SourceDataLine) AudioSystem.getLine(info);
            audioLine.open(format);
            audioLine.start();
            byte[] bytesBuffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
            while ((bytesRead = audioStream.read(bytesBuffer)) != -1) {
                audioLine.write(bytesBuffer, 0, bytesRead);
                if (hasStopped)
                {
                	break;
                }
            }
            audioLine.drain();
            audioLine.close();
            audioStream.close();
        }
        catch (UnsupportedAudioFileException e) {}
        catch (LineUnavailableException e) {}
        catch (IOException e) {}
        
	}
	
}