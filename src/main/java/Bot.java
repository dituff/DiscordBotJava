import commands.choiceMenu;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;




public class Bot {
    public static void main(String[] args) throws Exception {
        JDA jda = JDABuilder.createDefault("").build();

        jda.addEventListener(new choiceMenu());

    }

}
