public class Adressbuch{
    private List<Kontakt> adressenListe;
    public Adressbuch(){
        adressenListe= new List();
    }
    public void kontaktHinzufuegen(Kontakt pKontakt)
    {
        adressenListe.append(pKontakt);
    }
    public void letztenKontaktLoeschen()
    {
        if(!adressenListe.isEmpty()){
        adressenListe.toLast();
        adressenListe.remove();
        System.out.println("letzter Kontakt gelöscht");
      }
      System.out.println("Liste ist leer");
    }
    public void nummerAnzeigen(String pName){
       if(!adressenListe.isEmpty()){
           adressenListe.toFirst();
           while(adressenListe.hasAccess() || !adressenListe.getContent().getName().equals(pName)){
               adressenListe.next();
            }
           if(adressenListe.hasAccess()){
            System.out.println(adressenListe.getContent().getName()+":");
            System.out.println(adressenListe.getContent().getTeleNr());
        }
        else
            System.out.println("Name nicht gefunden");
       }
      else
        System.out.println("Liste ist leer");
    }
    public void sortiertEinfügen(Kontakt pKontakt){
        if(!adressenListe.isEmpty()){
            
        }
        else{
            adressenListe.append(pKontakt);
       }
    }
}
