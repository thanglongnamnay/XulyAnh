import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Container extends JPanel {
	ImageContainer imageContainer;
	ToolBar toolbar;
	Container(){
		setLayout(null);
		setPreferredSize(new Dimension(800,600));
	}
	void draw() { 
		imageContainer = new ImageContainer(null);
		imageContainer.setBounds(0, 30, getPreferredSize().width, getPreferredSize().height-30);
		add(imageContainer); 
		toolbar = new ToolBar(imageContainer);
		toolbar.setBounds(0,0,getPreferredSize().width,25);
		setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		add(toolbar);
	}
	public ToolBar getToolbar() {
		return toolbar;
	}
	public ImageContainer getImageContainer() {
		return imageContainer;
	}
}
