
// Stores sign characteristics in class variables
// domHandshape: handshape of dominant hand per handshape codes
// baseHandshape: handshape of non-dominant (base) hand per handshape codes
// twoHanded: "Y" if both hands are used, "N" if one-handed
// symmetrical: "Y" if symmetrical, "N" if asymmetrical
// alternating: "Y" if alternating movement, "N" otherwise
// repeated: "Y" if signed more than once, "N" if unidirectional
// proximity: String indicating proximity to body
// match: number of fields that match search query

public class Sign {
    private String name;                // Sign name in English
    private String domHandshape;        // variable string
    private String baseHandshape;       // variable string
    private String twoHanded;           // Y/N
    private String symmetrical;         // Y/N 
    private String alternating;         // Y/N
    private String repeated;            // Y/N
    private String proximity;           // variable string
    private String movement;            // variable string
    private int match;                  // tracks similarity to search query

    // Initializes all variables to "" or 0
    public Sign() {
        domHandshape = "";
        baseHandshape = "";
        twoHanded = "";
        symmetrical = "";
        alternating = "";
        repeated = "";
        proximity = "";
        movement = "";
        match = 0;
    }

    // Overloaded constructor - initializes char. variables to input
    public Sign(String dom, String base, String hand, String symm, String alt, String rep, String prox, String mov) {
        domHandshape = dom;
        baseHandshape = base;
        twoHanded = hand;
        symmetrical = symm;
        alternating = alt;
        repeated = rep;
        proximity = prox;
        movement = mov;
        match = 0;
    }

    public void setName(String signName) {
        name = signName;
    }

    public void setDom(String handshape) {
        domHandshape = handshape;
    }

    public void setBase(String handshape) {
        baseHandshape = handshape;
    }

    public void setTwoHanded(String handedness) {
        twoHanded = handedness;
    }

    public void setSymmetry(String symmetry) {
        symmetrical = symmetry;
    }

    public void setAlternating (String alt) {
        alternating = alt;
    }

    public void setRepetition(String rep) {
       repeated = rep;
    }

    public void setProximity(String prox) {
        proximity = prox;
    }

    public void setMovement(String mov) {
        movement = mov;
    }

    public String getName() {
        return name;
    }

    public String getDomHandshape() {
        return domHandshape;
    }

    public String getBaseHandshape() {
        return baseHandshape;
    }

    public String getHandedness() {
        return twoHanded;
    }

    public String getSymmetry() {
        return symmetrical;
    }

    public String getAlternating() {
        return alternating;
    }

    public String getRepetition() {
        return repeated;
    }

    public String getProximity() {
        return proximity;
    }

    public String getMovement() {
        return movement;
    }

    public int getMatch() {
        return match;
    }

    public void incrementMatch() {
        match++;
    }
    
}
