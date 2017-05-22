package com.sailfish.factory.simple3;

/**
 * @author sailfish
 * @create 2017-05-21-下午9:18
 */
public class ComputerEngineer {

    /**
     * 定义组装机需要的CPU
     */
    private Cpu cpu = null;
    /**
     * 定义组装机需要的主板
     */
    private MainBoard mainBoard = null;

    public void makeComputer(int cpuType, int mainboard) {
        /**
         * 组装机器的基本步骤
         */
        //1:首先准备好装机所需要的配件
        prepareHardwares(cpuType, mainboard);
        //2:组装机器
        //3:测试机器
        //4：交付客户
    }

    public void prepareHardwares(int cpuType, int mainboard) {

        cpu = CpuFactory.createCpu(cpuType);
        mainBoard = MainBoardFactory.createMainboard(mainboard);

        this.cpu.calculate();
        this.mainBoard.installCPU();
    }
}
