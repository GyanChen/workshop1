/**************************************************************************************** 
 Copyright © 2003-2017 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.ztesoft.zsmart.bss.cvbs.tdd.puzzle;

import java.io.BufferedReader;
import java.io.IOException;
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
    private BufferedReader reader;
    
    @Before
    public void setUp() throws IOException {
        out = Mockito.mock(PrintStream.class);
        
        reader = Mockito.mock(BufferedReader.class);
        
        PuzzleNumberDto systemNumber = Mockito.spy(new PuzzleNumberDto());
        
        game = new GameProcess(out, reader, systemNumber);
        
        Mockito.doNothing().when(systemNumber).generateNoRepeatValue(Mockito.anyInt());
        Mockito.when(systemNumber.getValue()).thenReturn("4321");
        Mockito.when(reader.readLine()).thenReturn("1234");
    }

    @Test
    public void should_print_welcome_when_game_start() throws IOException {
        Mockito.verify(out, Mockito.never()).println("Welcome!");
        game.start();
        Mockito.verify(out).println("Welcome!");
    }
    
    @Test
    public void should_print_please_input_after_game_start() throws IOException {
        game.start();
        InOrder inOrder = Mockito.inOrder(out);
        inOrder.verify(out).println("Welcome!");
        inOrder.verify(out).println("Please input your number(6): ");
    }
    
    @Test
    public void should_reduce_one_chance_when_guess_wrong() throws IOException {
        game.start();
        
        InOrder inOrder = Mockito.inOrder(out);        
        inOrder.verify(out).println("Welcome!");
        inOrder.verify(out).println("Please input your number(6): ");
        inOrder.verify(out).println("0A4B");
        inOrder.verify(out).println("Please input your number(5): ");
    }
    
    @Test
    public void should_reduce_chances_one_by_one_until_game_over() throws IOException {
        game.start();
        
        InOrder inOrder = Mockito.inOrder(out);        
        inOrder.verify(out).println("Welcome!");
        inOrder.verify(out).println("Please input your number(6): ");
        inOrder.verify(out).println("0A4B");
        inOrder.verify(out).println("Please input your number(5): ");
        inOrder.verify(out).println("0A4B");
        inOrder.verify(out).println("Please input your number(4): ");
        inOrder.verify(out).println("0A4B");
        inOrder.verify(out).println("Please input your number(3): ");
        inOrder.verify(out).println("0A4B");
        inOrder.verify(out).println("Please input your number(2): ");
        inOrder.verify(out).println("0A4B");
        inOrder.verify(out).println("Please input your number(1): ");
        inOrder.verify(out).println("0A4B");
        inOrder.verify(out).println("Game over");
    }

}
