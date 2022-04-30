import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;




public class Bot {
    public static void main(String[] args) throws Exception {
        JDA jda = JDABuilder.createDefault("OTYyMDU5MjE3ODA2NzIxMDI0.YlCBdw.Tf55PCg-7ioEn8w5IoyvOdKGO94").build();

        jda.addEventListener(new choiceMenu());

    }

}
