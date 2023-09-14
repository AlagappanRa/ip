package commands;
import components.DukeException;
import components.Storage;
import components.Ui;
import tasks.Deadline;
import tasks.TaskList;

public class DeadlineCommand extends Command {
    private String command;

    public DeadlineCommand(String command) {
        this.command = command;
    }

    @Override
    public String execute(TaskList list, Ui ui, Storage storage) throws DukeException {
        return list.addTask(new Deadline(command.substring(9)), storage);
    }
}
