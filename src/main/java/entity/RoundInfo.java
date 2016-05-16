package entity;

import org.codehaus.jackson.annotate.JsonProperty;

public class RoundInfo {

	@JsonProperty("rodada_id")
	private Integer id;

	@JsonProperty("inicio")
	private String startDate;

	@JsonProperty("fim")
	private String endDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
