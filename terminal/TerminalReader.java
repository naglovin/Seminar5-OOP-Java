package terminal;

import repository.StudentRepository;
import service.StudentService;
import terminal.executable.CommandExecutable;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandExucutableFactory commandExucutableFactory;
    private CommandParser commandParser;

    public static TerminalReader getInstance(CommandParser commandParser, CommandExucutableFactory
                                                    commandExucutableFactory){
        if (terminalReader == null){
            terminalReader = new TerminalReader(commandParser, commandExucutableFactory);
        }
        return terminalReader;

    private TerminalReader(CommandParser commandParser, CommandExucutableFactory commandExucutableFactory) {
        this.commandParser = commandParser;
        this.commandExucutableFactory = commandExucutableFactory;
    }

    public void getI(int f){
        Scanner in = new Scanner(System.in);
        while (true){
        String command = in.nextLine();
        Command command1 = commandParser.parseCommand(command);
            CommandExecutableFactoryImpl commandExecutableFactor = new CommandExecutableFactoryImpl(new StudentService(new StudentRepository()));
            CommandExucutableFactory.create(command1);
            //CommandExecutable commandExecutable = commandExecutableFactor.create(command1);
            //commandExecutable.execute();
        }
    }
}
