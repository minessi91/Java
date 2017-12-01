
public class Carro {

	//ATRIBUTOS
		String marca;
		String modelo;
		String cor;
		int valor;
		boolean vendido;
		
	//METODOS
		void status() {
			System.out.println("Um carro da marca: "+this.marca);
			System.out.println("Um carro do modelo: "+ this.modelo);
			System.out.println("Um carro na cor: "+this.cor);
			System.out.println("Qual o valor do carro "+this.modelo+ " ? "+this.valor);
			
			if (this.vendido == true) {
				System.out.println("Está vendido");
			} else {
				System.out.println("Pode comprar");
			}
			
		}
		
		/*void vender() {
			this.vendido = true;
			
		}
		
		void comprar() {
			this.vendido = false;
			
		}*/
	

	}

