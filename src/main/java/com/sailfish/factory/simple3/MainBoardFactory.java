package com.sailfish.factory.simple3;

/**
 * @author sailfish
 * @create 2017-05-21-下午9:15
 */
public class MainBoardFactory {

    public static MainBoard createMainboard(int type) {
        if (type == 1) {
            return new IntelMainBoard(755);
        } else if (type == 2) {
            return new AmdMainBoard(985);
        } else {
            throw new RuntimeException("找不到指定的mainboard...");
        }
    }
}
