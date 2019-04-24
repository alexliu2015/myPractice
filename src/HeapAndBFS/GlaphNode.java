package HeapAndBFS;

import java.util.ArrayList;
import java.util.List;

public class GlaphNode {
    public int val;
    public List<GlaphNode> neighbours;

    public GlaphNode(int val){
        this.val = val;
        this.neighbours = new ArrayList<>();
    }
}
