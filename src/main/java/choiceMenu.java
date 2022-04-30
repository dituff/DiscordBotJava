import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.selections.SelectMenu;

public class choiceMenu extends ListenerAdapter {
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (!event.getName().equals("race")) return;
        SelectMenu series = SelectMenu.create("series:race")
                .setPlaceholder("Выбери гоночную серию")
                .setRequiredRange(1,1)
                .addOption("VRS", "vrs", "VRS_Sprint")
                .addOption("IMSA", "imsa", "IMSA_Sprint")
                .addOption("VRS_E", "vrs_e", "VRS_Endurance")
                .addOption("IMSA_E", "imsa_e", "IMSA_Endurance")
                .build();
        event.reply("Выбери гоночную серию ниже")
                .setEphemeral(true)
                .addActionRow(series)
                .queue();
    }


}



