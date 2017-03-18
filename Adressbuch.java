public class Adressbuch{
    private List<Kontakt> adressliste;

    public Adressbuch(){
     adressliste = new List();
    }

    public void kontaktHinzufuegen(Kontakt pKontakt){
        adressliste.append(pKontakt);  
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
     if(!adressliste.isEmpty()){
       adressliste.toFirst();
       while(adressliste.hasAccess() || adressliste.getContent().getName().equals(pName)){
         adressliste.next(); 
       }
       if(adressliste.hasAccess()){
        System.out.println(adressliste.getContent().getName()+ ": ");
        System.out.println(adressliste.getContent().getTelenr());
       }
       else{
         System.out.println("Der Name wurde nicht gefunden."); 
       }
     }
     System.out.println("Liste ist leer!");
    }
    
    public void sortiertEinfuegen(Kontakt pKontakt){
      if(!adressliste.isEmpty()){
        adressliste.toFirst();
        String name1 = pKontakt.getName();
        while(adressliste.hasAccess() && adressliste.getContent().getName().compareTo(name1)<0){
          adressliste.next();  
        }
        if(adressliste.hasAccess()){
         adressliste.insert(pKontakt); 
        }
      }
      adressliste.append(pKontakt);
    }
    
    public void suche(){
      // Hier kannst du was schreiben, Erik!
    }
}