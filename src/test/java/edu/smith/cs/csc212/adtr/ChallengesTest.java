package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class ChallengesTest {
	
	boolean areSetsEqual(SetADT<Integer> lhs, SetADT<Integer> rhs) {
		if (lhs.size() != rhs.size()) { 
			return false; 
		}
		for (int item : lhs.toList()) {
		  if (!rhs.contains(item)) { 
			return false; 
		  }
		}
		return true;
	}
	
	@Test
	public void testUnion() {
		SetADT<Integer> one = new JavaSet<>();
		one.insert(1);
		SetADT<Integer> two = new JavaSet<>();
		two.insert(2);
		SetADT<Integer> three = new JavaSet<>();
		three.insert(1);
		three.insert(2);
		areSetsEqual(Challenges.union(one, two), three);
	}
	
	@Test
	public void testIntersection() {
		SetADT<Integer> one = new JavaSet<>();
		one.insert(1);
		one.insert(12);
		SetADT<Integer> two = new JavaSet<>();
		two.insert(2);
		two.insert(12);
		SetADT<Integer> twelve = new JavaSet<>();
		twelve.insert(12);
		areSetsEqual(Challenges.intersection(one, two), twelve);
	}
	
}
