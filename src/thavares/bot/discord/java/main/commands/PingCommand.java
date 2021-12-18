package thavares.bot.discord.java.main.commands;

import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;


public class PingCommand extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {

        String[] args = event.getMessage().getContentRaw().split("");
        TextChannel textChannel = event.getChannel();

        if (args[0].equalsIgnoreCase("!" + "ping")) {

            textChannel.sendMessage("Pong").queue();


        }
    }
}