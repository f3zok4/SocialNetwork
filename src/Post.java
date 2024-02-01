import java.util.ArrayList;
import java.util.List;
class Post {
    private String author;
    private String content;
    private String privacySettings;
    private int likes;
    private List<String> comments;
    private boolean shared;

    public Post(String author, String content, String privacySettings) {
        this.author = author;
        this.content = content;
        this.privacySettings = privacySettings;
        this.likes = 0;
        this.comments = new ArrayList<>();
        this.shared = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getPrivacySettings() {
        return privacySettings;
    }

    public int getLikes() {
        return likes;
    }

    public List<String> getComments() {
        return comments;
    }

    public boolean isShared() {
        return shared;
    }

    public void addLike() {
        likes++;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public String share() {
        if (privacySettings.equals("public")) {
            shared = true;
            return "compartlhado com sucesso.";
        } else {
            return "Não é possível compartilhar devido às configurações de privacidade.";
        }
    }
}