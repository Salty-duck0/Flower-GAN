package main;
import JAVA.Project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.util.Random;

public class Panel extends JPanel {
	private BufferedImage backGround;
	private BufferedImage image1;
	private BufferedImage image2;
	private BufferedImage image3;
	private BufferedImage image4;
	private BufferedImage image5;
	private BufferedImage image6;
	private BufferedImage image7;
	private BufferedImage image8;
	private BufferedImage image9;
	private BufferedImage image10;
	private BufferedImage image11;
	private BufferedImage image12;
	private BufferedImage gen1;
	private BufferedImage gen2;
	private BufferedImage gen3;
	private BufferedImage gen4;
	private BufferedImage gen5;
	private BufferedImage gen6;
	private BufferedImage gen7;
	private BufferedImage gen8;
	private BufferedImage gen9;
	private BufferedImage gen10;
	private BufferedImage gen11;
	private BufferedImage gen12;
	static final int screenHeight = 768;
	static final int screenWidth =1366;
	static int border_x = 10;
	static int border_y = 10;
	
	public Panel(sidePanel d) {
		importBG();
		importf1();
		importf2();
		importf3();
		importf4();
		importf5();
		importf6();
		importf7();
		importf8();
		importf9();
		importf10();
		importf11();
		importf12();
		importg1();
		importg2();
		importg3();
		importg4();
		importg5();
		importg6();
		importg7();
		importg8();
		importg9();
		importg10();
		importg11();
		importg12();
		setPanelSize();
		setLayout(null);
		setComponentsParameter(d);
		addComponents(d);

		
	}
	
