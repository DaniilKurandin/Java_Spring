package computer_brand;

import interfaces.Computer;
import interfaces.Motherboard;
import interfaces.VideoCard;

public class Samsung implements Computer {
    private VideoCard videoCard;
    private Motherboard motherboard;

    public Samsung(VideoCard videoCard, Motherboard motherboard) {
        this.videoCard = videoCard;
        this.motherboard = motherboard;
    }

    public Samsung() {
    }

    @Override
    public void on() {
        System.out.println("Computer is ON");
    }

    @Override
    public void off() {
        System.out.println("Computer is OFF");
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
