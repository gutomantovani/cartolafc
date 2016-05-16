package entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamInfo {

	@JsonProperty("time_id")
	private Integer id;

	@JsonProperty("nome")
	private String name;

	@JsonProperty("nome_cartola")
	private String owner;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("facebook_id")
	private Integer facebookId;

	@JsonProperty("url_escudo_png")
	private String urlEmblemPng;

	@JsonProperty("url_escudo_svg")
	private String urlEmblemSvg;

	@JsonProperty("foto_perfil")
	private String urlPhoto;

	@JsonProperty("assinante")
	private boolean isSubscriber;

	@JsonProperty("clube_id")
	private Integer clubId;

	@JsonProperty("esquema_id")
	private Integer strategyId;

	@JsonProperty("cadun_id")
	private Integer cadunId;

	@JsonProperty("tipo_escudo")
	private Integer emblemTypeId;

	@JsonProperty("cor_fundo_escudo")
	private String emblemBackgroundColor;

	@JsonProperty("cor_borda_escudo")
	private String emblemEdgeColor;

	@JsonProperty("cor_primaria_estampa_escudo")
	private String emblemPrimaryColor;

	@JsonProperty("cor_secundaria_estampa_escudo")
	private String emblemSecondaryColor;

	@JsonProperty("url_camisa_svg")
	private String urlTshirtSvg;

	@JsonProperty("url_camisa_png")
	private String urlTshirtPng;

	@JsonProperty("url_escudo_placeholder_png")
	private String urlEmblemPlaceholderPng;

	@JsonProperty("url_camisa_placeholder_png")
	private String urlTshirtPlaceholderPng;

	@JsonProperty("tipo_estampa_escudo")
	private Integer emblemStampTypeId;

	@JsonProperty("tipo_adorno")
	private Integer emblemAdornmentTypeId;

	@JsonProperty("tipo_camisa")
	private Integer tshirtTypeId;

	@JsonProperty("tipo_estampa_camisa")
	private Integer tshirtStampTypeId;

	@JsonProperty("cor_camisa")
	private String tshirtColor;

	@JsonProperty("cor_primaria_estampa_camisa")
	private String tshirtPrimaryColor;

	@JsonProperty("cor_secundaria_estampa_camisa")
	private String tshirtSecondaryColor;

	@JsonProperty("cadastro_completo")
	private boolean isFullRegister;

	@JsonProperty("patrocinador1_id")
	private Integer sponsor1Id;

	@JsonProperty("patrocinador2_id")
	private Integer sponsor2Id;

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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Integer getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(Integer facebookId) {
		this.facebookId = facebookId;
	}

	public String getUrlEmblemPng() {
		return urlEmblemPng;
	}

	public void setUrlEmblemPng(String urlEmblemPng) {
		this.urlEmblemPng = urlEmblemPng;
	}

	public String getUrlEmblemSvg() {
		return urlEmblemSvg;
	}

	public void setUrlEmblemSvg(String urlEmblemSvg) {
		this.urlEmblemSvg = urlEmblemSvg;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	public boolean isSubscriber() {
		return isSubscriber;
	}

	public void setSubscriber(boolean isSubscriber) {
		this.isSubscriber = isSubscriber;
	}

	public Integer getClubId() {
		return clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public Integer getStrategyId() {
		return strategyId;
	}

	public void setStrategyId(Integer strategyId) {
		this.strategyId = strategyId;
	}

	public Integer getCadunId() {
		return cadunId;
	}

	public void setCadunId(Integer cadunId) {
		this.cadunId = cadunId;
	}

	public Integer getEmblemTypeId() {
		return emblemTypeId;
	}

	public void setEmblemTypeId(Integer emblemTypeId) {
		this.emblemTypeId = emblemTypeId;
	}

	public String getEmblemBackgroundColor() {
		return emblemBackgroundColor;
	}

	public void setEmblemBackgroundColor(String emblemBackgroundColor) {
		this.emblemBackgroundColor = emblemBackgroundColor;
	}

	public String getEmblemEdgeColor() {
		return emblemEdgeColor;
	}

	public void setEmblemEdgeColor(String emblemEdgeColor) {
		this.emblemEdgeColor = emblemEdgeColor;
	}

	public String getEmblemPrimaryColor() {
		return emblemPrimaryColor;
	}

	public void setEmblemPrimaryColor(String emblemPrimaryColor) {
		this.emblemPrimaryColor = emblemPrimaryColor;
	}

	public String getEmblemSecondaryColor() {
		return emblemSecondaryColor;
	}

	public void setEmblemSecondaryColor(String emblemSecondaryColor) {
		this.emblemSecondaryColor = emblemSecondaryColor;
	}

	public String getUrlTshirtSvg() {
		return urlTshirtSvg;
	}

	public void setUrlTshirtSvg(String urlTshirtSvg) {
		this.urlTshirtSvg = urlTshirtSvg;
	}

	public String getUrlTshirtPng() {
		return urlTshirtPng;
	}

	public void setUrlTshirtPng(String urlTshirtPng) {
		this.urlTshirtPng = urlTshirtPng;
	}

	public String getUrlEmblemPlaceholderPng() {
		return urlEmblemPlaceholderPng;
	}

	public void setUrlEmblemPlaceholderPng(String urlEmblemPlaceholderPng) {
		this.urlEmblemPlaceholderPng = urlEmblemPlaceholderPng;
	}

	public String getUrlTshirtPlaceholderPng() {
		return urlTshirtPlaceholderPng;
	}

	public void setUrlTshirtPlaceholderPng(String urlTshirtPlaceholderPng) {
		this.urlTshirtPlaceholderPng = urlTshirtPlaceholderPng;
	}

	public Integer getEmblemStampTypeId() {
		return emblemStampTypeId;
	}

	public void setEmblemStampTypeId(Integer emblemStampTypeId) {
		this.emblemStampTypeId = emblemStampTypeId;
	}

	public Integer getEmblemAdornmentTypeId() {
		return emblemAdornmentTypeId;
	}

	public void setEmblemAdornmentTypeId(Integer emblemAdornmentTypeId) {
		this.emblemAdornmentTypeId = emblemAdornmentTypeId;
	}

	public Integer getTshirtTypeId() {
		return tshirtTypeId;
	}

	public void setTshirtTypeId(Integer tshirtTypeId) {
		this.tshirtTypeId = tshirtTypeId;
	}

	public Integer getTshirtStampTypeId() {
		return tshirtStampTypeId;
	}

	public void setTshirtStampTypeId(Integer tshirtStampTypeId) {
		this.tshirtStampTypeId = tshirtStampTypeId;
	}

	public String getTshirtColor() {
		return tshirtColor;
	}

	public void setTshirtColor(String tshirtColor) {
		this.tshirtColor = tshirtColor;
	}

	public String getTshirtPrimaryColor() {
		return tshirtPrimaryColor;
	}

	public void setTshirtPrimaryColor(String tshirtPrimaryColor) {
		this.tshirtPrimaryColor = tshirtPrimaryColor;
	}

	public String getTshirtSecondaryColor() {
		return tshirtSecondaryColor;
	}

	public void setTshirtSecondaryColor(String tshirtSecondaryColor) {
		this.tshirtSecondaryColor = tshirtSecondaryColor;
	}

	public boolean isFullRegister() {
		return isFullRegister;
	}

	public void setFullRegister(boolean isFullRegister) {
		this.isFullRegister = isFullRegister;
	}

	public Integer getSponsor1Id() {
		return sponsor1Id;
	}

	public void setSponsor1Id(Integer sponsor1Id) {
		this.sponsor1Id = sponsor1Id;
	}

	public Integer getSponsor2Id() {
		return sponsor2Id;
	}

	public void setSponsor2Id(Integer sponsor2Id) {
		this.sponsor2Id = sponsor2Id;
	}

}
