package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Eventos_Detalles_Anios80")
 public class EventosDetallesAnios80 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="id_evento_detalle")
	private EventosDetalles eventosDetalles;
	
	@Column(name="color1")
	private int color1;
	@Column(name="color2")
	private int color2;
	@Column(name="color3")
	private int color3;
	@Column(name="color4")
	private int color4;
	@Column(name="color5")
	private int color5;
	@Column(name="color6")
	private int color6;
	@Column(name="color7")
	private int color7;
	@Column(name="color8")
	private int color8;
	@Column(name="color9")
	private int color9;
	@Column(name="color10")
	private int color10;
	@Column(name="juego1")
	private int juego1;
	@Column(name="juego2")
	private int juego2;
	@Column(name="juego3")
	private int juego3;
	@Column(name="juego4")
	private int juego4;
	@Column(name="juego5")
	private int juego5;
	@Column(name="juego6")
	private int juego6;
	@Column(name="juego7")
	private int juego7;
	@Column(name="juego8")
	private int juego8;
	@Column(name="juego9")
	private int juego9;
	@Column(name="juego10")
	private int juego10;
	@Column(name="prob_color")
	private Double probColor;
	@Column(name="prob_juego")
	private Double probJuego;
	@Column(name="prob_total")
	private Double probTotal;
	
	
	@Autowired
	public EventosDetallesAnios80 (EventosDetalles eventosDetalles) {
		this.eventosDetalles = eventosDetalles;
	}
	
		
	public EventosDetallesAnios80() {
		
	}

	public EventosDetallesAnios80(EventosDetallesAnios80 eventosDetallesAnios80) {
		
	}
	
	public EventosDetallesAnios80(int color1, int color2, int color3, int color4,
			int color5, int color6, int color7, int color8, int color9, int color10, int juego1, int juego2, int juego3,
			int juego4, int juego5, int juego6, int juego7, int juego8, int juego9, int juego10, Double probColor,
			Double probJuego, Double probTotal) {
		this.color1 = color1;
		this.color2 = color2;
		this.color3 = color3;
		this.color4 = color4;
		this.color5 = color5;
		this.color6 = color6;
		this.color7 = color7;
		this.color8 = color8;
		this.color9 = color9;
		this.color10 = color10;
		this.juego1 = juego1;
		this.juego2 = juego2;
		this.juego3 = juego3;
		this.juego4 = juego4;
		this.juego5 = juego5;
		this.juego6 = juego6;
		this.juego7 = juego7;
		this.juego8 = juego8;
		this.juego9 = juego9;
		this.juego10 = juego10;
		this.probColor = probColor;
		this.probJuego = probJuego;
		this.probTotal = probTotal;
	}
	
	
	public EventosDetallesAnios80(EventosDetalles eventosDetalles, int color1, int color2, int color3, int color4,
			int color5, int color6, int color7, int color8, int color9, int color10, int juego1, int juego2, int juego3,
			int juego4, int juego5, int juego6, int juego7, int juego8, int juego9, int juego10, Double probColor,
			Double probJuego, Double probTotal) {
		this.eventosDetalles = eventosDetalles;
		this.color1 = color1;
		this.color2 = color2;
		this.color3 = color3;
		this.color4 = color4;
		this.color5 = color5;
		this.color6 = color6;
		this.color7 = color7;
		this.color8 = color8;
		this.color9 = color9;
		this.color10 = color10;
		this.juego1 = juego1;
		this.juego2 = juego2;
		this.juego3 = juego3;
		this.juego4 = juego4;
		this.juego5 = juego5;
		this.juego6 = juego6;
		this.juego7 = juego7;
		this.juego8 = juego8;
		this.juego9 = juego9;
		this.juego10 = juego10;
		this.probColor = probColor;
		this.probJuego = probJuego;
		this.probTotal = probTotal;
	}


	public EventosDetallesAnios80(int id, EventosDetalles eventosDetalles, int color1, int color2, int color3,
			int color4, int color5, int color6, int color7, int color8, int color9, int color10, int juego1, int juego2,
			int juego3, int juego4, int juego5, int juego6, int juego7, int juego8, int juego9, int juego10,
			Double probColor, Double probJuego, Double probTotal) {
		this.id = id;
		this.eventosDetalles = eventosDetalles;
		this.color1 = color1;
		this.color2 = color2;
		this.color3 = color3;
		this.color4 = color4;
		this.color5 = color5;
		this.color6 = color6;
		this.color7 = color7;
		this.color8 = color8;
		this.color9 = color9;
		this.color10 = color10;
		this.juego1 = juego1;
		this.juego2 = juego2;
		this.juego3 = juego3;
		this.juego4 = juego4;
		this.juego5 = juego5;
		this.juego6 = juego6;
		this.juego7 = juego7;
		this.juego8 = juego8;
		this.juego9 = juego9;
		this.juego10 = juego10;
		this.probColor = probColor;
		this.probJuego = probJuego;
		this.probTotal = probTotal;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public EventosDetalles getEventosDetalles() {
		return eventosDetalles;
	}


	public void setEventosDetalles(EventosDetalles eventosDetalles) {
		this.eventosDetalles = eventosDetalles;
	}


	public int getColor1() {
		return color1;
	}


	public void setColor1(int color1) {
		this.color1 = color1;
	}


	public int getColor2() {
		return color2;
	}


	public void setColor2(int color2) {
		this.color2 = color2;
	}


	public int getColor3() {
		return color3;
	}


	public void setColor3(int color3) {
		this.color3 = color3;
	}


	public int getColor4() {
		return color4;
	}


	public void setColor4(int color4) {
		this.color4 = color4;
	}


	public int getColor5() {
		return color5;
	}


	public void setColor5(int color5) {
		this.color5 = color5;
	}


	public int getColor6() {
		return color6;
	}


	public void setColor6(int color6) {
		this.color6 = color6;
	}


	public int getColor7() {
		return color7;
	}


	public void setColor7(int color7) {
		this.color7 = color7;
	}


	public int getColor8() {
		return color8;
	}


	public void setColor8(int color8) {
		this.color8 = color8;
	}


	public int getColor9() {
		return color9;
	}


	public void setColor9(int color9) {
		this.color9 = color9;
	}


	public int getColor10() {
		return color10;
	}


	public void setColor10(int color10) {
		this.color10 = color10;
	}


	public int getJuego1() {
		return juego1;
	}


	public void setJuego1(int juego1) {
		this.juego1 = juego1;
	}


	public int getJuego2() {
		return juego2;
	}


	public void setJuego2(int juego2) {
		this.juego2 = juego2;
	}


	public int getJuego3() {
		return juego3;
	}


	public void setJuego3(int juego3) {
		this.juego3 = juego3;
	}


	public int getJuego4() {
		return juego4;
	}


	public void setJuego4(int juego4) {
		this.juego4 = juego4;
	}


	public int getJuego5() {
		return juego5;
	}


	public void setJuego5(int juego5) {
		this.juego5 = juego5;
	}


	public int getJuego6() {
		return juego6;
	}


	public void setJuego6(int juego6) {
		this.juego6 = juego6;
	}


	public int getJuego7() {
		return juego7;
	}


	public void setJuego7(int juego7) {
		this.juego7 = juego7;
	}


	public int getJuego8() {
		return juego8;
	}


	public void setJuego8(int juego8) {
		this.juego8 = juego8;
	}


	public int getJuego9() {
		return juego9;
	}


	public void setJuego9(int juego9) {
		this.juego9 = juego9;
	}


	public int getJuego10() {
		return juego10;
	}


	public void setJuego10(int juego10) {
		this.juego10 = juego10;
	}


	public Double getProbColor() {
		return probColor;
	}


	public void setProbColor(Double probColor) {
		this.probColor = probColor;
	}


	public Double getProbJuego() {
		return probJuego;
	}


	public void setProbJuego(Double probJuego) {
		this.probJuego = probJuego;
	}


	public Double getProbTotal() {
		return probTotal;
	}


	public void setProbTotal(Double probTotal) {
		this.probTotal = probTotal;
	}


	@Override
	public String toString() {
		return "EventosDetallesAnios80 [id=" + id + ", eventosDetalles=" + eventosDetalles + ", color1=" + color1
				+ ", color2=" + color2 + ", color3=" + color3 + ", color4=" + color4 + ", color5=" + color5
				+ ", color6=" + color6 + ", color7=" + color7 + ", color8=" + color8 + ", color9=" + color9
				+ ", color10=" + color10 + ", juego1=" + juego1 + ", juego2=" + juego2 + ", juego3=" + juego3
				+ ", juego4=" + juego4 + ", juego5=" + juego5 + ", juego6=" + juego6 + ", juego7=" + juego7
				+ ", juego8=" + juego8 + ", juego9=" + juego9 + ", juego10=" + juego10 + ", probColor=" + probColor
				+ ", probJuego=" + probJuego + ", probTotal=" + probTotal + "]";
	}

	
		
}
