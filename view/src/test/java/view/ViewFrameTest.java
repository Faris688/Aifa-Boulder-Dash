package view;

import static org.junit.Assert.*;

import java.awt.GraphicsConfiguration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;
import model.Model;

public class ViewFrameTest {
	
	private ViewFrame viewFrame;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		IModel model = new Model();
		this.viewFrame = new ViewFrame(model);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
	}

}
