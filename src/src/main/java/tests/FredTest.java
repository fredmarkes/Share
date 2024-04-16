package tests;

import org.junit.Test;

import objects.Fred;
import objects.Person;

import static org.junit.Assert.*;

public class FredTest {
	
	@Test
	public void testGetName() {
        Person fred = new Fred("Fred", 30, 175.0, 75.0);
        assertEquals("Fred", fred.getFirstName());
    }

}
