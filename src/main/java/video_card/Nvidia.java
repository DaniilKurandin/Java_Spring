package video_card;

import interfaces.VideoCard;

public class Nvidia implements VideoCard {
    @Override
    public boolean createVideoCard() {
        System.out.println("Video card Nvidia is created");
        return true;
    }
}
