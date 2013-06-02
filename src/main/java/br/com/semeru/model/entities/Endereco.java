package br.com.semeru.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="edndereco")
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idEndereco", nullable = false)
    private Integer idEndereco;
    @Column(name="Bairro", length = 80)
    private String bairro;
    @Column(name="nomeDoLogradouro", length = 200)
    private String nomeDoLogradouro;
    @Column(name="CEP", length = 9)
    private String cep;
    @Column(name="Numero")
    private Integer numero;
    @Column(name="Complemento", length = 80)
    private String complemento;
    

}
