package TestSystem;

public class TestQuestions {
 private String title;
 private String A;
 private String B;
 private String C;
 private String D;
 private String answer;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getA() {
	return A;
}
public void setA(String a) {
	A = a;
}
public String getB() {
	return B;
}
public void setB(String b) {
	B = b;
}
public String getC() {
	return C;
}
public void setC(String c) {
	C = c;
}
public String getD() {
	return D;
}
public void setD(String d) {
	D = d;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public TestQuestions() {
	super();
	// TODO Auto-generated constructor stub
}
public TestQuestions(String title, String a, String b, String c, String d, String answer) {
	super();
	this.title = title;
	A = a;
	B = b;
	C = c;
	D = d;
	this.answer = answer;
}
@Override
public String toString() {
	return title +"\n" +A+"\n"+B+"\n"+C+"\n"+D;
}
 
	
	
}
