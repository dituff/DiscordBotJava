import commands.choiceMenu;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;



public class Bot {
    public static void main(String[] args) throws Exception {
        JDA jda = JDABuilder.createDefault("").addEventListeners(new choiceMenu()).build().awaitReady();
        jda.getGuildById("662030552664113184").upsertCommand("setup","test").queue();


    }

}
