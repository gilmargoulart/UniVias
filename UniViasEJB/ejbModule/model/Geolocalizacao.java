package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Embeddable
public class Geolocalizacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private float geoX;
	@Column
	private float geoY;
	
	
	public float getGeoX() {
		return geoX;
	}
	public void setGeoX(float geoX) {
		this.geoX = geoX;
	}
	public float getGeoY() {
		return geoY;
	}
	public void setGeoY(float geoY) {
		this.geoY = geoY;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
