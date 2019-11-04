package com.rkouchoo.main;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")

/**
 * DEPRICATED
 * @author no
 *
 */
public class FolderChooser extends JPanel implements ActionListener {
	JButton go;

	JFileChooser chooser;
	String choosertitle;

	public String destFolder = "";

	public FolderChooser() {
		go = new JButton("Choose");
		go.addActionListener(this);
		add(go);
	}

	public void actionPerformed(ActionEvent e) {
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setDialogTitle(choosertitle);
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setAcceptAllFileFilterUsed(false);

		if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			setSelectedDir(chooser.getSelectedFile().toString());
		} else {
			System.out.println("No Selection ");
		}
	}

	public Dimension getPreferredSize() {
		return new Dimension(50, 90);
	}

	public synchronized void createAndChooseFolder() {
		JFrame frame = new JFrame("");
		FolderChooser panel = new FolderChooser();
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("Exited chooser window");
				System.out.println(getSelectedDir());
			}
		});	
		
		frame.getContentPane().add(panel, "Center");
		frame.setSize(panel.getPreferredSize());
		frame.setVisible(true);
		
		System.out.println("Test dest: " + destFolder);
	}
	
	/**
	 * @return the chosen one
	 */
	public String getSelectedDir() {
		return destFolder;
	}
	
	private synchronized void setSelectedDir(String dir) {
		if (dir == null) {
			System.out.println("!");
		}
		destFolder = dir;
	}
	
}