package com.mycompany.teste;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args){
        
       
       Object[] options = { "Sim, sim, claro...", "Não, explica de novo." };
        int n = JOptionPane.showOptionDialog(null,
				"Você entendeu este exemplo ? ",
				"Exemplo", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    
        String valor1 = JOptionPane.showInputDialog("Digite o valor 1:");
        String operacao = JOptionPane.showInputDialog("Digite a operacao:(+ - * /)");
        String valor2 = JOptionPane.showInputDialog("Digite o valor 2:");
        double resultado = 0.0;
      
        switch (operacao) {
            case "+":
                resultado = Integer.parseInt(valor1) + Integer.parseInt(valor2);
                JOptionPane.showMessageDialog(null, "O resultado da operacao " + valor1 +""+ operacao + "" + valor2 + "= " + resultado);
                break;
            case "-":
                resultado = Integer.parseInt(valor1) - Integer.parseInt(valor2);
                JOptionPane.showMessageDialog(null, "O resultado da operacao " + valor1 +""+ operacao + "" + valor2 + "= " + resultado);
                break;
            case "*":
                resultado = Integer.parseInt(valor1) * Integer.parseInt(valor2);
                JOptionPane.showMessageDialog(null, "O resultado da operacao " + valor1 +""+ operacao + "" + valor2 + "= " + resultado);
                break;
            case "/":
                if("0".equals(valor2)){
                    JOptionPane.showMessageDialog(null, "Não é possivel realizar divisao por zero!");
                    break;
                }
                else{
                    resultado = Integer.parseInt(valor1) / Integer.parseInt(valor2);
                    JOptionPane.showMessageDialog(null, "O resultado da operacao " + valor1 +""+ operacao + "" + valor2 + "= " + resultado);
                }
            default:
                JOptionPane.showMessageDialog(null, "Operador Invalido!");
                break;
        }     
    }
      
}
