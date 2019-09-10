package com.rkouchoo.main;

public class CommandSchedulerFilter {

	@SuppressWarnings("unused")
	private enum COMMAND_SUBTYPES {
		YAML,
		S,
		D,
		L
	}
	
	// Small state machine that is beign used
	public enum EXEC_STATUS {
		RUNNNING,
		STOPPED,
		STOPPING
	}
	
	public static void pushCommandToThread(String command) {
		
	}
	
	public static void inspectYAMLFile(String filePath) {
		
	}
	
	public void startExternalCommandThread() {
		
	}
	
	public void stopExternalCommandThread() {
		
	}
	
	public String getExternalCommandThreadStatus() {
		return null;
	}
	
}
