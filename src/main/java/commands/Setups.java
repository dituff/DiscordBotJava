package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;


public class Setups extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String messageSent = event.getMessage().getContentRaw();
        if(messageSent.equalsIgnoreCase("setup")){
            event.getChannel().sendMessage("hi").queue();

        }
    }
}


