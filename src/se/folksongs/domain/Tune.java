package se.folksongs.domain;

/**
 * Created 2011-nov-16
 * @author jep
 */
public class Tune {

    private String name;
    private Type type;
    private Region region;
    private Beat beat;
    private FolkMusician composer;
    private FolkMusician learnedFrom;
    private District disctrict;

    public FolkMusician getLearnedFrom() {
        return learnedFrom;
    }

    public void setLearnedFrom(FolkMusician learnedFrom) {
        this.learnedFrom = learnedFrom;
    }

    public FolkMusician getComposer() {
        return composer;
    }

    public void setComposer(FolkMusician composer) {
        this.composer = composer;
    }

    public District getDisctrict() {
        return disctrict;
    }

    public void setDisctrict(District disctrict) {
        this.disctrict = disctrict;
    }

    public Beat getBeat() {
        return beat;
    }

    public void setBeat(Beat beat) {
        this.beat = beat;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
