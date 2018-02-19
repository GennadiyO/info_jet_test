import java.util.ArrayList;
import java.util.List;

public class WaysGroup {

    private final List<Way> ways;

    public WaysGroup() {
        ways = new ArrayList<>();
    }
    public void add(Way way) {
        ways.add(way);
    }
    public void add(int coin) {
        for (Way way : ways) {
            way.add(coin);
        }
    }
    public void add(WaysGroup group) {
        if (group == null) {
            return;
        }
        for (Way way : group.ways) {
            ways.add(new Way(way));
        }
    }
    public void print() {
        for (Way way : ways) {
            way.print();
        }
    }
}