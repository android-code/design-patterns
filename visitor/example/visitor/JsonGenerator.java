public class JsonGenerator implements FileGenerator {

    @Override
    public void createFile(Book element) {
        StringBuilder builder = new StringBuilder();
        builder.append("{"));
        builder.append("title:").append("\"").append(element.getTitle()).append("\",");
        builder.append("volume:").append(element.getVolume()).append(",");
        builder.append("author:").append("\"").append(element.getAuthor()).append("\",");
        builder.append("description:").append("\"").append(element.getDescription()).append("\",");
        builder.append("pages:").append(element.getPages()).append(",");
        builder.append("isbn:").append("\"").append(element.getIsbn()).append("\"};");
        String fileName = element.getTitle() + "_" + element.getVolume() + ".json";
        FileManager.write(fileName, builder.toString());
    }

    @Override
    public void createFile(Film element) {
        StringBuilder builder = new StringBuilder();
        builder.append("{"));
        builder.append("title:").append("\"").append(element.getTitle()).append("\",");
        builder.append("director:").append("\"").append(element.getDirector()).append("\",");
        builder.append("scenario:").append("\"").append(element.getScenario()).append("\",");
        builder.append("actors:").append("[");
        for(int i=0; i<=element.getActors().size()-1; i++) {
            builder.append("\"").append(actor.getName() + "(" + actor.getRole() + ")").append("\"")
            if(i != element.getActors().size()-1)
                builder.append(",");
        }
        builder.append("],")
        builder.append("year:").append(element.getYear()).append("};");
        String fileName = element.getTitle() + ".json";
        FileManager.write(fileName, builder.toString());
    }

    @Override
    public void createFile(Game element) {
        StringBuilder builder = new StringBuilder();
        builder.append("{"));
        builder.append("title:").append("\"").append(element.getTitle()).append("\",");
        builder.append("producer:").append("\"").append(element.getProducer()).append("\",");
        builder.append("description:").append("\"").append(element.getDescription()).append("\",");
        builder.append("budget:").append(element.getBudget()).append("};");
        String fileName = element.getTitle() + "_" + element.getVolume() + ".json";
        FileManager.write(fileName, builder.toString());
    }
}