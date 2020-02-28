package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	
	@Test
	public void testInsert() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("a");
		abc.insert("b");
		abc.insert("c");
		assertEquals(abc.size(), 3);
	}
	
	@Test
	public void testInsertRepeated( ) {
		SetADT<String> a = new JavaSet<>();
		a.insert("a");
		a.insert("a");
		a.insert("a");
		assertEquals(a.size(), 1);
	}
	
	@Test
	public void testContains() {
		SetADT<String> animals = new JavaSet<>();
		animals.insert("dog");
		assertTrue(animals.contains("dog"));
	}
	
	@Test
	public void testRemove() {
		SetADT<String> animals = new JavaSet<>();
		animals.insert("dog");
		animals.insert("toaster");
		animals.remove("toaster");
		assertFalse(animals.contains("toaster"));
	}
	
	@Test
	public void testToList() {
		SetADT<String> sup = new JavaSet<>();
		sup.insert("hello");
		sup.toList();
		assertEquals(sup.size(), 1);
	}
	
	@Test
	public void testToJava() {
		SetADT<String> noice = new JavaSet<>();
		noice.toJava();
		assertEquals(noice.size(), 0);
	}
}
