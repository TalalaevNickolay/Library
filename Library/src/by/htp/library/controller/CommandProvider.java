package by.htp.library.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.library.controller.command.Command;
import by.htp.library.controller.command.SignIn;
import by.htp.library.controller.command.impl.MainPage;

public class CommandProvider {

	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		
		commands.put(CommandName.MAIN_PAGE, new MainPage());
		commands.put(CommandName.SIGN_IN, new SignIn());
	}
	public Command getCommand(String commandName) {
		Command command;

        command = commands.get(CommandName.valueOf(commandName.toUpperCase()));
		
        return command;
	}
}
