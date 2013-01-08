package se.folksongs.domain.util.match;

import se.folksongs.domain.Tune;

/**
 * Created 2011-nov-16
 *
 * @author jep
 */
public class Matcher {

    public Matcher() {
    }

    public MatchResult match(Tune t1, Tune t2) {
        int points = 0;
        if (matchByName(t1, t2)) {
            points++;
        }
        if (matchByBeat(t1, t2)) {
            points++;
        }
        if (matchByComposer(t1, t2)) {
            points++;
        }
        if (matchByDistrict(t1, t2)) {
            points++;
        }
        if (matchByRegion(t1, t2)) {
            points++;
        }
        if (matchByType(t1, t2)) {
            points++;
        }
        if (matchByLearnedFrom(t1, t2)) {
            points++;
        }
        return new MatchResult(points, t1, t2);
    }

    public boolean matchByRegion(Tune s1, Tune s2) {
        if (s1.getRegion() == null || s2.getRegion() == null) {
            return false;
        }
        if (s1.getRegion().equals(s2.getRegion())) {
            return true;
        }
        return false;
    }

    public boolean matchByDistrict(Tune s1, Tune s2) {
        if (s1.getDisctrict() == null || s2.getDisctrict() == null) {
            return false;
        }
        if (s1.getDisctrict().equals(s2.getDisctrict())) {
            return true;
        }
        return false;
    }

    public boolean matchByType(Tune s1, Tune s2) {
        if (s1.getType() == null || s2.getType() == null) {
            return false;
        }
        if (s1.getType().equals(s2.getType())) {
            return true;
        }
        return false;
    }

    public boolean matchByBeat(Tune s1, Tune s2) {
        if (s1.getBeat() == null || s2.getBeat() == null) {
            return false;
        }
        if (s1.getBeat().equals(s2.getBeat())) {
            return true;
        }
        return false;
    }

    public boolean matchByComposer(Tune s1, Tune s2) {
        if (s1.getComposer() == null || s2.getComposer() == null) {
            return false;
        }
        if (s1.getComposer().equals(s2.getComposer())) {
            return true;
        }
        return false;
    }

    public boolean matchByLearnedFrom(Tune s1, Tune s2) {
        if (s1.getLearnedFrom() == null || s2.getLearnedFrom() == null) {
            return false;
        }
        if (s1.getLearnedFrom().equals(s2.getLearnedFrom())) {
            return true;
        }
        return false;
    }

    private boolean matchByName(Tune s1, Tune s2) {
        if (s1.getName() == null || s2.getName() == null) {
            return false;
        }
        if (s1.getName().equalsIgnoreCase(s2.getName())) {
            return true;
        }
        return false;
    }
}
