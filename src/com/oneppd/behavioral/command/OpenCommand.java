package com.oneppd.behavioral.command;

public class OpenCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Abrindo a caixa...");
	}

}
