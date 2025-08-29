public class ListaComArray {

    private object[] elements;
    private int size;
    private int capacity;


    public ListaComArray() {
        capacity=5;
        elements = new object[capacity];
        size=0;
    }

    public ListaComArray(int capacity) {
        this.capacity=capacity;
        elements = new object[capacity];
        size=0;
    }

    public int size(){
        return size;
    }

    public void print(){
        if (size==0){
            System.out.println("<---Lista Vazia--->");
        }else{
            System.out.println("<---Inicio--->");
            for(int i=0;i<size;i++){
                System.out.println(elements[i]);
                System.out.println("<---Fim--->");
            }
        }
    }


    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else {
            return false;
        }
    }


    public void add(Object element ){
        
    }

        public int indexOf(Object element){
                for(int i=0;i<size;i++){
                    if(element.equals(element)){
                        return i;
                    }
                    return -1;
                }
        }

        public void aumentarCacidadeSeNecessario(){
        if(size==capacity){
            Object[] newElements = new Object[capacity*2];
            for(int i=0;i<size;i++){
                newElements[i]=elements[i];
                elements= newElements;
            }
        }
        }
}


