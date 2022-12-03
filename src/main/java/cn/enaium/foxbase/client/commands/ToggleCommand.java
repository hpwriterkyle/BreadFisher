package cn.enaium.foxbase.client.commands;

import cn.enaium.cf4m.CF4M;
import cn.enaium.cf4m.annotation.command.Command;
import cn.enaium.cf4m.annotation.command.Exec;
import cn.enaium.cf4m.annotation.command.Param;
/**
 * Project: FoxBase
 * -----------------------------------------------------------
 * Copyright © 2020-2021 | Enaium | All rights reserved.
 */
@Command({"t", "toggle"})
public class ToggleCommand {
    @Exec
    private void exec(@Param("module") String name) {
        Object module = CF4M.INSTANCE.module.getModule(name);

        if (module == null) {
            CF4M.INSTANCE.configuration.message("The module with the name " + name + " does not exist.");
            return;
        }

        CF4M.INSTANCE.module.enable(module);
    }
}
