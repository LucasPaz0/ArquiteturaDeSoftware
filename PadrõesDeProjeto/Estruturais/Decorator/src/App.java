public class App {
    public static void imprimirInfo(Cafe c){
        System.out.println("Preço: " + c.informarPreco() + ", ingredientes: " + c.informarIngredientes());
    }
    public static void main(String[] args) throws Exception {
        Cafe c = new CafePuro();
        imprimirInfo(c);

        c = new CafeComLeite(c);
        imprimirInfo(c);

        c = new CafePuro();
        c = new CafeComSorvete(c);
        imprimirInfo(c);
    }
}