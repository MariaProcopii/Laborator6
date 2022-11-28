package Model;
import java.util.Random;

public class Entities {
    public Random random = new Random();
    private int qualityIndex = random.nextInt(3) + 1;
    private String entityType;
    private final boolean answer = random.nextBoolean();

    public int getQualityIndex() {
        return qualityIndex;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getEntityType() {
        return entityType;
    }
}
