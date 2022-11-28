package Controller;
import java.util.ArrayList;
import Model.Admin;
import Model.Player;
import View.GoodByeM;
import View.GreetingM;

public class AdminController extends HumanController{

    private Admin model;
    private PlayerController player;
    private TableController table;

    public AdminController(Admin model,
                            GreetingM greetingView,
                            GoodByeM goodByeView,
                           PlayerController player,
                           TableController table,
                           int nrOfPlayers,
                           int nrOfTables){

        super(greetingView, goodByeView);
        this.model = model;
        this.player = player;
        this.table = table;
        setNumber(nrOfPlayers);
        setNrOfTables(nrOfTables);
    }

    public void setNrOfTables(int nrOfTables) {
        model.setNrOfTables(nrOfTables);
    }

    public int getNrOfTables() {
        return model.getNrOfTables();
    }

    public void setNumber(int number) {
        model.setNumber(number);
    }

    public int getNumber() {
        return model.getNumber();
    }
    public void setFree(boolean free) {
        model.setFree(free);
    }

    public boolean getFree() {
        return model.getFree();
    }

    public static void setServicedPlayers() {
        Admin.setServicedPlayers();
    }

    public static int getServicedPlayers() {
        return Admin.getServicedPlayers();
    }

    public int provideTable(ArrayList<PlayerController> customersList){
        if(getFree()){
            customersList.get(table.getNumber()).setOpinion(1);
            setReputation(1);
            setServicedPlayers();
            return 1;
        }
        else{
            setReputation((customersList.size() - getNrOfTables()) * (-3));
            return 0;
        }
    }

    public void greeting() {
        setFree(getNumber() <= getNrOfTables());
        greetingView.admin(player.getName(), getFree(),table.getNumber());
    }

    public void goodBye() {
        goodByeView.admin(player.getName(), player.getOpinion());
    }
}
