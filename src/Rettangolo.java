public class Rettangolo {
  private double altezza;
  private double larghezza;

  public Rettangolo (double altezza, double larghezza){
      this.altezza = altezza;
      this.larghezza = larghezza;
  }
  public double calcoloPerimetro(){
      return 2 * (altezza + larghezza);
  }
  public double calcoloArea(){
      return altezza * larghezza;
  }

  public void stampaRettangolo(){
      System.out.println("Dati del Rettangolo");
      System.out.println("Perimetro: " + calcoloPerimetro());
      System.out.println("Area: " + calcoloArea());
  }
  public static void stampaDueRettangoli(Rettangolo rettangolo1,Rettangolo rettangolo2){
      System.out.println("Rettangolo 1");
      rettangolo1.stampaRettangolo();

      System.out.println("Rettangolo 2");
      rettangolo2.stampaRettangolo();

      double sommaAree = rettangolo1.calcoloArea() + rettangolo2.calcoloArea();
      double sommaPerimetri = rettangolo1.calcoloPerimetro() + rettangolo2.calcoloPerimetro();

      System.out.println("La somma delle aree dei due rettangoli è " + sommaAree);
      System.out.println("La somma dei perimetri dei due rettangoli è " + sommaPerimetri);
  }

  public static void main(String[] args){
      Rettangolo rettangolo1 = new Rettangolo(10,8);
      Rettangolo rettangolo2 = new Rettangolo(3,7);

      Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
  }
}
