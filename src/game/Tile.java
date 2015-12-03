package game;
import java.awt.*;

/**
 * 
 * @author Ethan Davies
 *
 */

public class Tile {
	
	protected static int width = 50;
	protected static int height = 50;

	protected Boolean isClicked;
	protected Boolean mineType;
	protected Boolean hiddenType;
	protected Boolean revealedType;
	protected Boolean defusedType;
	protected Image tileCover;
	
	public static void main(String[] args) {
		
	}

	public Tile(boolean mineType){
		this.mineType=mineType;
	}
	
	public void createTile() {
		
	}
	
	public boolean getMineType() {
		return mineType;
	}
	
	public void changeTileType() {
		// This will change the type of the tile if required
	}
	
	public void render() {
		// This will render the tile 
	}

}
