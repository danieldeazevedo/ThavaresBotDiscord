package thavares.bot.discord.java.main;


import net.dv8tion.jda.api.JDA;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import thavares.bot.discord.java.main.commands.PingCommand;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class BotLauncher {

    public static JDA jda;
    public static void main(String[] args) throws LoginException {


        JDABuilder jda = (JDABuilder) JDABuilder.createDefault("OTIxNTQ2ODU3Mzc5OTUwNjAz.Yb0fZA.h9tLvtQFJyQif5LvHuTVy9uWvWM");

        jda.setActivity(Activity.playing("!ping, teste meus comandos!"));
        jda.setStatus(OnlineStatus.ONLINE);
        jda.addEventListeners(new PingCommand());

        jda.build();

    }


}
