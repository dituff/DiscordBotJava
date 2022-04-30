package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.ActionRow;
import net.dv8tion.jda.api.interactions.components.selections.SelectMenu;

public class choiceMenu extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("setup")) {
            event.getChannel().sendMessage("Выбери пункты меню")
                    .setActionRows(ActionRow.of(selectSetups()), ActionRow.of(selectWeeks()))
                    .queue();

        }
    }


    private static SelectMenu selectSetups() {
         return SelectMenu.create("race_series")
                .setPlaceholder("Выбери гоночную серию")
                .addOption("VRS", "vrs", "VRS_Sprint")
                .addOption("IMSA", "imsa", "IMSA_Sprint")
                .addOption("VRS_E", "vrs_e", "VRS_Endurance")
                .addOption("IMSA_E", "imsa_e", "IMSA_Endurance")
                .build();
    }
    private static SelectMenu selectWeeks(){
        return SelectMenu.create("race_week")
                .setPlaceholder("Выбери неделю")
                .addOption("week_1","week1","Первая неделя")
                .addOption("week_2","week2","Вторая неделя")
                .addOption("week_3","week3","Третья неделя")
                .addOption("week_4","week4","Четвертая неделя")
                .addOption("week_5","week5","Пятая неделя")
                .addOption("week_6","week6","Шестая неделя")
                .addOption("week_7","week7","Сельмая неделя")
                .addOption("week_8","week8","Восьмая неделя")
                .addOption("week_9","week9","Девятая неделя")
                .addOption("week_10","week10","Десятая неделя")
                .addOption("week_11","week11","Одиннадцатая неделя")
                .addOption("week_12","week12","Двенадцатая неделя")
                .build();

    }
}



