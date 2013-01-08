
package se.folksongs.db;

import java.util.ArrayList;
import java.util.Collection;
import se.folksongs.domain.Beat;
import se.folksongs.domain.District;
import se.folksongs.domain.Region;
import se.folksongs.domain.Tune;
import se.folksongs.domain.Type;

/**
 * Created 2012-jun-21
 * @author jep
 */
public class TempDataStore implements DataStore{
    
    public final static Collection<Tune> ownTunes = new ArrayList<Tune>();
    public final static Collection<Tune> othersTunes = new ArrayList<Tune>();
    
    static {
        ownTunes.add(new Tune("Polska från Delsbo", Type.Polska, Region.Hälsingland, Beat.THRE_FOURTH, null, null, District.Delsbo));
        ownTunes.add(new Tune("Polska ef Klint-Olle", Type.Polska, Region.Hälsingland, Beat.THRE_FOURTH, null, null, District.Delsbo));
        ownTunes.add(new Tune("Delsbovalsen ", Type.Vals, Region.Hälsingland, Beat.THRE_FOURTH, null, null, District.Delsbo));
        othersTunes.add(new Tune("Gånglåt", Type.Gånglåt, Region.Dalarna, Beat.TWO_FOURTH, null, null, District.Rättvik));
        othersTunes.add(new Tune("Polska", Type.Polska, Region.Dalarna, Beat.THRE_FOURTH, null, null, District.Boda));
        othersTunes.add(new Tune("Vals ", Type.Vals, Region.Hälsingland, Beat.THRE_FOURTH, null, null, District.Delsbo));
    }

    @Override
    public Collection<Tune> getOwnTunes() {
        return ownTunes;
    }

    @Override
    public Collection<Tune> getOthersTunes() {
        return othersTunes;
    }

}
