package entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class League {

	@JsonProperty("liga_id")
	private Integer id;

	@JsonProperty("nome")
	private String name;

	@JsonProperty("descricao")
	private String description;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("imagem")
	private String urlEmblem;

	@JsonProperty("quantidade_times")
	private Integer teams;

	@JsonProperty("mata_mata")
	private boolean isPlayoff;

	@JsonProperty("tipo")
	private String type;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getUrlEmblem() {
		return urlEmblem;
	}

	public void setUrlEmblem(String urlEmblem) {
		this.urlEmblem = urlEmblem;
	}

	public Integer getTeams() {
		return teams;
	}

	public void setTeams(Integer teams) {
		this.teams = teams;
	}

	public boolean isPlayoff() {
		return isPlayoff;
	}

	public void setPlayoff(boolean isPlayoff) {
		this.isPlayoff = isPlayoff;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
