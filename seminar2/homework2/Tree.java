import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tree implements Iterable<Human>, Serializable {
    private List<Human> tree;

    public Tree() {
        this.tree = new ArrayList<>();
    }

    public List<Human> getTree() {
        return tree;
    }

    public void addHuman(Human human){
        tree.add(human);
    }

    @Override
    public Iterator<Human> iterator() {
        return tree.iterator();
    }
}
