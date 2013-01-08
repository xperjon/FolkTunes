
package se.folksongs.control;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import se.folksongs.db.DataStore;
import se.folksongs.db.TempDataStore;
import se.folksongs.domain.Tune;
import se.folksongs.domain.util.match.MatchResult;
import se.folksongs.domain.util.match.Matcher;

/**
 * Created 2012-jun-21
 * @author jep
 */
public class Controler {

    private final DataStore dataStore;

    public Controler(DataStore dataStore) {
        this.dataStore = dataStore;
    }
    
    public List<MatchResult> makeMatchList() {
        Collection<Tune> ownTunes = dataStore.getOwnTunes();
        Collection<Tune> othersTunes = dataStore.getOthersTunes();
        List<MatchResult> result = new ArrayList<MatchResult>();
        Matcher matcher = new Matcher();
        for (Tune owntune : ownTunes) {
            for (Tune othertune : othersTunes) {
                result.add(matcher.match(owntune, othertune));
            }
        }
        Collections.sort(result);
        return result;
        /*
         * TODO
         * 1. Hämta egna låtar 
         * 2. Hämta andras låtar
         * 3. Skapa lista av MatchResult 
         * 4. Använd Collections.sort() för att sortera listan efter matchningsgrad
         */
    }

}
