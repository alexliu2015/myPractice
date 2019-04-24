package StringII;

public class reverseString {
    //iterative
    public String reverseString(String s){
        if(s == null || s.length() == 0){
            return s;
        }

        StringBuilder arr = new StringBuilder(s);
        for(int i = 0; i < arr.length() / 2; i++){
            swap(arr, i, arr.length() - 1 - i);
        }
        return  arr.toString();
    }

    public void swap(StringBuilder arr, int x, int y){
        char temp = arr.charAt(x);
        arr.setCharAt(x, arr.charAt(y));
        arr.setCharAt(y, temp);
    }

    //recursive
    public String reverseStringSec(String s){
        //null or empty check
        if(s == null || s.length() == 0){
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        reverseStringSec(sb, 0, sb.length() - 1);
        return sb.toString();
    }

    public void reverseStringSec(StringBuilder s, int start, int end){
        if(start >= end){
            return;
        }
        swap(s, start, end);
        reverseStringSec(s, start + 1, end - 1);
    }

    public static void main(String[] args){
        reverseString rs = new reverseString();
        String s = "google";
        System.out.println(rs.reverseString(s));
        System.out.println(rs.reverseStringSec(s));
    }
}
