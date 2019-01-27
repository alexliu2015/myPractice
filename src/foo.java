public class foo {
    private static String name = " ";

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static class boo{
        public static void printName(){
            System.out.println(name);
        }
    }
}
