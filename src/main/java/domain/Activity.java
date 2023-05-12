
package domain;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class Activity extends DomainEntity {

	private String	title;
	private String	description;
	private String	day;
	private int		maxMembers;
	private String	startTime;
	private String	endTime;
	private String	image;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getDay() {
		return this.day;
	}

	public void setDay(final String day) {
		this.day = day;
	}

	public int getMaxMembers() {
		return this.maxMembers;
	}

	public void setMaxMembers(final int maxMembers) {
		this.maxMembers = maxMembers;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(final String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(final String endTime) {
		this.endTime = endTime;
	}

	@URL
	public String getImage() {
		return this.image;
	}

	public void setImage(final String image) {
		this.image = image;
	}

}
