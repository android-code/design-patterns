public class HtmlGenerator implements FileGenerator {

    @Override
    public void createFile(Book element) {
        StringBuilder builder = new StringBuilder();
        builder.append("<html>").append("<head>");
        builder.append("<title>").append(element.getTitle()).append("</title>")
        builder.append("</head>").append("<body>");
        builder.append("<h1>").append(element.getTitle()).append("</h1>");
        builder.append("<h2>").append(element.getVolume()).append("</h2>");
        builder.append("<h3>").append(element.getAuthor()).append("</h3>");
        builder.append("<p>").append(element.getDescription()).append("</p>");
        builder.append("<p>Pages: ").append(element.getPages()).append("</p>");
        builder.append("<p>ISBN: ").append(element.getIsbn()).append("</p>");
        builder.append("</body>").append("</html>");
        String fileName = element.getTitle() + "_" + element.getVolume() + ".html";
        FileManager.write(fileName, builder.toString());
    }

    @Override
    public void createFile(Film element) {
        StringBuilder builder = new StringBuilder();
        builder.append("<html>").append("<head>");
        builder.append("<title>").append(element.getTitle()).append("</title>")
        builder.append("</head>").append("<body>");
        builder.append("<h1>").append(element.getTitle()).append("</h1>");
        builder.append("<h2>").append(element.getDirector())).append("</h2>");
        builder.append("<h3>").append(element.getScenario()).append("</h3>");
        for(Actor actor : element.getActors())
            builder.append("<h4>").append(actor.getName()).append("(").append(actor.getRole()).append(")");
        builder.append("<p>Year production: ").append(element.getYear()).append("</p>");
        builder.append("</body>").append("</html>");
        String fileName = element.getTitle() + ".html";
        FileManager.write(fileName, builder.toString());
    }

    @Override
    public void createFile(Game element) {
        StringBuilder builder = new StringBuilder();
        builder.append("<html>").append("<head>");
        builder.append("<title>").append(element.getTitle()).append("</title>")
        builder.append("</head>").append("<body>");
        builder.append("<h1>").append(element.getTitle()).append("</h1>");
        builder.append("<h2>").append(element.getProducer()).append("</h2>");
        builder.append("<p>").append(element.getDescription()).append("</p>");
        builder.append("<p>Budget: ").append(element.getBudget()).append("</p>");
        builder.append("</body>").append("</html>");
        String fileName = element.getTitle() + ".html";
        FileManager.write(fileName, builder.toString());
    }
}
