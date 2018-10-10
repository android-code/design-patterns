public enum State {

	NONE(0),
	EMPTY_PLAYER(1),
	EVENT_ADDED(2);
	//others

	int state;

	public State(int state) {
		this.state = state;
	}
}