import java.util.Comparator;

public class CatComp implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getAge()- o2.getAge();
    }
}
