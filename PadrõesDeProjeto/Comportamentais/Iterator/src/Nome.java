import java.util.Iterator;
import java.util.List;


public class Nome implements Iterator<String> {
    private List<String> nomes;
    private int pos;

    public Nome(List<String> nomes) {
        this.nomes = nomes;
    }

    @Override
    public boolean hasNext() {
        return pos < nomes.size();
    }

    @Override
    public String next() {
        return nomes.get(pos++);
    }
}