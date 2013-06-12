/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

import world.mob.MapObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrick
 */
public class Tile {
    private List<MapObject> contents;
    
    public TileType type;
    
    public Tile(TileType t){
        contents = new ArrayList<MapObject>();
        type = t;
    }
    
    /**
     * Move a MapObject from this tile to another tile.
     * @param thing the MapObject to be moved
     * @param other the other tile
     * @return true on successful move, false otherwise
     */
    public boolean moveMobTo(MapObject thing, Tile other){
        if(contents.contains(thing)){
            contents.remove(thing);
            other.enter(thing);
            thing.updateLocation(other);
            return true;
        }
        return false;
    }
    
    /**
     * Bam! This MapObject is in the tile now.
     * @param thing 
     */
    private void enter(MapObject thing){
        contents.add(thing);
    }
}
