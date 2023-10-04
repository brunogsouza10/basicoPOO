package RelacaoEntreClasses;

public class Lutador {
	
	//ATRIBUTOS
	private String nome;
	private String nacionalidade;
	private int idade;
	private double peso;
	private double altura;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	//MÉTODOS
	public void apresentar() {
		
		System.out.println("====UFC====");
		System.out.println("CHEGOU A HORA! APRESENTAMOS O LUTADOR: " + this.getNome());
		System.out.println("Diretamente do[a] " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos.");
		System.out.println(this.getAltura() + " m de altura.");
		System.out.println("Pesando " + this.getPeso() + " kg.");
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: " + this.getEmpates());
		System.out.println("---------------------------");
		
		
	}

	public void status() {
		System.out.println("---------------------------");
		System.out.println(this.getNome());
		System.out.println(" é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println("---------------------------");
	}
	
	public void ganharLuta() {
		setVitorias(getVitorias()); //pega vitórias(get) +1 e (set)modifica vitórias
		this.vitorias = this.vitorias + 1;
	}
	
	public void perderLuta() {
		setDerrotas(getDerrotas());
		this.setDerrotas(this.getDerrotas() +1);
	}
	
	public void empatarLuta() {
		setEmpates(this.getEmpates()+1);
		
	}
	//MÉTODOS ESPECIAIS 
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias,
			int derrotas, int empates) {
		
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);//muda
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}
	
	 public void setPeso(double peso) {
			this.peso = peso;//este peso recebe peso
			this.setCategoria();//este seleciona a categoria levando em conta o peso
			
		}
	 
	 public double getPeso() {
			return peso;
		}

	private void setCategoria() {
		
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		}
		else if(this.peso <= 70.3){
			this.categoria = "Leve";
		}
		else if(this.peso <= 83.9) {
			this.categoria = "Médio";
		}
		else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}
		else {
			this.categoria = "Inválido!";
		}
		
	}
	
 

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
			                  
	
	
}
