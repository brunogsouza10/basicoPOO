package heranca;// de diferença

public final class Técnico extends Aluno {
	
	private int registroProfissional;
	
	public void praticar() {
		System.out.println(this.getNome() + " pratica a arte da guerra");
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

}
