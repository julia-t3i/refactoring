package theater;

/**
 * Represents a play in a theater.
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
