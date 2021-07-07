
import computer_brand.Samsung;
import interfaces.Motherboard;
import interfaces.VideoCard;
import motherboard.Asus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import video_card.Radeon;

@Configuration
public class Config {

    @Bean
    public Samsung getSamsung(VideoCard videoCard, Motherboard motherboard) {
        return new Samsung(videoCard, motherboard);
    }

    @Bean
    public VideoCard getVideoCard() {
        return new Radeon();
    }

    @Bean
    public Motherboard getMotherboard() {
        return new Asus();
    }


}
