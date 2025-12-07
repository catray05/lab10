package Model;

import java.io.IOException;

/**
 *
 * @author DELL
 */
public class Catalog
{
  private boolean current; // True if there is a game in progress, False otherwise.
  private boolean allModesExist; // True if there is atleast one game available for eachdifficulty, False otherwise.
  private Saving savee;
  private Load load;
  
  
 
    public Catalog(boolean current, boolean allModesExist) {
        this.current = current;
        this.allModesExist = allModesExist;
        
    }

    public boolean hasUnfinishedGame() {
        if(load.hasUnifnishedGame() == null)
        {
            return false;
        }
        return true;
    }

    public boolean hasAllDifficulties() {
      
        if(load.getGame("easy") == null || load.getGame("medium") == null ||  load.getGame("hard") == null )
        {
            return false;
        }
        return true;

    }
  
    public void addNew(Game game) throws IOException    //hena bn7othm fel folders 3ala hsb el level
    {
        if(game!=null)
        {
            savee.SavingToFolder(game); 
        }
        else
        {
            return;
        }
    }
  
}
