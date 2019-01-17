
public class Doc {
	private String doc ;
	private String id ;
	
	Doc(String doc,String id ) {
		this.doc = doc;
		this.id = id;
	}
	
	public String getDoc() {
		return doc;
	}
	
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	
	public String toString() {
		return doc+" "+id;
	}

}
