/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import project2testing.FormHiburanRekreasi;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bayu Pratama
 */
public class testing {
    
    public testing() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testForm(){
        FormHiburanRekreasi test = new FormHiburanRekreasi();
        double jumlahtiket = 2;
        double hargatiket = 35000;
        double total = test.hitung(jumlahtiket, hargatiket);
        double total2 = test.hitung(10, 35000);
        double expected = 70000.0;
        assertEquals(expected, total, 0.0);
        assertEquals(350000, total2, 0.0);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
