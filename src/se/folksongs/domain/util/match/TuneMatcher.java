package se.folksongs.domain.util.match;

import java.util.Set;
import se.folksongs.domain.Tune;

/**
 * Created 2011-nov-16
 * @author jep
 */
public class TuneMatcher {
    
    public final int MAX_POINTS = 5;
    private Set<Tune> tunes;

    public TuneMatcher(Set<Tune> tunes) {
        this.tunes = tunes;
    }
    
    public boolean matchByRegion(Tune s1, Tune s2) {
        if(s1.getRegion().equals(s1.getRegion())) {
            return true;
        }
        return false;
    }
    public boolean matchByDistrict(Tune s1, Tune s2) {
        if(s1.getDisctrict().equals(s2.getDisctrict())) {
            return  true;
        }
        return false;
    }
    public boolean matchByType(Tune s1, Tune s2) {
        if(s1.getType().equals(s2.getType())) {
            return true;
        }
        return false;
    }
    public boolean matchByBeat(Tune s1, Tune s2) {
        if(s1.getBeat().equals(s2.getBeat())) {
            return true;
        }
        return false;
    }
    public boolean matchByComposer(Tune s1, Tune s2) {
        if(s1.getComposer().equals(s2.getComposer())) {
            return true;
        }
        return false;
    }
    public boolean matchByLearnedFrom(Tune t1, Tune t2) {
        if(t1.getLearnedFrom().equals(t2.getLearnedFrom())) {
            return true;
        }
        return false;
    }
    public int match(Tune s1, Tune s2) {
        int points = 0;
        if(matchByBeat(s1, s2)) {
            points++;
        }
        if(matchByComposer(s1, s2)) {
            points++;
        }
        if(matchByDistrict(s1, s2)) {
            points++;
        }
        if(matchByRegion(s1, s2)) {
            points++;
        }
        if(matchByType(s1, s2)) {
            points++;
        }
        if(matchByLearnedFrom(s1, s2)) {
            points++;
        }
        return points;
    }
    public void process() {
        
    }
    
}
