package net.ddns.surveysintegradora.demo.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NonNull
    private String nombre;

    @Column(nullable = false, unique = true)
    private Integer matricula;

    @NonNull
    private Date fechaNacimiento;

    @NonNull
    private String sexo;

    @NonNull
    private String password;

}
