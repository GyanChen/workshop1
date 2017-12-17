/**************************************************************************************** 
 Copyright © 2003-2017 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.ztesoft.zsmart.bss.cvbs.tdd.puzzle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

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

public class GameProcess {
    
    private PrintStream out;
    
    private BufferedReader reader;
    
    private PuzzleNumberDto systemNumber;

    /** 
     * @param out <br>
     */ 
    public GameProcess(PrintStream out, BufferedReader reader, PuzzleNumberDto systemNumber) {
        this.out = out;
        this.reader = reader;
        this.systemNumber = systemNumber;
    }

    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @throws IOException 
     * @taskId <br> <br>
     */ 
    public void start() throws IOException {
        out.println("Welcome!");
        out.println("Please input your number(6): ");
        
        systemNumber.generateNoRepeatValue(4);
        
        String enter = reader.readLine();
        PuzzleNumberDto enterNumber = new PuzzleNumberDto(enter);
        
        String result = NumberPuzzle.validate(systemNumber, enterNumber);
        
        out.println(result);
        
        if (!"4A0B".equals(result)) {
            out.println("Please input your number(5): ");
        }
    }

}
