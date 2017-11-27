
public class Vet {

	public static void main(String[] args) {

		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov","Dez"};
        String tdias[] = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
		for (int i=0; i<=mes.length-1;i++) { //de 0 até o tamanho do vetor
			System.out.println("O mês de "+mes[i]+" tem "+ tdias[i]+ " dias." );
		}
	}

}
