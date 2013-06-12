/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package world.util;

import java.util.Random;
import world.Map;
import world.Tile;
import world.TileType;

/**
 *
 * @author Patrick
 */
public class MapFactory {
    
    public Map createBasicMap(int x, int y){
        Map basic = new Map(x,y);
        Random r = new Random();
        for(int xi = 1; xi<x-1; xi++){
            for(int yi = 1; yi<y-1; yi++){
                if(r.nextDouble()< 0.3333){
                    
                }
            }
        }
        return basic;
    }
}
