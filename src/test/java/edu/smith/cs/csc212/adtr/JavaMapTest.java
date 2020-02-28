package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {

	@Test
	public void testEmpty() {
		MapADT<String, Integer> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
	}
	
	@Test
	public void testPut() {
		MapADT<String, String> candy = new JavaMap<>();
		candy.put("hershey", "chocolate");
		assertEquals(candy.size(), 1);
	}
	
	@Test
	public void testGet() {
		MapADT<String, String> food = new JavaMap<>();
		food.put("burger", "fries");
		assertEquals(food.get("burger"), "fries");
	}
	
	@Test
	public void testSize() {
		MapADT<String, String> jyj = new JavaMap<>();
		jyj.put("jaejoong", "main vocalist");
		jyj.put("junsu", "main dancer");
		jyj.put("yoochun", "main rapper");
		assertEquals(jyj.size(), 3);
	}
	
	@Test
	public void testRemove() {
		MapADT<String, String> boop = new JavaMap<>();
		boop.put("hello", "world");
		assertEquals(boop.remove("hello"), "world");
	}
	
	@Test
	public void testGetKeys() {
		MapADT<String, String> dbsk = new JavaMap<>();
		dbsk.put("jaejoong", "jan 26");
		dbsk.put("yunho", "feb 6");
		dbsk.put("yoochun", "jun 4");
		dbsk.put("junsu", "dec 15");
		dbsk.put("changmin", "feb 18");
		assertEquals(dbsk.getKeys().size(), 5);
	}
	
	@Test
	public void testGetEntries() {
		MapADT<String, Integer> album = new JavaMap<>();
		album.put("mine", 1);
		album.put("one kiss", 2);
		album.put("there's only you", 3);
		album.put("my only comfort", 4);
		album.put("all alone", 5);
		assertEquals(album.getEntries().size(), 5);
	}
	
	@Test
	public void testToJava() {
		MapADT<String, String> classes = new JavaMap<>();
		classes.put("CSC212", "Data Structures");
		classes.put("CSC250", "Theory of Computation");
		classes.toJava();
		assertEquals(classes.getEntries().size(), 2);
	}
}