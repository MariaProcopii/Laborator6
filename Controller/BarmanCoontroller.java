package Controller;

import View.GoodByeM;
import View.GreetingM;

public class BarmanCoontroller extends HumanController {
    private DeckController deck;
    private PlayerController player;

    public BarmanCoontroller(GreetingM greetingView,
                             GoodByeM goodByeView,
                             DeckController deck,
                             PlayerController player) {

        super(greetingView, goodByeView);
        this.deck = deck;
        this.player = player;
    }

    public void playGame(){
        int suit1 = random.nextInt(deck.getSuits().length);
        int suit2 = random.nextInt(deck.getSuits().length);
        int rank1 = random.nextInt(deck.getRanks().length);
        int rank2 = random.nextInt(deck.getRanks().length);

        deck.setSuit(deck.getSuits()[suit1], 0);
        deck.setSuit(deck.getSuits()[suit2], 1);
        deck.setRank(deck.getRanks()[rank1], 0);
        deck.setRank(deck.getRanks()[rank2], 1);

        deck.findCardVal(deck.getRank(0), 0);
        deck.findCardVal(deck.getRank(1), 1);

        if(deck.getValue(0) < deck.getValue(1)){
            player.setWinGame(false);
            player.pay(50);
            player.setOpinion(-10);
        }
        else{
            player.setWinGame(true);
            player.setMoney(100);
            player.setOpinion(10);
        }
    }
    public void greeting() {
        player.setDecision(random.nextBoolean());
        if(player.getDecision()){
            playGame();
        }
        greetingView.barman(player.getName(), getName(), player.getDecision());
    }

    public void goodBye() {
        if(player.getDecision()) {
            deck.qualityCheck();
            goodByeView.barman(player.getName(), player.getWinGame(),
                    deck.getSuit(0), deck.getRank(0), deck.getValue(0),
                    deck.getSuit(1), deck.getRank(1), deck.getValue(1));
        }
    }
}
