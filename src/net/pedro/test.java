package net.pedro;

public class test {
    public static void main(String[] args) {
        int []array = new int[5];
        System.out.println(array.length);
        int j = 0;
        for(int i=0;i<5;i++){
            j++;
            array[i]=j;
        }
        for(int i:array){
            System.out.println(i);
        }
    }
}
