package polimorfismos;

//NOSSA FORMA, CLASSE ABSTRATA
public abstract class TimeDeFutebol {

	public TimeDeFutebol() {

	}

	protected String nomeTime;
	protected String cores;
	protected int numeroDeJogadores;
	public int disputaCampeonatos;

	public abstract void marcarPartida();

	public abstract void jogar();

	public abstract void ganhouOuPerdeu();

	public abstract void pontuacao();

	public abstract void campeao();

	public String getNomeTime() {
		return nomeTime = "SPFC";
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public String getCores() {
		return cores;
	}

	public void setCores(String cores) {
		this.cores = cores;
	}

	public int getNumeroDeJogadores() {
		return numeroDeJogadores;
	}

	public void setNumeroDeJogadores(int numeroDeJogadores) {
		this.numeroDeJogadores = numeroDeJogadores;
	}

	public int getDisputaCampeonatos() {
		return disputaCampeonatos;
	}

	public void setDisputaCampeonatos(int disputaCampeonatos) {
		this.disputaCampeonatos = disputaCampeonatos;
	}

}
