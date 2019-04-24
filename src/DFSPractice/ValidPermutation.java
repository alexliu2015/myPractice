package DFSPractice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ValidPermutation {
    public boolean validPermutationParenthesis(String s){
        //check s is null or s is empty
        //both should return true
        if(s == null || s.length() == 0){
            return true;
        }

        char[] temp = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < temp.length; i++){
            if(stack.isEmpty()){
                stack.addLast(temp[i]);
            }else if(temp[i] == '('){
                stack.addLast(temp[i]);
            }else if(stack.peekLast() == '('){
                stack.pollLast();
            }else {
                return false;
            }
        }

        if(!stack.isEmpty()){
            return false;
        }

        return true;
    }

    public List<String> findAllValidPermutation(String s){
        char[] input = s.toCharArray();
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        findAllValidPermutation(input, 0, sb, res);
        return res;
    }

    public void findAllValidPermutation(char[] input, int index, StringBuilder sb, List<String> res){
        if(index == input.length){
            String temp = sb.toString();
            if(validPermutationParenthesis(temp)){
                res.add(temp);
            }
            return;
        }

        sb.append(input[index]);
        findAllValidPermutation(input, index+1, sb, res);
        sb.deleteCharAt(sb.length() - 1);
        findAllValidPermutation(input, index+1, sb, res);
    }

    public static void main(String[] args){
        ValidPermutation vp = new ValidPermutation();
//        System.out.println(vp.validPermutationParenthesis("((((()))))"));
        List<String> res = vp.findAllValidPermutation("()()()");
        for(String s: res){
            System.out.println(s);
        }
    }
}
