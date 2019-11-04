package com.rkouchoo.main;

import javax.swing.JFileChooser;

public class MultiChooser {

	JFileChooser chooser;	
	
	String folderPath;
	Boolean chosen = true;
	
	void createFolderChooser() {
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new java.io.File("."));
		chooser.setDialogTitle("Choose a folder to save cache");
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setAcceptAllFileFilterUsed(false);
		
		int returnValue = chooser.showOpenDialog(null);

	    if (returnValue == JFileChooser.APPROVE_OPTION) {
	    	setFolderPath(chooser.getSelectedFile().toString());
	    } else {
	    	chosen = false;
	    }
	}
	
	public String getFolderPath() {
		return folderPath;
	}

	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}
	
	public boolean getChosenStatus() {
		return chosen;
	}
	
	
}
