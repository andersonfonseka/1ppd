package com.oneppd.behavioral.command;

public class InspectCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Verificando conteudo...");
	}

}
