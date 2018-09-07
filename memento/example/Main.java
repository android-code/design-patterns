public class Main {

	public static void main() {
		//user open writer editor and create new empty file
		DocumentManager manager = new DocumentManager();
		Document document = new Document("CV.doc");

		//user wrote some text into document
		decument.setText("Begin of the text document.");

		//user wrote more text
		document.setText("Begin of the text document. More text wrote here.");
		//autosave executed
		manager.add(document.save()); //first document snapshot

		//user change document name and wrote more text
		document.setName("CV_ENG.doc");
		document.setText("Begin of the text document. More text wrote here. And more text again.")
		//autosave executed
		manager.add(document.save()); //second document snapshot

		//user removed whole text and typed new one
		document.setText("Text wrote again.");
		//manual save executed
		manager.add(document.save()); //third document snapshot

		//after some while user decide to restore previous document snapshot
		document.restore(manager.undo());

		//user can write text and undo, redo or choose concrete document snapshot to revert state
	}
}