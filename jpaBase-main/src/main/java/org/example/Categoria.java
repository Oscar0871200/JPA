package org.example;
import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
@Entity
@Table (name="Categoria")
public class Categoria implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name= "denominacion")
    private String denominacion;

    @ManyToMany(mappedBy = "categoria")
    private List<Articulo> articulos = new ArrayList<Articulo>();

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
}

