/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import br.edu.seuprojeto.control.PersistenciaJPA;
import br.edu.seuprojeto.model.Carta;
import br.edu.seuprojeto.model.Categoria;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20221PF.CC0008
 */
public class TesteConexao {
    
    public TesteConexao() {
    }
    
   private PersistenciaJPA jpa;
@Before
public void setUp() {
	jpa = new PersistenciaJPA();
	System.out.println("Iniciando teste de conexão...");
}

@After
public void tearDown() {
	if (jpa != null && jpa.conexaoAberta()) {
		jpa.fecharConexao();
		System.out.println("Conexão fechada com sucesso.");
	}
}

@Test
public void testeConexaoAberta() {
	assertNotNull("Instância JPA não pode ser nula", jpa);
	assertTrue("A conexão deveria estar aberta", jpa.conexaoAberta());
	System.out.println("Conexão aberta com sucesso!");
}

 @Test
    public void cadastroCartas(){
        try {
            Carta c = new Carta();
            c.setNome("Escudo Ferro");
            c.setAtaque(0);
            c.setDefesa(50);
            c.setCategoria(Categoria.ARMADURA);
            jpa.persist(c);
        } catch (Exception ex) {
            System.err.println("Erro ao persistir Carta: "+ex);   
        }
        ArrayList<Carta> listaCartas = (ArrayList)jpa.getCartas();
        if(listaCartas.isEmpty()){
            System.out.println("Não há cartas cadastradas");
        }
        for(Carta c: listaCartas){
            System.out.println(c.getNome() +"- ataque: "+c.getAtaque()+" - defesa: "+c.getDefesa());
        }
    }
}
