public class Computador {
    public void ligar() {
        try {
            String inicializando = "Inicializando o sistema...";
            Thread.sleep(1500);

            String carregando = "Carregando programas...";
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Computador ligado!");
    }
}