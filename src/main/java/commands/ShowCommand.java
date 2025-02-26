package commands;

import components.Storage;
import components.Ui;
import tasks.TaskList;

/**
 * Represents a show command.
 */
public class ShowCommand extends Command {
    public ShowCommand() {
        super();
    }

    @Override
    public String execute(TaskList list, Ui ui, Storage storage) {
        return list.printList();
    }
}
