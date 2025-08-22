import java.util.Random;
public class Box {
	private Object[] elements; 
	private int capacity;	
	private int size;		

	public Box() {
		size=0;
		capacity=5;
		elements=new Aluno[capacity];
	}
	public Box(int capacity) {
		size=0;
		this.capacity=capacity;
		elements=new Object[capacity];
	}

	public boolean estaVazia() {
		return (size==0);
	}
	public void guardeEsteElemento(Object element) {
		aumenteCapacidadeSeNecessario();
		elements[size]=element;
		size++;
	}
	public Object meDeUmElemento() {
		Random gerador=new Random();
		return elements[gerador.nextInt(size)];
	}
	private void aumenteCapacidadeSeNecessario() {
        if  (size==capacity) {
        	Object[] newElements=new Object[capacity*=2];
            for (int i=0;i<size;i++) 
                newElements[i]=elements[i];
            elements=newElements;
        }   
    }
}
