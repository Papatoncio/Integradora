package com.edu.utng.surveys.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="profesor")
public class ProfesorModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @JoinColumn(name = "FK_ENCUESTA", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private EncuestaModel idEncuesta;
    
    @Column(nullable=false)
    private String pregunta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public EncuestaModel getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(EncuestaModel idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public ProfesorModel() {
    }

}
