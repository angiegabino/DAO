
package com.gabino.controller;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;


@Entity
@Table(name = "direccion")

public class Direccion implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    
    @Column(name = "ID_DIRECCION")
    private Integer idDireccion;
    @Size(max = 250)
    
    @Column(name = "CALLE")
    private String calle;
    
    @Column(name = "CP")
    private Integer cp;
    @Size(max = 200)
    
    @Column(name = "COLONIA")
    private String colonia;
    @Size(max = 200)
    
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @JsonIgnore
    @ManyToOne
    
    private Usuario idUsuario;

    public Direccion() {
    }

    public Direccion(String calle, Integer cp, String colonia, String estado) {
        this.calle = calle;
        this.cp = cp;
        this.colonia = colonia;
        this.estado = estado;
    }
    

    public Direccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDireccion != null ? idDireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.idDireccion == null && other.idDireccion != null) || (this.idDireccion != null && !this.idDireccion.equals(other.idDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gabino.controller.Direccion[ idDireccion=" + idDireccion + " ]";
    }
    
}
