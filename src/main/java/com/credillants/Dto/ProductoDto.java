package com.credillants.Dto;

import java.sql.Date;

import com.credillants.credillants.Entity.CategoriaEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {
	private Integer idProducto;
    private String nombreProducto;
    //private CategoriaEntity categoria;
    private Integer cantidadProducto;
    private Date duracionProducto;
    private Double precioProducto;
    private Boolean estadoProducto;
}
