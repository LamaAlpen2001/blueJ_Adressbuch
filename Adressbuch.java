public class Adressbuch{
    private List<Kontakt> adressliste;

    public Adressbuch(){
     adressliste = new List();
    }
    
    public void TestKontakte(){
      adressliste.append(new Kontakt("Anna", 49345836));
      adressliste.append(new Kontakt("Bernt", 49778034));
      adressliste.append(new Kontakt("Justin", 493466645));
      adressliste.append(new Kontakt("Gustav", 49367854));
      adressliste.append(new Kontakt("Klara", 49985673));
      adressliste.append(new Kontakt("Richard", 496762543));
      adressliste.append(new Kontakt("Lena", 49446721));
      adressliste.append(new Kontakt("Ole", 49763382));
      adressliste.append(new Kontakt("Sara", 49113573));
      adressliste.append(new Kontakt("Emil", 49200173));
    }
    
    /*public void kontaktHinzufuegen(Kontakt pKontakt){
        adressliste.append(pKontakt);  
    }*/
    public void kontaktHinzufuegen(String pName, int pNummer){
        Kontakt k = new Kontakt(pName, pNummer);
        adressliste.append(k);
    }
    
    public void letztenKontaktloeschen(){
     if(!adressliste.isEmpty()){
        adressliste.toLast();
        adressliste.remove();
        System.out.println("Letzer Kontakt gelöscht");
     }
     System.out.println("Liste ist leer!");
    }
    
    public String nummerAnzeigen(String pName){
    if(!adressliste.isEmpty() && pName!= null){
       adressliste.toFirst();
       String h = "Kein Kontakt gefunden.";
       boolean zugang = adressliste.hasAccess();
       boolean namegef = false;
       while(zugang == true && namegef == false){
        if(!adressliste.hasAccess()){
          zugang = false;
        }
        if(adressliste.getContent().getName().equals(pName)){
          namegef = true;
        }
       }
       if(adressliste.hasAccess()){
         return(adressliste.getContent().getName() + adressliste.getContent().getTelenr());
       }
       else{
         return h;
       }
     }
     else{
       String i = "Keine Suche angegeben.";
       return i;
     }
    }
    
    public String sortiertEinfuegen(String pName , int pNummer){
      Kontakt pKontakt = new Kontakt(pName, pNummer);
      String h = "Neuer Kontakt eingefügt.";
      if(!adressliste.isEmpty()){
        adressliste.toFirst();
        while(adressliste.hasAccess() && adressliste.getContent().getName().compareTo(pName)<0){
          adressliste.next();  
        }
        if(adressliste.hasAccess()){
         adressliste.insert(pKontakt);
        }
      }
      else{
        adressliste.append(pKontakt);
      }
      return h;
    }
    
    public String suche(String pSuche){
      if(!adressliste.isEmpty() && pSuche != null){
        adressliste.toFirst();
        String x = ""; 
        boolean gleich = true;
        int i = 0;
        while(adressliste.hasAccess()){
          while(gleich == true && i<pSuche.length()-1){
            if(pSuche.charAt(i) == adressliste.getContent().getName().charAt(i)){
              i = i+1;
            }
            else{
              gleich = false;
            }
          }
          if(gleich == true){
            x = x + adressliste.getContent().getName() + ": " + adressliste.getContent().getTelenr() + "; ";
          }
          adressliste.next();
        }
         
        return x; 
      }
      else{
        return null;
      }
    }
}