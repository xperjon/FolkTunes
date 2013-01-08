package se.folksongs.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import se.folksongs.control.Controler;
import se.folksongs.db.DataStore;
import se.folksongs.db.TempDataStore;
import se.folksongs.domain.util.match.MatchResult;
import static org.mockito.Mockito.*;
/**
 *
 * @author jep
 */
public class ControllerTest {
    
    public ControllerTest() {
    }
    
    @Test
    public void test() {
        DataStore mockedDataStore = mock(DataStore.class);
        when(mockedDataStore.getOwnTunes()).thenReturn(createJEPTunes());
        when(mockedDataStore.getOthersTunes()).thenReturn(createPETunes());
        Controler controler = new Controler(mockedDataStore);
        List<MatchResult> makeMatchList = controler.makeMatchList();
        int count = 0;
        for (MatchResult matchResult : makeMatchList) {
            System.out.println(""+matchResult);
            if(matchResult.getPoints() > 0) {
                count++;
            }
        }
        assertEquals(true, count == 1);
        
    }
    
    private List<Tune> createJEPTunes() {
        ArrayList<Tune> myTunes = new ArrayList<Tune>();
        Tune pellikValsen = new Tune();
        pellikValsen.setBeat(Beat.THRE_FOURTH);
        pellikValsen.setName("Pellikvalsen");
        pellikValsen.setRegion(Region.Dalarna);
        pellikValsen.setLearnedFrom(new FolkMusician("Kalle Almlöv"));
        pellikValsen.setType(Type.Vals);
        
        myTunes.add(pellikValsen);
        
        Tune ganglatFranSkog = new Tune();
        ganglatFranSkog.setBeat(Beat.TWO_FOURTH);
        ganglatFranSkog.setName("Gånglåt från Skog");
        ganglatFranSkog.setRegion(Region.Hälsingland);
        ganglatFranSkog.setLearnedFrom(new FolkMusician("Buffalo"));
        ganglatFranSkog.setType(Type.Gånglåt);
        
        myTunes.add(ganglatFranSkog);
        
        return myTunes;
    }
    
    private List<Tune> createPETunes() {
        ArrayList<Tune> myTunes = new ArrayList<Tune>();
        Tune pellikValsen = new Tune();
        pellikValsen.setBeat(Beat.THRE_FOURTH);
        pellikValsen.setName("Pellikvalsen");
        pellikValsen.setRegion(Region.Dalarna);
        pellikValsen.setLearnedFrom(new FolkMusician("Kalle Almlöv"));
        pellikValsen.setType(Type.Vals);
        
        myTunes.add(pellikValsen);
        
        return myTunes;
    }

}
