public class Stack {
    int elements[];
    int top;

    public Stack(int size){
        elements = new int[size];
        // Posição inválida do vetor
        top = -1;
    }

    public void push (int e){
        if(isFull()){
            throw new RuntimeException("A pilha está cheia!");
        }
        top++;
        elements[top] = e;
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("A pilha está vazia!");
        }
        int e;
        e = elements[top];
        top--;
        return e;
    }

    public boolean isEmpty(){
        // Caso o topo seja igual à -1 retorna True , se não retorna False;
        return ( top == -1 );
    }

    public boolean isFull(){
        return ( top == elements.length - 1);
    }

    public int top(){
        if (isEmpty()){
            throw new RuntimeException("A pilha está vazia!");
        }
        return elements[top];
    }

    public void clear(){
        top = -1;
    }
}
