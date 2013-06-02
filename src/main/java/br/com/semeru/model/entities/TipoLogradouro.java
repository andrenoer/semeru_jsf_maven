package br.com.semeru.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="tipoLogradouro")
public class TipoLogradouro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idtipoLogradouro, nullable=false")
    private Integer idtipoLogradouro;
    @Column (name="DescricaoTipoLogradouro", length = 80, nullable=false)
    private String descricaoTipoLogradouro;

    @OneToMany(mappedBy="tipoLogradouro", fetch = FetchType.LAZY)
    @ForeignKey(name="EstadoCidade")
    private List<Endereco> enderecos;
    
    public TipoLogradouro() {
    }

    public Integer getIdtipoLogradouro() {
        return idtipoLogradouro;
    }

    public void setIdtipoLogradouro(Integer idtipoLogradouro) {
        this.idtipoLogradouro = idtipoLogradouro;
    }

    public String getDescricaoTipoLogradouro() {
        return descricaoTipoLogradouro;
    }

    public void setDescricaoTipoLogradouro(String descricaoTipoLogradouro) {
        this.descricaoTipoLogradouro = descricaoTipoLogradouro;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.idtipoLogradouro != null ? this.idtipoLogradouro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoLogradouro other = (TipoLogradouro) obj;
        if (this.idtipoLogradouro != other.idtipoLogradouro && (this.idtipoLogradouro == null || !this.idtipoLogradouro.equals(other.idtipoLogradouro))) {
            return false;
        }
        return true;
    }

    
}
