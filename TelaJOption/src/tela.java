import javax.swing.JOptionPane;
public class tela {

	public static void main(String[] args) {
      int n,maiorcem = 0, par = 0, impar =0 , s = 0;
     
      
      do {
		n = Integer.parseInt(JOptionPane.showInputDialog(null, 
				"<html><em>Informe um número (digite 0 para sair)</em></html>"));
		s+=n;
		
		if (n % 2 == 0) {
	    	par++ ;
	      }else
	    	 impar++;
		
		if ( n >= 100) {
			maiorcem++;
		}
		
      } while( n != 0);
      
     
      JOptionPane.showMessageDialog(null, "<html> Resultado final <hr>"+
      	                           "<br> Soma total dos números digitados é             " + s + 
      	                           "<br> Qtd de números pares é   " + par + 
      	                           "<br> Qtd de números impares é " + impar +
                                   "<br> Total de números >= 100 foram:  " + maiorcem + "</html>");;
      
 }
}