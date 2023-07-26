package com.conversormoneda.principal;

import javax.swing.JOptionPane;

import com.conversormoneda.conversorMoneda.FuncionConvertidoraM;
import com.conversormoneda.conversorTemperatura.FuncionConvertidoraT;

public class Principal {
	
	public static void main(String[] args) {
		
	
		FuncionConvertidoraM monedas = new FuncionConvertidoraM();
        FuncionConvertidoraT temperatura = new FuncionConvertidoraT();
             
        while(true) {
        	
        	String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura","Salir"}, "Seleccion")).toString();
           
        	if (opciones == null || opciones.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Programa terminado");
                break;
            }

        	switch(opciones) {
        	case "Conversor de Moneda":
        		 String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                 if(ValidarNumero(input) == true) {
                     double Minput = Double.parseDouble(input);
                     monedas.ConvertirMonedas(Minput);

                     int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                     if (respuesta != JOptionPane.YES_OPTION) {
                         JOptionPane.showMessageDialog(null, "Programa terminado");
                         break;
                     }
                 } else {
                     JOptionPane.showMessageDialog(null, "Valor inválido");
                 }
                 break;

        	

        	 case "Conversor de Temperatura":
        	 input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
             if(ValidarNumero(input) == true) {
                 double Minput = Double.parseDouble(input);
                 temperatura.ConvertirTemperatura(Minput);

                 int respuesta = 0;
                 respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                 if((respuesta == 0) && (ValidarNumero(input) == true)) { 
                 } else {
                     JOptionPane.showMessageDialog(null, "Programa terminado");                     
                 }

             } else {
                 JOptionPane.showMessageDialog(null, "Valor inválido");                
             }
             break;
        }                
    }
               
  }
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
	

}
	

