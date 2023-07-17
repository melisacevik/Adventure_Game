package Location.Place;
import Location.BattleLocation;
import Obstacle.*;
import Player.Player;

public class Cave extends BattleLocation {

    public Cave(Player player) {
        super(player,"Cave", new Zombie(),"food",3);
    }

}