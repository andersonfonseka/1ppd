package com.oneppd.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		
		List<Command> commands = new ArrayList<Command>();
		
		commands.add(new OpenCommand());
		commands.add(new InspectCommand());
		commands.add(new CloseCommand());
		
		for (Command command : commands) {
			command.execute();
		}
		
	}

}
