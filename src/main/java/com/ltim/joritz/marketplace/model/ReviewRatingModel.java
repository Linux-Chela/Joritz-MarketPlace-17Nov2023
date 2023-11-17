package com.ltim.joritz.marketplace.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ReviewRatingModel extends AuditableBaseModel{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="`rId`")
	private int rId;
	
	@Column(name="`rating`")
	private String rating;
	
	@Column(name="`review`")
	private int review;
	
	@Column(name="`isUserPublic`")
	private boolean isUserPublic;
	
	@Column(name="`userName`")
	private String userName;
	
	@Column(name="`userMail`")
	private String userMail;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="`artifactId`")
	private ArtifactModel artifact;

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getReview() {
		return review;
	}

	public void setReview(int review) {
		this.review = review;
	}

	public boolean isUserPublic() {
		return isUserPublic;
	}

	public void setUserPublic(boolean isUserPublic) {
		this.isUserPublic = isUserPublic;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public ArtifactModel getArtifact() {
		return artifact;
	}

	public void setArtifact(ArtifactModel artifact) {
		this.artifact = artifact;
	}

	public ReviewRatingModel(int rId, String rating, int review, boolean isUserPublic, String userName, String userMail,
			ArtifactModel artifact) {
		super();
		this.rId = rId;
		this.rating = rating;
		this.review = review;
		this.isUserPublic = isUserPublic;
		this.userName = userName;
		this.userMail = userMail;
		this.artifact = artifact;
	}

	public ReviewRatingModel() {
		super();
	}
	
	
}
