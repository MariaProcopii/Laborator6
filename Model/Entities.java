package Model;

import java.util.Random;

public class Entities {
    public Random random = new Random();
    private final int qualityIndex = random.nextInt(3) + 1;
    private String entityType;

    public int getQualityIndex() {
        return qualityIndex;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getEntityType() {
        return entityType;
    }
}
