package DFSPractice;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public List<String> findAllSubSets(char[] input){
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        findAllSubSets(input, 0, sb, res);
        return res;
    }

    public void findAllSubSets(char[] input, int index, StringBuilder sb,List<String> res){
        //check index is out of bound or not
        if(index == input.length){
            res.add(sb.toString());
            return;
        }

        sb.append(input[index]);
        findAllSubSets(input, index+1, sb, res);
        sb.deleteCharAt(sb.length() - 1);
        findAllSubSets(input,index+1, sb, res);
    }

    public static void main(String[] args){
        Permutation p = new Permutation();
        char[] input = new char[]{'a', 'b', 'c'};
        List<String> res = p.findAllSubSets(input);
        for(String s : res){
            System.out.println(s);
        }
    }
}
