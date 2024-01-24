package com.myshoppingcart.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;

    //Unidireccional usuario - compra
//    @ManyToOne()
//    @JoinColumn(name = "user_id")
    //Bidireccional usuario - usuario
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private Usuario usuario;

    @Transient
    private List<Producto> productos;
    private LocalDate fecha;
}
