//demo of the pattern

public class main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "help me pass exams.mp3");
        audioPlayer.play("mp4", "last year of university.mp4");
        audioPlayer.play("vlc", "i wanna break free.vlc");
        audioPlayer.play("avi", "this is wrong.avi");
    }
}