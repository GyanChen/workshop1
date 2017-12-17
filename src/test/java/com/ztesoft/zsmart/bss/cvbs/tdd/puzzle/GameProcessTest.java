/**************************************************************************************** 
 Copyright © 2003-2017 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.ztesoft.zsmart.bss.cvbs.tdd.puzzle;

import java.io.PrintStream;

import org.mockito.InOrder;
import org.mockito.Mockito;
import org.junit.Before;
import org.junit.Test;

/** 
 * <Description> <br> 
 *  
 * @author chen.jian<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年12月17日 <br>
 * @since V9.0C<br>
 * @see com.ztesoft.zsmart.bss.cvbs.tdd.puzzle <br>
 */

public class GameProcessTest {
    
    private PrintStream out;
    private GameProcess game;
    
    @Before
    public void setUp() {
        out = Mockito.mock(PrintStream.class);
        game = new GameProcess(out);
    }

    @Test
    public void should_print_welcome_when_game_start() {
        Mockito.verify(out, Mockito.never()).println("Welcome!");
        game.start();
        Mockito.verify(out).println("Welcome!");
    }
    
    @Test
    public void should_print_please_input_after_game_start() {
        game.start();
        InOrder inOrder = Mockito.inOrder(out);
        inOrder.verify(out).println("Welcome!");
        inOrder.verify(out).println("Please input your number(6): ");
    }

}
