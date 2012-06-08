package se.folksongs.domain;


import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import se.folksongs.domain.util.match.Match;
import se.folksongs.domain.util.match.TuneMatcher;

/**
 *
 * @author jep
 */
public class MatchTester {
    
    Tune one;
    Tune two;
    TuneMatcher tuneMatcher;
    
    public MatchTester() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setup() { 
        one = new Tune();
        two = new Tune();
        tuneMatcher = new TuneMatcher();
    }
    
    @Test
    public void sameSongNameShouldReturnMoreThanZeroPoints() {
        one.setName("polska");
        two.setName("polska");
        int match = tuneMatcher.match(one, two);
        assertEquals(true, match > 0);
    }
    @Test
    public void sameSongBeatShouldReturnMoreTharZeroPoints() {
        one.setBeat(Beat.FOUR_FOURTH);
        two.setBeat(Beat.FOUR_FOURTH);
        int match = tuneMatcher.match(one, two);
        assertEquals(true, match > 0);
    }
    @Test
    public void sameSongDistrictShouldReturnMoreThanZeroPoints() {
        one.setDisctrict(District.Rättvik);
        two.setDisctrict(District.Rättvik);
        int match = tuneMatcher.match(one, one);
        assertEquals(true, match > 0);
    }
    @Test
    public void sameSongComposerShouldReturnMoreThanZeroPoints() {
        FolkMusician folkMusician = new FolkMusician();
        one.setComposer(folkMusician);
        two.setComposer(folkMusician);
        int match = tuneMatcher.match(one, two);
        assertEquals(true, match > 0);
    }
    @Test
    public void sameSongRegionShouldReturnMoreThanZeroPoints() {
        one.setRegion(Region.Dalarna);
        two.setRegion(Region.Dalarna);
        int match = tuneMatcher.match(one, two);
        assertEquals(true, match > 0);
    }
    @Test
    public void sameSongLearnedFromShouldReturnMoreThanZeroPoints() {
        FolkMusician folkMusician = new FolkMusician();
        one.setLearnedFrom(folkMusician);
        two.setLearnedFrom(folkMusician);
        int match = tuneMatcher.match(one, two);
        assertEquals(true, match > 0);
    }
    @Test
    public void sameSongTypeShouldReturnMoreThanZeroPoints() {
        one.setType(Type.Vals);
        two.setType(Type.Vals);
        int match = tuneMatcher.match(one, two);
        assertEquals(true, match > 0);
    }
           
}
