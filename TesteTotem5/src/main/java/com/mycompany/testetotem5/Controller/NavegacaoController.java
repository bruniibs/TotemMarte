package com.mycompany.testetotem5.Controller;

import javax.swing.JDialog;
        
public class NavegacaoController
{
    
    //metodo de troca de tela
    public static void trocarTela(JDialog telaAtual, JDialog proximaTela) {
        telaAtual.dispose(); //fecha a tela atual
        proximaTela.setVisible(true); //abre a proxima tela
    }
}
