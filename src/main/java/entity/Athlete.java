package entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Athlete {

	@JsonProperty("atleta_id")
	private Integer id;

	@JsonProperty("nome")
	private String name;

	@JsonProperty("apelido")
	private String nickname;

	@JsonProperty("foto")
	private String photo;

	@JsonProperty("rodada_id")
	private Integer round;

	@JsonProperty("clube_id")
	private Integer clubId;

	@JsonProperty("posicao_id")
	private Integer positionId;

	@JsonProperty("status_id")
	private Integer statusId;

	@JsonProperty("pontos_num")
	private Double score;

	@JsonProperty("preco_num")
	private Double value;

	@JsonProperty("variacao_num")
	private Double variation;

	@JsonProperty("media_num")
	private Double average;

	@JsonProperty("jogos_num")
	private Integer matchs;

	@JsonProperty("partida")
	private Match match;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getRound() {
		return round;
	}

	public void setRound(Integer round) {
		this.round = round;
	}

	public Integer getClubId() {
		return clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
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

	public Double getVariation() {
		return variation;
	}

	public void setVariation(Double variation) {
		this.variation = variation;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public Integer getMatchs() {
		return matchs;
	}

	public void setMatchs(Integer matchs) {
		this.matchs = matchs;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

}
