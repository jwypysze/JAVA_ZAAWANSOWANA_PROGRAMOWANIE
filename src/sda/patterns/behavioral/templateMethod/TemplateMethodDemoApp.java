package sda.patterns.behavioral.templateMethod;

public class TemplateMethodDemoApp {
    public static void main(String[] args) {
        NewsProvider newsProvider = new EmailNewsProvider("aaa@bbb.ccc");
        newsProvider.setMessage("Bardzo ważny news: kończymy na dziś!");
        newsProvider.provideNews();
    }
}
