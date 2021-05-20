package contract;

import java.util.ArrayList;

/**
 * The Class Controller.
 * @author client
 * @author Aifa-Boulder-Dash
 * @version 2021
 */

public interface IMap {

	public String getDataMap();

	public void setDataMap(String dataMap);

	public int getWidth();

	public void setGeneratedMap(ArrayList<IBlock> generatedMap);

	public int getHeight();

	public void setHeight(int height);
	
	public ArrayList<IBlock> getGeneratedMap();
	public IBlock getEnd();

	public void setEnd(IBlock end);

	public int getDiamonds();

	public void setDiamonds(int diamonds);

	public void setWidth(int width);
	public void generateMap();
	
}
