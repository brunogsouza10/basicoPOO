package F1;

public abstract class Automóvel implements PainelInteligente {

	protected String marcaDoCarro;
	protected int anoFabricacao;
	protected String nomeEquipe;
	protected String nomePiloto;
	protected String cor;
	

	@Override
	public abstract void acelerar();
  
	@Override
	public abstract void freiar();

	@Override
	public abstract void parar();

	@Override
	public abstract void trocarPneu();

	public Automóvel(String marcaDoCarro, int anoFabricacao, String nomeEquipe, String nomePiloto, String cor) {
		super();
		this.marcaDoCarro = marcaDoCarro;
		this.anoFabricacao = anoFabricacao;
		this.nomeEquipe = nomeEquipe;
		this.nomePiloto = nomePiloto;
		this.cor = cor;
		
	}

	public String getNomePiloto() {
		return nomePiloto;
	}

	public void setNomePiloto(String nomePiloto) {
		this.nomePiloto = nomePiloto;
	}

	public String getMarcaDoCarro() {
		return marcaDoCarro;
	}

	public void setMarcaDoCarro(String marcaDoCarro) {
		this.marcaDoCarro = marcaDoCarro;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getNomeEquipe() {
		return nomeEquipe;
	}

	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
	public String toString() {
		return "Automóvel [marcaDoCarro=" + marcaDoCarro + ", anoFabricacao=" + anoFabricacao + ", nomeEquipe="
				+ nomeEquipe + ", nomePiloto=" + nomePiloto + ", cor=" + cor + "]";
	}

}
