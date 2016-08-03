package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Geolocalizacao {
	
	
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

}
