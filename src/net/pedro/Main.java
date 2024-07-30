package net.pedro;

class Gen<T> {
    T ob;
    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType(){
        System.out.println("Type of the object is "+ ob.getClass().getName());
    }
}


public class Main {
    public static void main(String[] args) {
        Gen<String> linhas = new Gen<String>("Isso é uma String");
        linhas.showType();
        System.out.println(linhas.getOb() + 5);

        Gen<Integer> numero = new Gen<Integer>(23);
        numero.showType();
        System.out.println(numero.getOb() + 5);
    }
}
