package juvefan.ioc.pack.ioc.demo;

import juvefan.ioc.pack.interfaces.Hand;
import juvefan.ioc.pack.interfaces.Head;
import juvefan.ioc.pack.interfaces.Legs;

public class Robot  {
	
	Hand hand;
	Head head;
	Legs legs;
	
	public Robot(Hand hand, Head head, Legs legs) {
		super();
		this.hand = hand;
		this.head = head;
		this.legs = legs;
	}
	
	public void build(){
		hand.wave();
		legs.step();
		head.think();
	}
	
	
	
}
