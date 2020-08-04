package com.oneppd.behavioral.command;

public class CloseCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Fechando a caixa...");
	}

}
