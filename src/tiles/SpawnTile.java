package tiles;

import graphics.Assets;

public class SpawnTile extends Tile
{

	public SpawnTile(int id)
	{
		super(Assets.spawn, id);
		// TODO Auto-generated constructor stub
	}

	public boolean isWalkable()
	{
		return true;
	}
}//End class SpawnTile
