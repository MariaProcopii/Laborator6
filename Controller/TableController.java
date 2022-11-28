package Controller;
import Model.Menu;
import Model.Table;

public class TableController extends EntitiesController{
    private Table model;

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

    public int setNumber(int number){
        return model.setNumber(number);
    }

    public void qualityCheck() {
        super.qualityCheck(getEntityType(), getQualityIndex());
    }
}
