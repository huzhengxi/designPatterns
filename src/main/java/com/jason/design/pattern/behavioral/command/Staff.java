package com.jason.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tiger.HU
 * @date 2021年10月06日 10:56 下午
 */
public class Staff {

  private List<Command> commandList = new ArrayList<>();

  public void addCommand(Command command) {
    commandList.add(command);
  }

  public void executeCommands() {
    for (Command command : commandList) {
      command.execute();
    }
    commandList.clear();
  }
}
