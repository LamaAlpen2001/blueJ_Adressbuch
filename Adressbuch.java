public class Adressbuch{
    private List<Kontakt> adressliste;

    public Adressbuch(){
     adressliste = new List();
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
    
    public void nummerAnzeigen(String pName){
     if(!adressliste.isEmpty() && pName!= null){
       adressliste.toFirst();
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
         System.out.println(adressliste.getContent().getName()+ ": ");
         System.out.println(adressliste.getContent().getTelenr());
       }
       else{
         System.out.println("Der Name wurde nicht gefunden."); 
       }
     }
     else{
       System.out.println("Liste ist leer!");
     }
    }
    
    public void sortiertEinfuegen(String pName , int pNummer){
      Kontakt pKontakt = new Kontakt(pName, pNummer);
        if(!adressliste.isEmpty()){
        adressliste.toFirst();
        while(adressliste.hasAccess() && adressliste.getContent().getName().compareTo(pName)<0){
          adressliste.next();  
        }
        if(adressliste.hasAccess()){
         adressliste.insert(pKontakt); 
        }
      }
      adressliste.append(pKontakt);
    }
    
    public void suche(String pSuche){
      if(!adressliste.isEmpty() && pSuche != null){
        adressliste.toFirst();  
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
            System.out.println(adressliste.getContent().getName()+ ": ");
            System.out.println(adressliste.getContent().getTelenr());
          }
          adressliste.next();
        }  
      }
      else{
        System.out.println("Keine Suche eingegeben.");
      }
    }
}