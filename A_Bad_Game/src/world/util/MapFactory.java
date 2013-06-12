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
                    basic.getTile(xi, yi).type = TileType.FLOOR;
                }
            }
        }
        boolean changesMade = false;
        
        do{
            Map nextIter = new Map(x, y);
            for(int xi = 1; xi<x-1; xi++){
                for(int yi = 1; yi<y-1; yi++){
                    
                }
            }
            
        }while(changesMade);
        
        
        return basic;
    }
    
    private void CA_ModifyTile(int x, int y){
        int open = 5;
        int close = 2;
        
        for(int xi = Math.max(1, x-1); xi<Math.min(x-1, x+1); xi++){
            for(int yi = Math.max(1, y-1); yi<Math.min(y-1, y+1); yi++){
                
            }
        }
        
    }
    
    
    
    
    
}
