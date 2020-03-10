package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.subsystems.Drivetrain;
import frc.robot.mappings.DS;

public class DriveCommand extends CommandBase {
    private final Drivetrain drivetrain;

    public DriveCommand(Drivetrain subsytem) {
        drivetrain = subsytem;
        addRequirements(drivetrain);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        drivetrain.drive(DS.getGTASpeed(), DS.getTurn(), DS.getHighGear());
    }

    @Override
    public void end(boolean interrupted) {
        
    }
}