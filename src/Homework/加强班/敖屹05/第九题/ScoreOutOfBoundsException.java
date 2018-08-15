package Homework.加强班.敖屹05.第九题;

public class ScoreOutOfBoundsException extends RuntimeException {
    public ScoreOutOfBoundsException() {
    }

    public ScoreOutOfBoundsException(String score) {
        super(score);
    }
}
