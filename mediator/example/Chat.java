public class Chat implements Mediator {

    private List<User> users;
    private Admin admin;

    public Chat() {
        this.users = new ArrayList();
    }

    public void register(User user) {
        users.add(user);
    }

    public void registerAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void send(Colleague user, Message message) {
        if(user instanceof Admin) {
            for(User recipient : users)
                recipient.receive(message.getText());
        }
        else {
            if(message.getRecipient().equals("admin"))
                admin.receive(message);
            else {
                for(User recipient : users) {
                    if(recipient.getName().equals(message.getRecipient())) {
                        recipient.receive(message);
                        break;
                    }
                } 
            }
        }
    }
}