	private void importg1() {
		File f = new File("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\TEST1.png"); // TO be decided later
		try {
			gen1 = makeRoundedCorner(ImageIO.read(f),50);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void importg2() {
		File f = new File("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\TEST2.png"); // TO be decided later
		try {
			gen2 = makeRoundedCorner(ImageIO.read(f),50);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void importg3() {
		File f = new File("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\TEST3.png"); // TO be decided later
		try {
			gen3 = makeRoundedCorner(ImageIO.read(f),50);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void importg4() {
		File f = new File("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\TEST4.png"); // TO be decided later
		try {
			gen4 = makeRoundedCorner(ImageIO.read(f),50);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void importg5() {
		File f = new File("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\TEST5.png"); // TO be decided later
		try {
			gen5 = makeRoundedCorner(ImageIO.read(f),50);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void importg6() {
		File f = new File("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\TEST6.png"); // TO be decided later
		try {
			gen6 = makeRoundedCorner(ImageIO.read(f),50);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void importg7() {
		File f = new File("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\TEST7.png"); // TO be decided later
		try {
			gen7 = makeRoundedCorner(ImageIO.read(f),50);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void importg8() {
		File f = new File("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\TEST8.png"); // TO be decided later
		try {
			gen8 = makeRoundedCorner(ImageIO.read(f),50);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void importg9() {
		File f = new File("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\TEST9.png"); // TO be decided later
		try {
			gen9 = makeRoundedCorner(ImageIO.read(f),50);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void importg10() {
		File f = new File("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\TEST10.png"); // TO be decided later
		try {
			gen10 = makeRoundedCorner(ImageIO.read(f),50);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void importg11() {
		File f = new File("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\TEST11.png"); // TO be decided later
		try {
			gen11 = makeRoundedCorner(ImageIO.read(f),50);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void importg12() {
		File f = new File("C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\TEST12.png"); // TO be decided later
		try {
			gen12 = makeRoundedCorner(ImageIO.read(f),50);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void addComponents(sidePanel d) {
		add(d);

	}
	private void setComponentsParameter(sidePanel d) {
		d.setBounds(border_x, border_y,screenWidth/3-border_x, screenHeight-(2*border_y));
		
	}
	private void setPanelSize() {
		Dimension size = new Dimension(screenWidth,screenHeight);
		setPreferredSize(size);
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(backGround,0,0,screenWidth,screenHeight,null);
		g.setColor(new Color(0,0,0,130));
        g.fillRoundRect(screenWidth/3+10,10,screenWidth*2/3-30,screenHeight -20, 30, 30);
        if(sidePanel.random) {
        	g.drawImage(gen1,screenWidth/3+20,80,200,200,null);
            g.drawImage(gen2,screenWidth/3+240,80,200,200,null);
            g.drawImage(gen3,screenWidth/3+460,80,200,200,null);
            g.drawImage(gen4,screenWidth/3+680,80,200,200,null);
            g.drawImage(gen5,screenWidth/3+20,300,200,200,null);
            g.drawImage(gen6,screenWidth/3+240,300,200,200,null);
            g.drawImage(gen7,screenWidth/3+460,300,200,200,null);
            g.drawImage(gen8,screenWidth/3+680,300,200,200,null);
            g.drawImage(gen9,screenWidth/3+20,520,200,200,null);
            g.drawImage(gen10,screenWidth/3+240,520,200,200,null);
            g.drawImage(gen11,screenWidth/3+460,520,200,200,null);
            g.drawImage(gen12,screenWidth/3+680,520,200,200,null);
            importg1();
    		importg2();
    		importg3();
    		importg4();
    		importg5();
    		importg6();
    		importg7();
    		importg8();
    		importg9();
    		importg10();
    		importg11();
    		importg12();
        }
        if(sidePanel.best) {
        	g.drawImage(image1,screenWidth/3+20,80,200,200,null);
            g.drawImage(image2,screenWidth/3+240,80,200,200,null);
            g.drawImage(image3,screenWidth/3+460,80,200,200,null);
            g.drawImage(image4,screenWidth/3+680,80,200,200,null);
            g.drawImage(image5,screenWidth/3+20,300,200,200,null);
            g.drawImage(image6,screenWidth/3+240,300,200,200,null);
            g.drawImage(image7,screenWidth/3+460,300,200,200,null);
            g.drawImage(image8,screenWidth/3+680,300,200,200,null);
            g.drawImage(image9,screenWidth/3+20,520,200,200,null);
            g.drawImage(image10,screenWidth/3+240,520,200,200,null);
            g.drawImage(image11,screenWidth/3+460,520,200,200,null);
            g.drawImage(image12,screenWidth/3+680,520,200,200,null);
        }
        repaint();

	}
	private void importBG() {
		InputStream is = getClass().getResourceAsStream("/flower.jpg"); // TO be decided later
		try {
			backGround = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void importf1() {
		InputStream is = getClass().getResourceAsStream("/f1.png"); // TO be decided later
		try {
			image1 = makeRoundedCorner(ImageIO.read(is),400);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void importf2() {
		InputStream is = getClass().getResourceAsStream("/f2.png"); // TO be decided later
		try {
			image2 = makeRoundedCorner(ImageIO.read(is),400);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void importf3() {
		InputStream is = getClass().getResourceAsStream("/f3.png"); // TO be decided later
		try {
			image3 = makeRoundedCorner(ImageIO.read(is),400);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void importf4() {
		InputStream is = getClass().getResourceAsStream("/f4.png"); // TO be decided later
		try {
			image4 = makeRoundedCorner(ImageIO.read(is),100);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void importf5() {
		InputStream is = getClass().getResourceAsStream("/f5.png"); // TO be decided later
		try {
			image5 = makeRoundedCorner(ImageIO.read(is),100);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void importf6() {
		InputStream is = getClass().getResourceAsStream("/f6.png"); // TO be decided later
		try {
			image6 = makeRoundedCorner(ImageIO.read(is),100);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void importf7() {
		InputStream is = getClass().getResourceAsStream("/f7.png"); // TO be decided later
		try {
			image7 = makeRoundedCorner(ImageIO.read(is),170);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void importf8() {
		InputStream is = getClass().getResourceAsStream("/f8.png"); // TO be decided later
		try {
			image8 = makeRoundedCorner(ImageIO.read(is),230);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void importf9() {
		InputStream is = getClass().getResourceAsStream("/f9.png"); // TO be decided later
		try {
			image9 = makeRoundedCorner(ImageIO.read(is),120);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void importf10() {
		InputStream is = getClass().getResourceAsStream("/f10.png"); // TO be decided later
		try {
			image10 = makeRoundedCorner(ImageIO.read(is),120);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void importf11() {
		InputStream is = getClass().getResourceAsStream("/f11.png"); // TO be decided later
		try {
			image11 = makeRoundedCorner(ImageIO.read(is),120);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void importf12() {
		InputStream is = getClass().getResourceAsStream("/f12.png"); // TO be decided later
		try {
			image12 = makeRoundedCorner(ImageIO.read(is),120);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static BufferedImage makeRoundedCorner(BufferedImage image, int cornerRadius) {
	    int w = image.getWidth();
	    int h = image.getHeight();
	    BufferedImage output = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

	    Graphics2D g2 = output.createGraphics();

	    g2.setComposite(AlphaComposite.Src);
	    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	    g2.setColor(Color.WHITE);
	    g2.fill(new RoundRectangle2D.Float(0, 0, w, h, cornerRadius, cornerRadius));

	    g2.setComposite(AlphaComposite.SrcAtop);
	    g2.drawImage(image, 0, 0, null);
	    
	    g2.dispose();
	    
	    return output;
	}
	

	
}
