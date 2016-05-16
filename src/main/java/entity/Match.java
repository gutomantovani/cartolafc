package entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {

	@JsonProperty("clube_casa_id")
	private Integer homeClubId;

	@JsonProperty("clube_casa_posicao")
	private Integer homeClubPosition;

	@JsonProperty("clube_visitante_id")
	private Integer visitingClubId;

	@JsonProperty("clube_visitante_posicao")
	private Integer visitingClubPosition;

	@JsonProperty("partida_data")
	private String date;

	@JsonProperty("local")
	private String location;

	@JsonProperty("valida")
	private boolean isValid;

	public Integer getHomeClubId() {
		return homeClubId;
	}

	public void setHomeClubId(Integer homeClubId) {
		this.homeClubId = homeClubId;
	}

	public Integer getHomeClubPosition() {
		return homeClubPosition;
	}

	public void setHomeClubPosition(Integer homeClubPosition) {
		this.homeClubPosition = homeClubPosition;
	}

	public Integer getVisitingClubId() {
		return visitingClubId;
	}

	public void setVisitingClubId(Integer visitingClubId) {
		this.visitingClubId = visitingClubId;
	}

	public Integer getVisitingClubPosition() {
		return visitingClubPosition;
	}

	public void setVisitingClubPosition(Integer visitingClubPosition) {
		this.visitingClubPosition = visitingClubPosition;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

}