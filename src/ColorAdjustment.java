import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;

public class ColorAdjustment extends JFrame {

	private JPanel contentPane;
	private JTextField hueFigure;
	private JTextField satFigure;
	JButton okButton = new JButton("OK");
	JButton cancelButton = new JButton("Cancel");
	JSlider hueSlider = new JSlider();
	JSlider satSlicer = new JSlider();
	Font tahoma14 = new Font("Tahoma", Font.PLAIN, 14);
	{
		hueFigure = new JTextField("50");
		satFigure = new JTextField("50");
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorAdjustment frame = new ColorAdjustment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ColorAdjustment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Change hue and saturation");
		setBounds(100, 100, 350, 180);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 20));
		
		final JLabel lblNewLabel = new JLabel("Hue");
		lblNewLabel.setFont(tahoma14);
		contentPane.add(lblNewLabel);
		
		hueSlider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hueSlider.setFont(tahoma14);
		contentPane.add(hueSlider);
		hueSlider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				hueFigure.setText(Integer.toString(hueSlider.getValue()));
			}
		});
		
		hueFigure.setFont(tahoma14);
		contentPane.add(hueFigure);
		hueFigure.setColumns(3);
		
		final JLabel lblNewLabel_2 = new JLabel("Saturation");
		lblNewLabel_2.setFont(tahoma14);
		contentPane.add(lblNewLabel_2);
		
		satSlicer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		satSlicer.setFont(tahoma14);
		contentPane.add(satSlicer);
		satSlicer.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent arg0) {
				// TODO Auto-generated method stub
				satFigure.setText(Integer.toString(satSlicer.getValue()));
			}
		});
		
		satFigure.setFont(tahoma14);
		contentPane.add(satFigure);
		satFigure.setColumns(3);
		
		okButton.setIconTextGap(5);
		okButton.setFocusPainted(false);
		contentPane.add(okButton);
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		
		cancelButton.setIconTextGap(5);
		cancelButton.setFocusPainted(false);
		contentPane.add(cancelButton);
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
	}
	void showWindow() {
		this.setVisible(true);
	}

}
