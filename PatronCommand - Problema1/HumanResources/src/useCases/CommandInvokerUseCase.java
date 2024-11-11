package useCases;

import domain.interfaces.Command;

public class CommandInvokerUseCase {
    public void executeCommand(Command command) {
        command.execute();
    }
}
