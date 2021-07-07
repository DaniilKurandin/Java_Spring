package video_card;

import interfaces.VideoCard;

public class Radeon implements VideoCard {
    @Override
    public boolean createVideoCard() {
        System.out.println("Video card Radeon is created");
        return true;
    }
}
