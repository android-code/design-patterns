public class Request {

	private String content;
	private Type type;
	//other fields

	public Request(String content, Type type) {
		this.content = content;
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public Type getType() {
		return type;
	}

	//other methods

	public enum Type {

		TYPE1(1),
		TYPE2(2),
		TYPE3(3),
		TYPE4(4),
		TYPE5(5);
		//other types

		private int type;

		public Type(int type) {
			this.type = type;
		}
	}
}