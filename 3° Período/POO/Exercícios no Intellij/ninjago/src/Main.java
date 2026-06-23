public class Main{
  public static void main(String[] args){
    Ninja kai = new NinjaVermelho("Kai", "Vermelho", "Fogo");
    kai.spinjitzu();
    if (kai instanceof NinjaVermelho){
      NinjaVermelho nv = (NinjaVermelho) kai;
      nv.ataqueElemental();
      nv.spinjitzuBurst();
    }
    kai.mostrarNinja();
    Ninja lloyd = new NinjaVerde("Lloyd", "Verde", "Energia");
    lloyd.mostrarNinja();
    lloyd.spinjitzu();
    if (lloyd instanceof NinjaVerde){
      NinjaVerde nv = (NinjaVerde) lloyd;
      nv.ataqueElemental();
      nv.spinjitzu();
      NinjaDourado nd = nv.transformar();
      nd.ataqueElemental();
      nd.spinjitzu();
      nd.mostrarNinja();
    }

  }
}