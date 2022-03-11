package com.practica01.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_estado;
    private String nombre;
    private String capital;
    private String poblacion;
    private String costas;
    
    
    public Estado() {
    
    }

    public Estado(Long Id_estado, String nombre, String capital, String población, String costas) {
        this.Id_estado = Id_estado;
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }
}
