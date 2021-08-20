package ObjectsAndClasses.Exercise;

public class Article {
    //полета -> характеристики на статията
    private String title;
    private String content;
    private String author;

    //методи ->описва функционалностите, който ще има



    //constructor-Article
    public Article(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //функционалност, която сменя content
    public void edit(String newContent){
        this.content = newContent;
    }

    //функционалност, която сменя author
    public void changeAuthor(String newAutor){
        this.author = newAutor;
    }

    //функционалност, която сменя Rename
    public void rename(String newTitle){
        this.title = newTitle;
    }

    @Override//анутация
    public String toString(){
// как искам да опиша/ да изглежда моя обект като стринг
        //"{title} - {content}:{author}"
        return this.title + " - " + this.content + ":" + this.author;
    }
}
