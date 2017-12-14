/**************************************************************************************** 
 Copyright © 2003-2017 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.ztesoft.zsmart.bss.cvbs.tdd.puzzle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 
 * <Description> <br> 
 *  
 * @author chen.jian<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年12月14日 <br>
 * @since V9.0C<br>
 * @see com.ztesoft.zsmart.bss.cvbs.tdd.puzzle <br>
 */

public class App {
    
    public static void main(String[] args) throws IOException {
        PuzzleNumberDto systemNumber = NumberFactory.getLength4PuzzleNumber();
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        String enter = "";
        
        while ((enter = bufferReader.readLine()) != null) {
            if (enter.equalsIgnoreCase("Y")) {
                systemNumber = NumberFactory.getLength4PuzzleNumber();
                continue;
            }
            
            if (enter.equalsIgnoreCase("N")) {
                break;
            }
            
            if (enter.equalsIgnoreCase("quit")) {
                System.out.println("Correct number is: " + systemNumber.getValue());
                break;
            }
            
            PuzzleNumberDto enterNumber = new PuzzleNumberDto(enter);
            
            String result = NumberPuzzle.validate(systemNumber, enterNumber);
            System.out.println(result);
            System.out.println();
            
            if (systemNumber.equals(enterNumber)) {
                System.out.println("Congratulations! Continue?");
                System.out.println();
            }
        }
    }

}
