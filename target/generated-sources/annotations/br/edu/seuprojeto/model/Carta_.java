package br.edu.seuprojeto.model;

import br.edu.seuprojeto.model.Categoria;
import br.edu.seuprojeto.model.Jogador;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-26T11:37:42", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Carta.class)
public class Carta_ { 

    public static volatile ListAttribute<Carta, Jogador> listaJogador;
    public static volatile SingularAttribute<Carta, Integer> ataque;
    public static volatile SingularAttribute<Carta, Integer> raridade;
    public static volatile SingularAttribute<Carta, Categoria> categoria;
    public static volatile SingularAttribute<Carta, String> nome;
    public static volatile SingularAttribute<Carta, Integer> id;
    public static volatile SingularAttribute<Carta, Integer> defesa;

}