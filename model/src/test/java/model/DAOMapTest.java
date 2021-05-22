package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DAOMapTest {

	private DAOMap daoMap;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.daoMap = new DAOMap(DBConnection.getInstance().getConnection());
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testfind() {
		Map test = this.daoMap.find(2);
		Assert.assertEquals(22, test.getHeight());
		Assert.assertEquals(40, test.getWidth());
	}

}
