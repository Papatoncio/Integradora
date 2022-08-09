package net.ddns.surveysintegradora.demo.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class EncuestaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEncuesta;

    @NonNull
    private String nombreEncuesta;

    @NonNull
    private LocalDateTime fechaCreacion;
}
