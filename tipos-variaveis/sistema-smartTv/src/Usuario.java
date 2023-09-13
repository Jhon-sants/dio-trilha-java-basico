public class Usuario {
  
  public static void main(String[] args){
    SmartTv smartTv = new SmartTv();

    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();

    smartTv.mudarCanal(7);

    System.out.println("TV ligada ? " + smartTv.ligar());
    System.out.println("Volume da tv: " + smartTv.volume);
    System.out.print("Canal da tv: " + smartTv.canal);

  }
}
