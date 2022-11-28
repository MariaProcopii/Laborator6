package Controller;

import Model.Table;

public class TableController extends EntitiesController{
    private final Table model;

    public TableController(PlayerController player,
                           Table model,
                           int number) {
        super(player);
        this.model = model;
        setEntityType("Table");
        setNumber(number);
    }

    public int getNumber() {
        return model.getNumber();
    }

    public void setNumber(int number){
        model.setNumber(number);
    }

    public void qualityCheck() {
        super.qualityCheck(getEntityType(), getQualityIndex());
    }
}
