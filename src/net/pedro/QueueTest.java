package net.pedro;

class Queue<T>{
    private T[] elementos;
    private int head = 0, tail = 0;

    public Queue(int Tamanho){
        elementos = (T[]) new Object[Tamanho];
    }

    void insert(T elemento) throws QueueIsFullException{
        if(isFull()){
            throw new QueueIsFullException();
        }
        elementos[tail] = elemento;
        tail = (tail + 1) % elementos.length;
    }

    T remove() throws QueueIsEmptyException{
        if(isEmpty()){
            throw new QueueIsEmptyException();
        }
        T elemento = elementos[head];
        head = (head + 1) % elementos.length;
        return elemento;
    }

    boolean isFull(){
        return (tail + 1) % elementos.length == head;
    }

    boolean isEmpty(){
        return tail == head;
    }
}

class QueueIsFullException extends Exception{}

class QueueIsEmptyException extends Exception{}


public class QueueTest {
    public static void main(String[] args) throws QueueIsEmptyException, QueueIsFullException {
        Queue<String> filaDoBanco = new Queue<String>(6);

        System.out.println("Fila vazia: " + filaDoBanco.isEmpty());
        System.out.println("Fila Cheia: " + filaDoBanco.isFull());

        filaDoBanco.insert("B32");
        filaDoBanco.insert("C64");
        filaDoBanco.insert("B33");
        filaDoBanco.insert("C65");
        filaDoBanco.insert("C66");

        System.out.println("Fila vazia: " + filaDoBanco.isEmpty());
        System.out.println("Fila Cheia: " + filaDoBanco.isFull());

        System.out.println("Chamando: " + filaDoBanco.remove());
        System.out.println("Chamando: " + filaDoBanco.remove());

        System.out.println("Fila vazia: " + filaDoBanco.isEmpty());
        System.out.println("Fila Cheia: " + filaDoBanco.isFull());

        System.out.println("Adicionando: B34");

        filaDoBanco.insert("B34");

        while(!filaDoBanco.isEmpty()){
            System.out.println("Chamando: " + filaDoBanco.remove());
        }

        System.out.println("Fila vazia: " + filaDoBanco.isEmpty());
        System.out.println("Fila Cheia: " + filaDoBanco.isFull());
    }
}
