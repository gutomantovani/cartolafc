package entity;

import java.util.HashMap;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Round {

	@JsonProperty("rodada")
	private Integer round;

	@JsonProperty("partidas")
	private Match[] matchs;

	@JsonProperty("clubes")
	private HashMap<String, Club> clubs;

	public Integer getRound() {
		return round;
	}

	public void setRound(Integer round) {
		this.round = round;
	}

	public Match[] getMatchs() {
		return matchs;
	}

	public void setMatchs(Match[] matchs) {
		this.matchs = matchs;
	}

	public HashMap<String, Club> getClubs() {
		return clubs;
	}

	public void setClubs(HashMap<String, Club> clubs) {
		this.clubs = clubs;
	}

}
