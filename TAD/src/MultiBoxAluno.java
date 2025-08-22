import java.util.Random;
public class MultiBoxAluno {
	private Aluno[] elements; 
	private int capacity;	
	private int size;		

	public MultiBoxAluno() {
		size=0;
		capacity=5;
		elements=new Aluno[capacity];
	}
	public MultiBoxAluno(int capacity) {
		size=0;
		this.capacity=capacity;
		elements=new Aluno[capacity];
	}
	public boolean estaVazia() {
		return (size==0);
	}
	public void guardeEsteAluno(Aluno element) {
		aumenteCapacidadeSeNecessario();
		elements[size]=element;
		size++;
	}
	public Aluno meDeUmAluno() {
		Random gerador=new Random();
		return elements[gerador.nextInt(size)];
	}
	private void aumenteCapacidadeSeNecessario() {
        if  (size==capacity) {
        	Aluno[] newElements=new Aluno[capacity*=2];
            for (int i=0;i<size;i++) 
                newElements[i]=elements[i];
            elements=newElements;
        }   
    }
}
