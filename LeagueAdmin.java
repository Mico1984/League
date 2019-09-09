import java.util.*;

/**
 * class LeagueAdmin for TMA03Q2.
 * 
 * Mikulas Lukacs 
 * 
 */
public class LeagueAdmin
{
   public Map<String,List<String>> teams;
   
   /**
    * Constructor for objects of class LeagueAdmin
    */
   public LeagueAdmin()
   {
      
      teams = new HashMap<>();

   }
   public void mapEntries()
   {
      List<String>team = new ArrayList<>();
      
      team.add("List of Team objects in the Premier division");
      teams.put("Premier", team);
      team = new ArrayList();
      team.add("List of Team objects in the Championship division");
      teams.put("Championship", team);
      team = new ArrayList();
      team.add("List of Team objects in the League 1 division");
      teams.put("League1", team);
      
      
   }
   
}
   

