package stockmarket;
import java.util.Comparator;

public class BuyersBid implements Comparator<Bid>  {

    public int compare(Bid o1, Bid o2){
        return Integer.compare(o1.getBid(), o2.getBid());
    }
}
