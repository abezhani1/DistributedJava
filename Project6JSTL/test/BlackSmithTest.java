package model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackSmithTest {
    private BlackSmithTest expert;
    
    public BlackSmithTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        expert = new BlackSmith();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetWtypesSwords() {
        List advice = expert.getWtypes("Swords");
        
        String expected = "Straight Sword";
        assertEquals(expected, advice.get(0).toString());
        expected = "Katana";
        assertEquals(expected, advice.get(1).toString());
        expected = "Scimitar";
        assertEquals(expected, advice.get(2).toString());
    }
}
