public class Kontakt{
    private String name;
    private int telenr;
    
    public Kontakt(String pName, int pTelenr){
      name = pName;
      telenr = pTelenr;
    }

    public void setName(String pName){
      name = pName;
    }
    
    public String getName(){
      return name;
    }
    
    public void setTelenr(int pTelenr){
      telenr = pTelenr;
    }
    
    public int getTelenr(){
      return telenr;
    }
}
