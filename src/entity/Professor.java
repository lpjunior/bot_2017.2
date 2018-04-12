package entity;

public class Professor extends Pessoa {

	private Double salario;
	private String turno;
	
	// Agrega��o
	private Especializacao titulo;
	
	public Professor() {

	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Especializacao getTitulo() {
		return titulo;
	}

	public void setTitulo(Especializacao titulo) {
		this.titulo = titulo;
	}
	
	@Override
	protected String geraPerfil() {
		return super.geraPerfil()
				+ "\nSal�rio: " 		+ salario
				+ "\nTurno: " 			+ turno
				+ "\nEspecializa��o: " 	+ titulo;
	}
}
