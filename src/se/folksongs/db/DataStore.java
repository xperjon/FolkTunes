package se.folksongs.db;

import java.util.Collection;
import se.folksongs.domain.Tune;

/**
 *
 * @author jep
 */
public interface DataStore {

    Collection<Tune> getOwnTunes();
    Collection<Tune> getOthersTunes();
    
}
