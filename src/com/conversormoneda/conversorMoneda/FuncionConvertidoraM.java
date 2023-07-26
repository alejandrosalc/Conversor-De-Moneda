package com.conversormoneda.conversorMoneda;

import javax.swing.JOptionPane;

public class FuncionConvertidoraM {

	ConvertirMonedasAPesos monedas = new ConvertirMonedasAPesos();
	ConvertirPesosAMonedas pesos = new ConvertirPesosAMonedas();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos a Dólar":
        	pesos.ConvertirPesosADolares(Minput);
        	break;
        case "De Pesos a Euro":
        	pesos.ConvertirPesosAEuros(Minput);
        	break;
        case "De Pesos a Libras":
        	pesos.ConvertirPesosALibras(Minput);
        	break;
        case "De Pesos a Yen":
        	pesos.ConvertirPesosAYen(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	pesos.ConvertirPesosAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	monedas.ConvertirDolaresAPesos(Minput);
        	break;
        case "De Euro a Pesos":
        	monedas.ConvertirEurosAPesos(Minput);
        	break;
        case "De Libras a Pesos":
        	monedas.ConvertirLibrasAPesos(Minput);
        	break;
        case "De Yen a Pesos":
        	monedas.ConvertirYenAPesos(Minput);
        	break;
        case "De Won Coreano a Pesos":
            monedas.ConvertirWonAPesos(Minput);
            break;
        }      
    }
}
