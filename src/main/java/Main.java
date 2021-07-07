import computer_brand.Hp;
import computer_brand.Samsung;
import motherboard.Asrock;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import video_card.Nvidia;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Hp hp = ctx.getBean(Hp.class);

        hp.setVideoCard(ctx.getBean("Nvidia", Nvidia.class));
        hp.getVideoCard().createVideoCard();

        hp.setMotherboard(ctx.getBean("Asrock", Asrock.class));
        hp.getMotherboard().createMotherboard();

        hp.on();

        hp.off();

        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(Config.class);
        Samsung samsung = ctx2.getBean(Samsung.class);

        samsung.getMotherboard().createMotherboard();
        samsung.getVideoCard().createVideoCard();

        samsung.on();
    }

}
