package se.folksongs.domain.util.match;

import se.folksongs.domain.Tune;

/**
 * Created 2011-nov-16
 *
 * @author jep
 */
public class MatchResult implements Comparable<MatchResult> {

    private int points;
    private Tune t1;
    private Tune t2;

    MatchResult(int points) {
        this.points = points;
    }

    public MatchResult(int points, Tune t1, Tune t2) {
        this.points = points;
        this.t1 = t1;
        this.t2 = t2;
    }
    

    public int getPoints() {
        return points;
    }

    @Override
    public int compareTo(MatchResult t) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;
        if (this.getPoints() == t.getPoints()) {
            return EQUAL;
        }
        if (this.getPoints() > t.getPoints()) {
            return BEFORE;
        } else {
            return AFTER;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.points;
        hash = 43 * hash + (this.t1 != null ? this.t1.hashCode() : 0);
        hash = 43 * hash + (this.t2 != null ? this.t2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MatchResult other = (MatchResult) obj;
        if (this.points != other.points) {
            return false;
        }
        if (this.t1 != other.t1 && (this.t1 == null || !this.t1.equals(other.t1))) {
            return false;
        }
        if (this.t2 != other.t2 && (this.t2 == null || !this.t2.equals(other.t2))) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "MatchResult{" + "points=" + points + ", s1=" + t1 + ", s2=" + t2 + '}';
    }
}
