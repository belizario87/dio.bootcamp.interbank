package br.com.bootcampdio.exceptions;

import javax.swing.JOptionPane;

public class UncheckedException {
    
    public static int dividir(int a, int b){
        return a/ b;
    }

    
    
    public static void main(String[] args) {

        
       boolean forLoop = true;
       
       do {
        
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                forLoop = false;

                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Insira um numero do tipo inteiro");
                
                
            } catch (ArithmeticException e) {
                JOptionPane.showConfirmDialog(null, "O numero nao pode ser divisivel por zero, insira outro numero");
            }

       } while (forLoop);

    }
       
       
        
        
        


           
        

        



}
