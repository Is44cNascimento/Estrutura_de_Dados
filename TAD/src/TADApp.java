
public class TADApp {

	public static void main(String[] args) {

		// IntBox 
		IntBox minhaCaixa=new IntBox();    
		System.out.println("O número guardado na caixa é "+minhaCaixa.meDeONumero());
		minhaCaixa.guardeEsteNumero(7);    
		System.out.println("O número guardado na caixa é "+minhaCaixa.meDeONumero());    
		IntBox minhaOutraCaixa=new IntBox(10);     
		System.out.println("O número guardado na caixa é "+minhaOutraCaixa.meDeONumero());
		minhaOutraCaixa.guardeEsteNumero(12);    
		System.out.println("O número guardado na caixa é "+minhaOutraCaixa.meDeONumero());  

		
		
/*
		
		// MultiBox
	    MultiBox minhaMultiCaixa= new MultiBox();
	    if (minhaMultiCaixa.estaVazia()) 
	    	System.out.println("Caixa Vazia");
	    else 
	    	System.out.println("Um dos números guardado na multicaixa é "+minhaMultiCaixa.meDeUmNumero());
	    
	    for (int i=0;i<100;i++) {
	        minhaMultiCaixa.guardeEsteNumero(i);          
	    }  
	    if (minhaMultiCaixa.estaVazia()) 
	    	System.out.println("Caixa Vazia");
	    else 
	    	System.out.println("Um dos números guardado na multicaixa é "+minhaMultiCaixa.meDeUmNumero());		
	    	
/*
		// MultiBoxAluno
	    MultiBoxAluno minhaMultiCaixaAluno= new MultiBoxAluno();   
	    if (minhaMultiCaixaAluno.estaVazia()) 
	    	System.out.println("Caixa Vazia");
	    else 
	    	System.out.println("Um dos alunos guardado na multicaixa é "+minhaMultiCaixaAluno.meDeUmAluno());

	    // colocando alguns alunos na caixa
	    minhaMultiCaixaAluno.guardeEsteAluno(new Aluno("Jesus"));
	    minhaMultiCaixaAluno.guardeEsteAluno(new Aluno("José"));
	    minhaMultiCaixaAluno.guardeEsteAluno(new Aluno("Maria"));
	    minhaMultiCaixaAluno.guardeEsteAluno(new Aluno("João"));
	    minhaMultiCaixaAluno.guardeEsteAluno(new Aluno("Pedro"));
	    minhaMultiCaixaAluno.guardeEsteAluno(new Aluno("Judas"));    
	    
	    if (minhaMultiCaixaAluno.estaVazia()) 
	    	System.out.println("Caixa Vazia");
	    else 
	    	System.out.println("Um dos alunos guardado na multicaixa é "+minhaMultiCaixaAluno.meDeUmAluno().getNome());		
		
		/*
		// Box "Genérica"
	    Box minhaCaixa= new Box();   
	    // colocando alguns alunos na caixa
	    minhaCaixa.guardeEsteElemento(new Aluno("Jesus"));
	    minhaCaixa.guardeEsteElemento(new Aluno("José"));
	    minhaCaixa.guardeEsteElemento(new Aluno("Maria"));
	    minhaCaixa.guardeEsteElemento(new Aluno("João"));
	    minhaCaixa.guardeEsteElemento(new Aluno("Pedro"));
	    minhaCaixa.guardeEsteElemento(new Aluno("Judas"));    
	    
	    if (minhaCaixa.estaVazia()) 
	    	System.out.println("Caixa Vazia");
	    else {
	    	Aluno a=(Aluno)minhaCaixa.meDeUmElemento();
	    	System.out.println("Um dos alunos guardado na multicaixa é "+a.getNome());		
	    }
	    */
	}
}

