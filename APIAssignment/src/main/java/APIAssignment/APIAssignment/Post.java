package APIAssignment.APIAssignment;

public class Post {
	private String error_short_code;
	private String message;
	private String data;
	
	private String rating;
	private String difficulty;
	private String trainer_rating;
	private String exercise_position;
	private String timestamp;
	private String value;
	
	public String getError_short_code() {
		return error_short_code;
	}
	public String getExercise_position() {
		return exercise_position;
	}
	public void setExercise_position(String exercise_position) {
		this.exercise_position = exercise_position;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getTrainer_rating() {
		return trainer_rating;
	}
	public void setTrainer_rating(String trainer_rating) {
		this.trainer_rating = trainer_rating;
	}
	public void setError_short_code(String error_short_code) {
		this.error_short_code = error_short_code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	

}
