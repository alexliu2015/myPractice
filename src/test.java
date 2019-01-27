public class test {
    public static void main(String[] args){
        foo f = new foo();
        f.setName("alex");
        System.out.println(f.getName());
        foo.boo b = new foo.boo();
        b.printName();
    }
}
