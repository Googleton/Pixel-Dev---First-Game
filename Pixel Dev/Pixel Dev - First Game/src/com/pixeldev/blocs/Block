package com.pixeldev.blocs;

import org.newdawn.slick.SpriteSheet;

public class Block
{
  public Block[] blockList = new Block[4096];
	
	public int index1, index2;
	public final int id;
	
	/** constructeur
	 * @param ID du bloc
	 */
	public Block(int theID)
	{
		this.id = theID;
	}
	
	/** sélectionne la texture, x commence à 0 et y aussi
	 * @param x
	 * @param y
	 * @return la class
	 */
	public Block setIconIndex(int icon1, int icon2)
	{
		this.index1 = icon1;
		this.index2 = icon2;
		return this;
	}
}
