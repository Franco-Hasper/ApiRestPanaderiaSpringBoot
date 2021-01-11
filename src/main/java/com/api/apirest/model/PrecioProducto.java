package com.api.apirest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="precio__productos")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class PrecioProducto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer productoId;
	private Double precio_bruto;
	private Date fecha;
	private Double precio_total;
	private Integer codigo_iva;
	private Integer estadoId;
	
	public PrecioProducto() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductoId() {
		return productoId;
	}

	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}

	public Double getPrecio_bruto() {
		return precio_bruto;
	}

	public void setPrecio_bruto(Double precio_bruto) {
		this.precio_bruto = precio_bruto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getPrecio_total() {
		return precio_total;
	}

	public void setPrecio_total(Double precio_total) {
		this.precio_total = precio_total;
	}

	public Integer getCodigo_iva() {
		return codigo_iva;
	}

	public void setCodigo_iva(Integer codigo_iva) {
		this.codigo_iva = codigo_iva;
	}

	public Integer getEstadoId() {
		return estadoId;
	}

	public void setEstadoId(Integer estadoId) {
		this.estadoId = estadoId;
	}

	@Override
	public String toString() {
		return "PrecioProducto [id=" + id + ", productoId=" + productoId + ", precio_bruto=" + precio_bruto + ", fecha="
				+ fecha + ", precio_total=" + precio_total + ", codigo_iva=" + codigo_iva + ", estadoId=" + estadoId
				+ "]";
	}
	
	

}
