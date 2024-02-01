public class Main {
    public static void main(String[] args) {
        ImagePost imagePost = new ImagePost("UserA", "image.jpg", "public");
        VideoPost videoPost = new VideoPost("UserB", "video.mp4", "private");
        TextPost textPost = new TextPost("UserC", "Hello, world!", "public");

        imagePost.addLike();
        videoPost.addComment("Que video dahora!");
        textPost.addLike();
        textPost.addComment("post baum em fiote!");

        System.out.println(imagePost.getLikes());  // Output: 1
        System.out.println(videoPost.getComments());  // Output: "post baum em fiote!"
        System.out.println(textPost.getLikes());  // Output: 1
        System.out.println(textPost.getComments());  // Output: "Que video dahora!"

        System.out.println(imagePost.share());  // Output: compartlhado com sucesso.
        System.out.println(videoPost.share());  // Output: Não é possível compartilhar devido às configurações de privacidade.
    }
}