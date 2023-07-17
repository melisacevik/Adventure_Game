package Location.Place;
import Location.BattleLocation;
import Obstacle.*;
import Player.*;

public class River extends BattleLocation {

    public River(Player player) {
        super(player,"River", new Bear(),"water",2);
    }

}