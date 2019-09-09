package com.rkouchoo.main;

public class Constants {
	
	public static final String CONN_IP_ADDR = "192.168.1.5"; // The local IP for the server
	public static final String SSH_LOGIN_CRED = "root"; // User and pass is root since its contained to DMZ and not avaliable to the internet
	public static final int SSH_PORT = 22; // Port that is used to connect to the SSH server
	
	public static final String REMOTE_SCRIPT_LOCATION = "//etc//samba//share//scripts//";
	public static final String REMOTE_DOWNLOAD_SCRIPT_NAME = "download_scheduler.py";

}
