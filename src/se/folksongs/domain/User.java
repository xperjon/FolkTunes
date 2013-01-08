package se.folksongs.domain;

import java.util.Set;

/**
 * Created 2011-nov-24
 * @author jep
 */
 public class User {
    
    private String name;
    private Set<Tune> myTunes;
    
    //TODO
//    private Location currentLocation;

    public User(String name, Set<Tune> myTunes) {
        this.name = name;
        this.myTunes = myTunes;
    }

    public String getName() {
        return name;
    }

    public Set<Tune> getMyTunes() {
        return myTunes;
    }
    
}
