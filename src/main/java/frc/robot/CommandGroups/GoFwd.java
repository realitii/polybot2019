package frc.robot.CommandGroups;

import edu.wpi.first.wpilibj.command.CommandGroup;

import frc.robot.commands.CommandInterface;
import frc.robot.commands.Move.MoveByEncoder;
import frc.robot.commands.Move.MoveByGyro;
import frc.robot.commands.Vision.*;

public class GoFwd extends CommandGroup implements CommandInterface {
    public final double HATCH_HEIGHT = 28.5;
    public GoFwd() {
        addSequential(new TargetAlignment(0.4));
        //addSequential(new MoveToTarget(0.5));
    }
}
