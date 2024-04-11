package za.co.mkhungo.domain.enums;

/**
 * @author Noxolo.Mkhungo
 */
public enum Rating {
    ONE("ONE",1),
    TWO("TWO",2),
    THREE("THREE",3),
    FOUR("FOUR",4),
    FIVE("FIVE",5);

    private final String text;

    Rating(String text,int rating){
        this.text=text;
    }
}
