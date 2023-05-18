import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        // Replace "YOUR_BOT_TOKEN" with your actual bot token
        JDABuilder builder = JDABuilder.createDefault("YOUR_BOT_TOKEN");
        // Set the bot's activity status
        builder.setActivity(Activity.playing("a game"));

        // Add a listener to handle events
        builder.addEventListeners(new MyEventListener());

        // Start the bot
        builder.build();
    }
}
