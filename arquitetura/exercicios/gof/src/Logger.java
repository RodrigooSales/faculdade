public class Logger {
  private boolean ativo = false;
  private static Logger instancia = null;

  private Logger() {
  }

  public static synchronized Logger obterInstancia() {
    if (instancia == null) {
     instancia = new Logger();
     }
    return instancia;
  }
    

  public boolean isAtivo() {
    return this.ativo;
  }

  public void setAtivo(boolean b) {
    this.ativo = b;
  }

  public void log(String s) {
    if (this.ativo)
      System.out.println("LOG :: " + s);
  }

}