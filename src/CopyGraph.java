import java.util.Map;

public class CopyGraph {
    //give you a graphnode and it can traverse all graphnode in graph
    //assumption
    public GraphNode copyGraph(GraphNode input, Map<GraphNode, GraphNode> lookup){
        if(input == null){
            return null;
        }
        if(lookup.containsKey(input)){
            return lookup.get(input);
        }
        GraphNode copyNode = new GraphNode(input.value);
        lookup.put(input, copyNode);
        for(GraphNode nei : lookup.get(input).negihbours){
            lookup.put(nei, copyGraph(nei, lookup));
        }
        return copyNode;
    }
}
