package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.command.visitor.CommandVisitorInterface;

import java.util.Iterator;

/**
 * Interface extending Job2dDriverCommand to execute more than one command.
 */
public interface ICompoundCommand extends DriverCommand {

	public Iterator<DriverCommand> iterator();

	default void accept(CommandVisitorInterface visitor) {
		visitor.visit(this);
	}


}
