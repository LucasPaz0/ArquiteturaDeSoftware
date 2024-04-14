public class CafeComLeite extends CafeDecorator{
    
    public CafeComLeite(Cafe cafe){
        super(cafe);
    }

    @Override
    public double informarPreco(){
        return super.informarPreco() + 0.5;
    }
    @Override
    public String informarIngredientes(){
        return super.informarIngredientes() + ", Leite";
    }
}