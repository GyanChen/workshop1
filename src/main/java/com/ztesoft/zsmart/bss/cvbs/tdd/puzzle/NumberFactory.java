/**************************************************************************************** 
 Copyright © 2003-2017 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.ztesoft.zsmart.bss.cvbs.tdd.puzzle;

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

public abstract class NumberFactory {
    
    /**
     * puzzleNumber <br>
     */
    private static PuzzleNumberDto puzzleNumber;
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @return <br>
     */ 
    public static PuzzleNumberDto getLength4PuzzleNumber() {
        if (null == puzzleNumber) {
            puzzleNumber = new PuzzleNumberDto();
        }
        
        puzzleNumber.generateNoRepeatValue(4);
        
        return puzzleNumber;
    }

}
