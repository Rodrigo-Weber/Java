package entities;

public class student {
	public double grades1;
	public double grades2;
	public double grades3;
	public String name;

	public double finalGrade() {
		double grades = grades1 + grades2 + grades3;
		return grades;
	}

	public String approved() {
		String result;
		if (finalGrade() > 59) {
			result = "PASS";
		} else {
			result = "FAILED";
		}
		return result;
	}

	public String minimum() {
		double minimum = 0;
		if (finalGrade() < 60) {
			minimum = 60 - finalGrade();
		}
		return "MISSING " + minimum + " POINTS";
	}
}
