package org.pattern.behavioral.command;


import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command{

    // 명령의 집합
    private Stack commands = new Stack<>();


    // 추가
    public void append(Command cmd) {
        if(cmd != this) {
            commands.push(cmd);
        }
    }

    // 최후의 명령을 삭제
    public void undo() {
        if(!commands.empty()) {
            commands.pop();
        }
    }

    // 전부 삭제
    public void clear() {
        commands.clear();
    }

    //실행
    @Override
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command)it.next()).execute();
        }
    }



}
