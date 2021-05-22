package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ControllerOrder;
import contract.IModel;

public class ViewTest {
	
	private IModel model;
	private View view;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKeyCodeToControllerOrder() {
		ControllerOrder expected = ControllerOrder.Top;
		Assert.assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_UP));
		expected = ControllerOrder.Bottom;
		Assert.assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_DOWN));
		expected = ControllerOrder.Left;
		Assert.assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_LEFT));
		expected = ControllerOrder.Right;
		Assert.assertEquals(expected, View.keyCodeToControllerOrder(KeyEvent.VK_RIGHT));
	}

}
