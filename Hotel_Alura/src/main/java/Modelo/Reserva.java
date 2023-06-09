package Modelo;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservas")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tipoHabitacion;
	private Date fechaEntrada;
	private Date fechaSalida;
	private BigDecimal valor;
	private String formaPago;
		
	@ManyToOne
	private Huesped huesped;

	public Reserva() {}
	
	public Reserva(String tipoHabitacion,Date fechaEntrada, Date fechaSalida, BigDecimal valor, String formaPago) {
		this.tipoHabitacion=tipoHabitacion;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.valor = valor;
		this.formaPago = formaPago;
	}
	
	public Reserva(String tipoHabitacion,Date fechaEntrada, Date fechaSalida, BigDecimal valor, String formaPago, Huesped huesped) {
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.valor = valor;
		this.formaPago = formaPago;
		this.huesped = huesped;
	}
	
	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public Date setFechaEntrada(Date fechaEntrada) {
		return this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public Date setFechaSalida(Date fechaSalida) {
		return this.fechaSalida = fechaSalida;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public Huesped getHuesped() {
		return huesped;
	}

	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}

	public Long getId() {
		return id;
	}
}
