package com.rkouchoo.main;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class Main {

	private static JSch javaSSH;
	private static Session session;
	
	public static void main(String[] args) {	
		
		javaSSH = new JSch(); // create and configure ssh library
		try {
			session = javaSSH.getSession(Constants.SSH_LOGIN_CRED, Constants.CONN_IP_ADDR, Constants.SSH_PORT);
			session.setPassword(Constants.SSH_LOGIN_CRED);
			session.setConfig("StrictHostKeyChecking", "no");
		} catch (JSchException e) { // grab the error
			e.printStackTrace(); // send exception to the console, will be a strange error if this fails
		}
	
		// Prepare and load the latest json file which was written.		
		
		System.out.println("File Chooser running");
		FileChooser.createAndShowGUI();
		
		
		
		
	}

}
