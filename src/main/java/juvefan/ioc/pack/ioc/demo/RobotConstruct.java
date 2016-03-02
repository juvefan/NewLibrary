package juvefan.ioc.pack.ioc.demo;

import juvefan.ioc.pack.impl.hp.HPHands;
import juvefan.ioc.pack.impl.hp.HPLegs;
import juvefan.ioc.pack.impl.vadofone.VadofoneHead;

public class RobotConstruct {

	public static void main(String[] args) {
		
		HPHands hand = new HPHands();
		VadofoneHead head = new VadofoneHead();
		HPLegs legs = new HPLegs();
		

		Robot robot = new Robot(hand, head, legs);
		robot.build();
	}

}
