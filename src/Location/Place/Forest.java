package Location.Place;
import Location.BattleLocation;
import Obstacle.*;
import Player.Player;

public class Forest extends BattleLocation {

    public Forest(Player player) {
        super(player,"Forest",new Vampire(),"firewood",3);
    }
}