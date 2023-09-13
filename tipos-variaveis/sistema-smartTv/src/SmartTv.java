public class SmartTv{

  boolean ligada;
  int volume = 22;
  int canal = 13;

  public String ligar(){
    ligada = true;
    return "SIM";
  }

  public String desligar(){
    ligada = false;
    return "NÃO";
  }

  public void aumentarVolume(){
    volume++;
  }

  public void diminuirVolume(){
    volume--;
  }

  public void subirCanal(){
    canal++;
  }

  public void descerCanal(){
    canal--;
  }

  public void mudarCanal(int novoCanal){
    canal = novoCanal;
  }

}