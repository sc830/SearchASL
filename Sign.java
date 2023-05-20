
// Stores sign characteristics in class variables
// domHandshape: handshape of dominant hand based on handshape codes
// baseHandshape: handshape of non-dominant (base) hand based on handshape codes
// twoHanded: "Y" if both hands are used, "N" if one-handed
// symmetrical: "Y" if symmetrical, "N" if asymmetrical
// alternating: "Y" if alternating movement, "N" otherwise
// repeated: "Y" if signed more than once, "N" if unidirectional
// proximity: String indicating proximity to body
// match: number of fields that match search query

public class Sign {
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
    
}
