package commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.ActionRow;
import net.dv8tion.jda.api.interactions.components.selections.SelectMenu;


public class choiceMenu extends ListenerAdapter {
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("setup")) {
            event.reply("Выбери нужные варианты меню")
                    .addActionRows(ActionRow.of(
                                    SelectMenu.create("race")
                                            .setPlaceholder("Выбери гоночную серию")
                                            .addOption("VRS", "vrs", "VRS_Sprint")
                                            .addOption("IMSA", "imsa", "IMSA_Sprint")
                                            .addOption("VRS_E", "vrs_e", "VRS_Endurance")
                                            .addOption("IMSA_E", "imsa_e", "IMSA_Endurance").build()),
                            ActionRow.of(
                                    SelectMenu.create("week")
                                            .setPlaceholder("Выбери неделю")
                                            .addOption("week_1", "week1", "Первая неделя")
                                            .addOption("week_2", "week2", "Вторая неделя")
                                            .addOption("week_3", "week3", "Третья неделя")
                                            .addOption("week_4", "week4", "Четвертая неделя")
                                            .addOption("week_5", "week5", "Пятая неделя")
                                            .addOption("week_6", "week6", "Шестая неделя")
                                            .addOption("week_7", "week7", "Сельмая неделя")
                                            .addOption("week_8", "week8", "Восьмая неделя")
                                            .addOption("week_9", "week9", "Девятая неделя")
                                            .addOption("week_10", "week10", "Десятая неделя")
                                            .addOption("week_11", "week11", "Одиннадцатая неделя")
                                            .addOption("week_12", "week12", "Двенадцатая неделя")
                                            .build()).asDisabled(),
                            ActionRow.of(
                                    SelectMenu.create("cars")
                                            .setPlaceholder("Выбери Автомобиль")
                                            .addOption("Audi", "audi", "Audir8gt3")
                                            .addOption("BMW", "bmw", "BMW4gt3")
                                            .addOption("Ferrari", "ferr", "Ferrarievogt3")
                                            .addOption("Lamborghini", "lambo", "Lamborghinievogt3")
                                            .addOption("MaLaren", "mclaren", "MaLarenmp4")
                                            .addOption("Mercedes", "merc", "Mercedesamggt3")
                                            .addOption("Porsche911R", "911rgt3", "Porsche911rgt3")
                                            .addOption("Ford", "ford", "Fordgt_gt3")
                                            .addOption("DallaraP217", "p217", "DallaraP217")
                                            .build()).asDisabled()
            ).queue();
        }
    }
//    public void onSelectMenuInteraction(SelectMenuInteractionEvent event) {
  //      if(event.()){
    //        event.reply("choice" + event.getSelectedOptions().get(0)).queue();
     //   }
   // }
}




