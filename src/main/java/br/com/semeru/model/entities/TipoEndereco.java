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
@Table(name="tipoEndereco")
public class TipoEndereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idtipoEndereco, nullable=false")
    private Integer idtipoEndereco;
    @Column (name="DescricaoTipoEndereco", length = 80, nullable=false)
    private String descricaoTipoEndereco;

    @OneToMany(mappedBy = "tipoendereco", fetch = FetchType.LAZY)
    @ForeignKey(name="Endereco_Tipoendereco")
    private List<Endereco> enderecos;
    
    public TipoEndereco() {
    }

    public Integer getIdtipoEndereco() {
        return idtipoEndereco;
    }

    public void setIdtipoEndereco(Integer idtipoEndereco) {
        this.idtipoEndereco = idtipoEndereco;
    }

    public String getDescricaoTipoEndereco() {
        return descricaoTipoEndereco;
    }

    public void setDescricaoTipoEndereco(String descricaoTipoEndereco) {
        this.descricaoTipoEndereco = descricaoTipoEndereco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.idtipoEndereco != null ? this.idtipoEndereco.hashCode() : 0);
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
        final TipoEndereco other = (TipoEndereco) obj;
        if (this.idtipoEndereco != other.idtipoEndereco && (this.idtipoEndereco == null || !this.idtipoEndereco.equals(other.idtipoEndereco))) {
            return false;
        }
        return true;
    }
    
    
}