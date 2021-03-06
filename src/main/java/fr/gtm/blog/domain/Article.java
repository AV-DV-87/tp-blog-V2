package fr.gtm.blog.domain;

import java.io.Serializable;

/**
 * Classe d'entité POJO représentant une donnée d'article de blog.
 */
public class Article implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String title;

	private String description;
	
	private Author author;

	/**
	 * Constructeur par défaut
	 */
	public Article() {

	}

	/**
	 * Constructeur avec arguments pour faciliter la création d'articles de test
	 * (Mock).
	 * 
	 * @param id l'identifiant unique de l'article.
	 * @param title son titre.
	 * @param description son paragraphe de description.
	 */
	public Article(Integer id, String title, String description) {
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

}
