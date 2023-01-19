package terminal;

import terminal.executable.CommandExecutable;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    public static TerminalReader getInstance(CommandParser commandParser){
        if (terminalReader == null){
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;

    public TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public void getI(int f){
        Scanner in = new Scanner(System.in);
        while (true){
        String coand = in.nextLine();
        String[] cool = commandParser.parseCommand(coand);
            CommandExecutableFactor commandExecutableFactor = new CommandExecutableFactor();
            CommandExecutable commandExecutable = commandExecutableFactor.create(cool);
            commandExecutable.execute();
        }
    }
}
