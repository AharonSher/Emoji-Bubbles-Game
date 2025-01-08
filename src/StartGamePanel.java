import javax.swing.*;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help.Layout;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

public class StartGamePanel extends JPanel implements MouseListener{
    private Image backgroundImage;
    private String imagePath;
    private JLabel startGameLbl;

    // Constructor
    public StartGamePanel() {
        try {
           
        	// Load the image from the file
        	imagePath = "images/openingScreen.png";
        	
            backgroundImage = ImageIO.read(new File(imagePath));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        startGameLbl = new JLabel(new ImageIcon("images/startGameIcon.png"));
        startGameLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				EmojiBubblesApp.getMainObject().getMainPanel().removeAll();
				EmojiBubblesApp.getMainObject().getMainPanel().add(new CreatePlayersPanel());
				
				EmojiBubblesApp.getMainObject().getMainPanel().validate();
			}
			
		});
        this.add(startGameLbl);
        
        
    }

    // Override paintComponent to draw the background image
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Always call super to ensure proper rendering

        // Draw the image as the background
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}