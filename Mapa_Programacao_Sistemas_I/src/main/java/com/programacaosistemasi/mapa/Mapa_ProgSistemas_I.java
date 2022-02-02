package com.programacaosistemasi.mapa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Mapa_ProgSistemas_I {
    
    public static void main(String[] args){
        
        
        ArrayList listP = new ArrayList<>();
        Object[] options = { "Sim", "Não" };
        
        while (true) {            
            Paciente p = new Paciente();
        //Dados do Paciente
            String cpf = JOptionPane.showInputDialog("Digite seu CPF: \nDigite SAIR para fechar!");
            p.setCpf(cpf.toUpperCase());
            if (p.getCpf().equals("SAIR")) {
                break;
            }
            p.setNome(JOptionPane.showInputDialog("Digite o seu Nome: "));
            p.setSexo(JOptionPane.showInputDialog("Digite o seu genero: (Masculino/Feminino)"));
            p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: ")));
            
        // Perguntas de Triagem
            int resposta = JOptionPane.showOptionDialog(null, "Tem Febre", "Triagem", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (resposta == JOptionPane.YES_OPTION) {
              p.setPontos(p.getPontos() + 5);
            }
            resposta = JOptionPane.showOptionDialog(null, "Tem Dor de Cabeca?", "Triagem", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (resposta == JOptionPane.YES_OPTION) {
              p.setPontos(p.getPontos()+ 1);
            }
            resposta = JOptionPane.showOptionDialog(null, "Tem secreção nasal ou espirros?", "Triagem", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (resposta == JOptionPane.YES_OPTION) {
              p.setPontos(p.getPontos()+ 1);
            }
            resposta = JOptionPane.showOptionDialog(null, "Tem dor/irritação na garganta?", "Triagem", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (resposta == JOptionPane.YES_OPTION) {
              p.setPontos(p.getPontos()+ 1);
            }
            resposta = JOptionPane.showOptionDialog(null, "Tem tosse seca?", "Triagem", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (resposta == JOptionPane.YES_OPTION) {
              p.setPontos(p.getPontos()+ 3);
            }
            resposta = JOptionPane.showOptionDialog(null, "Tem dificuldade respiratória?", "Triagem", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (resposta == JOptionPane.YES_OPTION) {
              p.setPontos(p.getPontos()+ 10);
            }
            resposta = JOptionPane.showOptionDialog(null, "Tem dores no corpo?", "Triagem", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (resposta == JOptionPane.YES_OPTION) {
              p.setPontos(p.getPontos()+ 1);
            }
            resposta = JOptionPane.showOptionDialog(null, "Tem diarreia?", "Triagem", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (resposta == JOptionPane.YES_OPTION) {
              p.setPontos(p.getPontos()+ 1);
            }
            resposta = JOptionPane.showOptionDialog(null, "Esteve em contato, nos últimos 14 dias, com um caso diagnosticado com COVID-19?", "Triagem", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (resposta == JOptionPane.YES_OPTION) {
              p.setPontos(p.getPontos()+ 10);
            }
            resposta = JOptionPane.showOptionDialog(null, "Esteve em locais com grande aglomeração?", "Triagem", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (resposta == JOptionPane.YES_OPTION) {
              p.setPontos(p.getPontos()+ 3);
            }
            
            listP.add(p);
        // Determinação de Risco
            if (p.getPontos() >= 20){
                p.setRisco("Risco Alto - Dirija-se a Ala 3");
            }
            else if (p.getPontos() > 10){
                p.setRisco("Risco Medio - Dirija-se a Ala 2");
            }
            else{
                p.setRisco("Risco Baixo - Dirija-se a Ala 1");
            }
            JOptionPane.showMessageDialog(null, p.getRisco());                   
        }
    }
}
