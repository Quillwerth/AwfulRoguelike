/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package world.mob;

import world.Tile;

/**
 *
 * @author Patrick
 */
public class MapObject {
    Tile loc = null;
    
    public void updateLocation(Tile here){
        loc = here;
    }
}
