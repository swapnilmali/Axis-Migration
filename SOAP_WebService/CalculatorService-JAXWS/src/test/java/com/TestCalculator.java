package com;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCalculator {
   Calculator cal=new Calculator();
	@Test
	public void tadd() {
	assertEquals(15,cal.add(7, 8));
	}
	@Test
	public void tsub() {
	assertEquals(37,cal.sub(50, 13));
	}
	@Test
	public void tmul() {
	assertEquals(40,cal.mul(20, 2));
	}
	@Test
	public void tdiv() {
	assertEquals(40,cal.div(80, 0));
	}
}
