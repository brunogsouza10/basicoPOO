package calculadoraEncapsulada;

import java.util.Scanner;

public class Calculadora implements HardwareCalculadora{

	
	private boolean desligado;
	private boolean ligado = false;
	
	
	
	public void status() {
		
		System.out.println("****LÓGICA INTERNA CALCULADORA****");
		ligar();
		
		System.out.println("----------------------------------");
		desligar();
	
		
	}
	
	public void calcular() {
		
		        Scanner scanner = new Scanner(System.in);

		        char respostaCalcular, desejaCalcular = 's'; // Inicialize desejaCalcular como 's'

		        while (desejaCalcular == 's' || desejaCalcular == 'S') {
		            System.out.println("\nDeseja calcular? [s]/[n]: ");
		            desejaCalcular = scanner.next().charAt(0);

		            if (desejaCalcular == 's' || desejaCalcular == 'S') {
		            	
		                System.out.println("[+] -> Adição");
		                System.out.println("[-] -> Subtração");
		                System.out.println("[*] -> Multiplicação");
		                System.out.println("[/] -> Divisão");
		                System.out.println("--------------------------------------------");
		                System.out.println("Digite o símbolo da operação que você deseja executar: ");
		                respostaCalcular = scanner.next().charAt(0);

		                if (respostaCalcular == '+') {
		                	
		                    adicao();
		                    
		                } else if (respostaCalcular == '-') {
		                	
		                    subtracao();
		                    
		                } else if (respostaCalcular == '*') {
		                	
		                    multiplicacao();
		                    
		                } else if (respostaCalcular == '/') {
		                	
		                    divisao();
		                    
		                } else {
		                	
		                    System.out.println("ERRO. Operação inválida!");
		                    
		                }
		                
		            } else if (desejaCalcular == 'n' || desejaCalcular == 'N') {
		            	
		                System.out.println("Programa encerrado.");
		                
		                break; // Encerra o loop se o usuário escolher não calcular
		                
		            } else {
		            	
		                System.out.println("Opção inválida. Tente novamente.");
		            }
		        }
		    }
	
	//CONSTRUTOR
	public Calculadora() {
		super();
		this.desligado = desligado;
		this.ligado = ligado;
		
	}

	//MÉTODOS ACESSORES (GET) E MODIFICADORES (SET)
	


	public boolean isDesligado() {
		return desligado;
	}

	public void setDesligado(boolean desligado) {
		this.desligado = desligado;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	
	//MÉTODOS RELAÇAO INTERFACE
	@Override
	public void ligar() {
		
		Scanner scanner = new Scanner (System.in);
		
		char resposta;
		
		if (this.ligado == false) {
			
			this.ligado = false;
			
		} else {
			
			this.ligado = true;
		}
	
		System.out.println("Deseja ligar a calculadora: ");
		resposta = scanner.next().charAt(0);
		
		if (resposta == 's' || resposta == 'S') {
			
			this.ligado = true;
			
			System.out.println("Calculadora ligada: " + this.isLigado());
			System.out.println("----------------------------------");
			System.out.println("A calculadora está ligada!");
			
		} else {
			
			
			if (resposta == 'n' || resposta == 'N') {
				
			this.ligado = false;	
				
			System.out.println("Calculadora ligada: " + this.isLigado());
			System.out.println("----------------------------------");
			System.out.println("A calculadora está desligada!");
			System.exit(0);
			
		}
			
		}
		
		
	}

	@Override
	public void desligar() {
		
		Scanner scanner = new Scanner (System.in);
		
		char respostaDesligar;
		
		System.out.println("\nDeseja desligar a calculadora: ");
		respostaDesligar = scanner.next().charAt(0);
		
		if (this.isDesligado() == false && respostaDesligar == 's' || respostaDesligar == 'S') {
			
			this.desligado = false;
			
			System.out.println("Calculadora ligada: " + this.isDesligado());
			System.out.println("-------------------------------------");
			System.out.println("A calculadora foi desligada!");
			
		} else {
			
			if (this.isDesligado() == false && respostaDesligar == 'n' || respostaDesligar == 'N') {
				
				this.desligado = true;
				
				System.out.println("Calculadora ligada: " + this.isDesligado());
				System.out.println("-------------------------------------");
				System.out.println("A calculadora continua ligada!");
				
			}
		}
		
		
	}
	
	//ESSES MÉTODOS SAO FUNCOES COM RETORNO

	@Override
	public double adicao() {
		
		System.out.println("****CALCULADORA****");
		
		Scanner scanner = new Scanner (System.in);
		
		double primeiroNumero = 0.0, segundoNumero = 0.0, resultadoAdicao = 0.0;
		
		System.out.println("Digite um número: ");
		primeiroNumero = scanner.nextDouble();
		System.out.println("Digite outro número: ");
		segundoNumero = scanner.nextDouble();
		
		resultadoAdicao = primeiroNumero + segundoNumero;
		
		System.out.printf("O resultado da adição é = " + resultadoAdicao);
		System.out.println("\n--------------------------------------------");
		
		return resultadoAdicao;
		
	}

	@Override
	public double subtracao() {
		
		System.out.println("****CALCULADORA****");
		
		Scanner scanner = new Scanner (System.in);
		
        double primeiroNumero = 0.0, segundoNumero = 0.0, resultadoSubtracao = 0.0;
		
		System.out.println("Digite um número: ");
		primeiroNumero = scanner.nextDouble();
		System.out.println("Digite outro número: ");
		segundoNumero = scanner.nextDouble();
		
		resultadoSubtracao = primeiroNumero - segundoNumero;
		
		System.out.printf("O resultado da subtração é = " + resultadoSubtracao);
		System.out.println("\n--------------------------------------------");
		
		return resultadoSubtracao;
		
		
	}

	@Override
	public double multiplicacao() {
		
        System.out.println("****CALCULADORA****");
		
		Scanner scanner = new Scanner (System.in);
		
        double primeiroNumero = 0.0, segundoNumero = 0.0, resultadoMultiplicacao = 0.0;
		
		System.out.println("Digite um número: ");
		primeiroNumero = scanner.nextDouble();
		System.out.println("Digite outro número: ");
		segundoNumero = scanner.nextDouble();
		
		resultadoMultiplicacao = primeiroNumero * segundoNumero;
		
		System.out.printf("O resultado da multiplicação é = " + resultadoMultiplicacao);
		System.out.println("\n--------------------------------------------");
		
		return resultadoMultiplicacao;
	}

	@Override
	public double divisao() {
		
        System.out.println("****CALCULADORA****");
		
		Scanner scanner = new Scanner (System.in);
		
        double primeiroNumero = 0.0, segundoNumero = 0.0, resultadoDivisao = 0.0;
		
		System.out.println("Digite um número: ");
		primeiroNumero = scanner.nextDouble();
		System.out.println("Digite outro número: ");
		segundoNumero = scanner.nextDouble();
		
		resultadoDivisao = primeiroNumero / segundoNumero;
		
		System.out.printf("O resultado da divisão é = " + resultadoDivisao);
		System.out.println("\n--------------------------------------------");
		
		return resultadoDivisao;
		
	}

}
