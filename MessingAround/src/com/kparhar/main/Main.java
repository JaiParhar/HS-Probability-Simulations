package com.kparhar.main;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Runtime runtime = Runtime.getRuntime();
	    Process proc = runtime.exec("ipconfig -s -t 0");
	    //System.exit(0);
	}

}
