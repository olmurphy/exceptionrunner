package edu.baylor.ecs.si;

public class Main {

	public static void main(String[] args) {
		
		try {
			Timer.timeMe(-1);
		} catch (TimerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
