public class App {
    public static void main(String[] args) {
        Carro carro = new Carro.CarroBuilder()
            .setMarca("Toyota")
            .setModelo("Corolla")
            .setAno(2018)
            .setCor("Prata")
            .build();

        
        System.out.println(carro.toString());
    }
}