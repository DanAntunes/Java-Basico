public class Usuario {
  public static void main(String[] args) throws Exception {
    SmartTV smartTV = new SmartTV();

    smartTV.diminuirVolume();
    smartTV.diminuirVolume();
    smartTV.diminuirVolume();
    smartTV.aumentarVolume();

    System.out.println("Canal Atual ? :" + smartTV.canal);

    smartTV.mudarCanal(13);
    System.out.println("Canal Atual ? :" + smartTV.canal);

    System.out.println("Volume atual ? :" + smartTV.volume);

    System.out.println("TV Ligada ? :" + smartTV.ligada);
    System.out.println("Volume atual ? :" + smartTV.volume);

    smartTV.ligar();
    System.out.println("Novo status -> TV Ligada ? :" + smartTV.ligada);

    smartTV.desligar();
    System.out.println("Novo status -> TV Ligada ? :" + smartTV.ligada);
  }
}
