package entity;

import java.util.HashMap;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {

	@JsonProperty("time")
	private TeamInfo teamInfo;

	@JsonProperty("patrimonio")
	private Double patrimony;

	@JsonProperty("esquema_id")
	private Integer strategyId;

	@JsonProperty("pontos")
	private Double score;

	@JsonProperty("valor_time")
	private Double value;

	@JsonProperty("atletas")
	private Athlete[] athletes;

	@JsonProperty("clubes")
	private HashMap<String, Club> clubs;

	public TeamInfo getTeamInfo() {
		return teamInfo;
	}

	public void setTeamInfo(TeamInfo teamInfo) {
		this.teamInfo = teamInfo;
	}

	public Double getPatrimony() {
		return patrimony;
	}

	public void setPatrimony(Double patrimony) {
		this.patrimony = patrimony;
	}

	public Integer getStrategyId() {
		return strategyId;
	}

	public void setStrategyId(Integer strategyId) {
		this.strategyId = strategyId;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Athlete[] getAthletes() {
		return athletes;
	}

	public void setAthletes(Athlete[] athletes) {
		this.athletes = athletes;
	}

	public HashMap<String, Club> getClubs() {
		return clubs;
	}

	public void setClubs(HashMap<String, Club> clubs) {
		this.clubs = clubs;
	}

}
