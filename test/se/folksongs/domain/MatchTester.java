package se.folksongs.domain;


import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import se.folksongs.domain.util.match.MatchResult;
import se.folksongs.domain.util.match.Matcher;

/**
 *
 * @author jep
 */
public class MatchTester {
    
    Tune one;
    Tune two;
    Matcher tuneMatcher;
    
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
        tuneMatcher = new Matcher();
    }
    
    @Test
    public void sameSongNameShouldReturnMoreThanZeroPoints() {
        one.setName("polska");
        two.setName("polska");
        MatchResult match = tuneMatcher.match(one, two);
        assertEquals(true, match.getPoints() > 0);
    }
    @Test
    public void sameSongBeatShouldReturnMoreTharZeroPoints() {
        one.setBeat(Beat.FOUR_FOURTH);
        two.setBeat(Beat.FOUR_FOURTH);
        MatchResult match = tuneMatcher.match(one, two);
        assertEquals(true, match.getPoints() > 0);
    }
    @Test
    public void sameSongDistrictShouldReturnMoreThanZeroPoints() {
        one.setDisctrict(District.Rättvik);
        two.setDisctrict(District.Rättvik);
        MatchResult match = tuneMatcher.match(one, one);
        assertEquals(true, match.getPoints() > 0);
    }
    @Test
    public void sameSongComposerShouldReturnMoreThanZeroPoints() {
        FolkMusician folkMusician = new FolkMusician("Klint-Olle");
        one.setComposer(folkMusician);
        two.setComposer(folkMusician);
        MatchResult match = tuneMatcher.match(one, two);
        assertEquals(true, match.getPoints() > 0);
    }
    @Test
    public void sameSongRegionShouldReturnMoreThanZeroPoints() {
        one.setRegion(Region.Dalarna);
        two.setRegion(Region.Dalarna);
        MatchResult match = tuneMatcher.match(one, two);
        assertEquals(true, match.getPoints() > 0);
    }
    @Test
    public void sameSongLearnedFromShouldReturnMoreThanZeroPoints() {
        FolkMusician folkMusician = new FolkMusician("Klint-Olle");
        one.setLearnedFrom(folkMusician);
        two.setLearnedFrom(folkMusician);
        MatchResult match = tuneMatcher.match(one, two);
        assertEquals(true, match.getPoints() > 0);
    }
    @Test
    public void sameSongTypeShouldReturnMoreThanZeroPoints() {
        one.setType(Type.Vals);
        two.setType(Type.Vals);
        MatchResult match = tuneMatcher.match(one, two);
        assertEquals(true, match.getPoints() > 0);
    }
           
}
