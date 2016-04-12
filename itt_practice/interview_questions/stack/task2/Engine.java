package com.ampleample.task2;

public interface Engine {

	public static final String stani = "sss";
	
	public String getBrand();
	
	public void start();
	
	public void stop();
	
	public void run() throws OutOfFuelException;
	
}
