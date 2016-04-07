package nl.hanze.CarParkSimulation.controller;

import nl.hanze.CarParkSimulation.logic.AbstractModel;
import nl.hanze.CarParkSimulation.main.CarParkSimulation;
import nl.hanze.CarParkSimulation.runner.CarParkSimulationRunner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class Controller
 *
 * @author Koen Hendriks
 * @version 0.1 (04-04-2016)
 */
public class Controller extends AbstractController implements ActionListener {
    private JLabel description;
    private JTextField input;
    private JButton startLimit;
    private JButton start;
    private JButton stop;
    public static final CarParkSimulation simulation = CarParkSimulationRunner.getSimulation();
    public static boolean running;

    /**
     * Constructor of AbstractController with a model belong to this controller
     *
     * @param model AbstractModel that belongs to this controller
     */
    public Controller(AbstractModel model) {
        super(model);
        setLayout(null);

        description = new JLabel("Insert number of steps: ");
        description.setBounds(10,15,200,20);
        add(description);

        input = new JTextField("");
        input.setBounds(10,40,75,20);
        add(input);

        startLimit = new JButton("start");
        startLimit.setBounds(110,40,70,20);
        startLimit.addActionListener(this);
        add(startLimit);

        start = new JButton("start");
        start.setBounds(410,55,70,20);
        start.addActionListener(this);
        add(start);

        stop = new JButton("stop");
        stop.setBounds(670,55,70,20);
        stop.addActionListener(this);
        add(stop);

    }

    /**
     * Boolean getter for running condition.
     * @return boolean if running
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * Boolean setter for running condition.
     * @param running running condition
     */
    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
