import java.util.LinkedList;
import java.util.Queue;
import Street;

public class Transport {
    private Queue<Street> streetsQueue;

    public Transport() {
        this.streetsQueue = new LinkedList<>();
    }

    public void addStreet(Street street) {
        streetsQueue.add(street);
    }

    public Street getNextStreet() {
        return streetsQueue.poll();
    }

    public int numberOfStreets() {
        return streetsQueue.size();
    }
}
