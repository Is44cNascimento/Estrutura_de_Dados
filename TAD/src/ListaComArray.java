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
}


