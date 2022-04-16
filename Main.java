import java.util.*;
class Main {
  public class Player implements Comparable<Player>{
    public int score;
    public String name;

    public Player(String name, int score){
      super();
      this.name=name;
      this.score=score;
    }
    
    //our compareTo function will override the generic one from Comparable. We want to sort scores in ascending order and if the scores are equal, then we sort them alphabetically
    public int compareTo(Player b){
      int compareScore = ((Player) b).score;
      
      if(this.score==compareScore){
        String name1 = this.name;
        String name2 = b.name;
        return name1.compareTo(name2); //returns negative if name1 is alphabetically before name 2
      }
      return compareScore- this.score;
    }
  }
  public Player[] score(String[] scores,int k){
    HashMap<String,Player> stats = new HashMap<>();
    Player[] resultArray = new Player[k];
    // calculate everyones scores based off the input array and store their names/scores within a HashMap.
    for(int i=0;i<scores.length;i++){
      String stat[] = scores[i].split(",");
      if(stats.containsKey(stat[0])){
        Player exists = stats.get(stat[0]);
        exists.score+=Integer.parseInt(stat[1]);
        stats.put(stat[0],exists);
      }
      else{
        stats.put(stat[0],new Player(stat[0],Integer.parseInt(stat[1])));
      }
    }
    Player[] result = stats.values().toArray(new Player[0]);//push stats values onto Player array
    Arrays.sort(result);//result array will sort based on compareTo function
    for(int i=0;i<k;i++){//push top k results into our return array
      resultArray[i]=result[i];
    }
    return resultArray;
  }
  public static void main(String[] args) {
    Main m = new Main();// we need to access our score function in a non-static way because our player class is nested within main
     String[] scoreLog = {"aPlayer,2", "bPlayer,1", "aPlayer,1", "cPlayer,5", "dPlayer,2", "ePlayer,1", "bPlayer,2", "dPlayer,1"};
    Player p[] =m.score(scoreLog,3);
    for(int i=0;i<p.length;i++){
      System.out.print(p[i].name+" "+p[i].score+" ");
    }
  }
}
