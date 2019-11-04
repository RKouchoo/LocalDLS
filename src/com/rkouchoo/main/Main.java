package com.rkouchoo.main;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class Main {

	private static JSch javaSSH;
	private static Session session;
	private static MultiChooser chooser;
	
	public static void main(String[] args) {	
		
		//javaSSH = new JSch(); // create and configure ssh library
		javaSSH = null;
		
		try {
			session = javaSSH.getSession(Constants.SSH_LOGIN_CRED, Constants.CONN_IP_ADDR, Constants.SSH_PORT);
			session.setPassword(Constants.SSH_LOGIN_CRED);
			session.setConfig("StrictHostKeyChecking", "no");
		} catch (Exception e) { // grab the error
			//e.printStackTrace(); // send exception to the console, will be a strange error if this fails
		
			// Handle E later with crash log on server DDK
		}
	
		// Prepare and load the latest json file which was written.		
		
		System.out.println("File Chooser running");
		
		//FileChooser.createAndShowGUI();
		
		chooser = new MultiChooser();
		chooser.createFolderChooser();
		
		System.out.println("Chosen folder: " + chooser.getFolderPath());
	}

}
