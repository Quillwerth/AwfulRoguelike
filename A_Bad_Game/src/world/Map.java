/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package world;

/**
 *
 * @author Patrick
 */
public class Map {
    Tile[][] map;
    
    public Map(int x, int y){
        map = new Tile[x][y];
        for(int xi = 0; xi<x; xi++){
            for(int yi = 0; yi<y; yi++){
                map[xi][yi] = new Tile(TileType.WALL);
            }
        }
    }
    
    public Tile getTile(int x, int y){
        return map[x][y];
    }
    
}
