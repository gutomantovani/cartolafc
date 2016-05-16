package entity;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Club {

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("nome")
	private String name;

	@JsonProperty("abreviacao")
	private String abbreviation;

	@JsonProperty("posicao")
	private Integer position;

	@JsonProperty("escudos")
	private Map<String, String> emblem;

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

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Map<String, String> getEmblem() {
		return emblem;
	}

	public void setEmblem(Map<String, String> emblem) {
		this.emblem = emblem;
	}

}
